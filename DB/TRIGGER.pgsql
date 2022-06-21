/*trigger che si attiva ad ogni insert
sulla tabella iscrizioni*/
CREATE OR REPLACE TRIGGER nuova_iscrizione
BEFORE INSERT
ON iscrizioni
FOR EACH ROW
EXECUTE FUNCTION controlla_disponibilita();

/*il trigger precedente chiama la function controlla_disponibilità,
che controlla, ad ogni chimata, se il numero di iscritti al corso al
quale si vuole iscrivere un nuovo studente è inferiore al numero
massimo di partecipanti di quel corso. L'inser viene autorizzato solo
se il numero di iscritti di un corso è inferiore al numero massimo
di iscritti di quel corso, altrimenti viene sollevata un'eccezione*/
CREATE OR REPLACE FUNCTION controlla_disponibilita() RETURNS TRIGGER AS
$$
BEGIN
    IF (SELECT count(*)
        FROM iscrizioni
        WHERE codice_corso = NEW.codice_corso) < (SELECT partecipanti_max
                                                  FROM corsi
                                                  WHERE codice = NEW.codice_corso)
    THEN
        RETURN NEW;
    ELSE
        RAISE EXCEPTION 'Posti liberi insufficienti';
    END IF;
END;
$$ LANGUAGE plpgsql


/*trigger che si attiva ad ogni insert
sulla tabella presenze*/
CREATE OR REPLACE TRIGGER nuova_presenza
BEFORE INSERT
ON presenze
FOR EACH ROW
EXECUTE FUNCTION controlla_iscrizione();

/*il trigger precedente chiama la function controlla_iscrizione, che controlla
l'iscrizione dello studente del quale si vuole inserire una nuova presenza, al
corso al quale appartiene la lezione. Questa verifica viene fatta verificando che
esista almeno una riga nella tabella iscrizioni, che abbia come matricola la matricola
dello studente di cui vogliamo inserire la presenza e che abbia come codice_corso
il codice_corso della lezione della quale stiamo inserendo una presenza*/
CREATE OR REPLACE FUNCTION controlla_iscrizione() RETURNS TRIGGER AS
$$
BEGIN
    IF (SELECT COUNT(*)
        FROM iscrizioni
        WHERE matricola = NEW.matricola AND codice_corso = (SELECT codice_corso
                                                            FROM lezioni
                                                            WHERE codice = NEW.codice_lezione)) > 0
    THEN
        RETURN NEW;
    ELSE
        RAISE EXCEPTION 'Studente non iscritto al corso della lezione';
    END IF;
END;
$$ LANGUAGE plpgsql


/*trigger che si attiva ad ogni delete
sulla tabella iscrizioni*/
CREATE OR REPLACE TRIGGER disiscrizione
BEFORE DELETE
ON iscrizioni
FOR EACH ROW
EXECUTE FUNCTION rimuovi_presenze();

/*il trigger precedente chiama la function rimuovi_presenze, che
ha lo scopo di rimuovere tutte le presenze degli studenti presenti
alle lezioni del corso appena eliminato*/
CREATE OR REPLACE FUNCTION rimuovi_presenze() RETURNS TRIGGER AS
$$
BEGIN
    DELETE
    FROM presenze
    WHERE matricola = OLD.matricola AND codice_lezione IN (SELECT codice
                                                           FROM lezioni
                                                           WHERE codice_corso = OLD.codice_corso);
    RETURN OLD;
END;
$$ LANGUAGE plpgsql


/*trigger che si attiva ad ogni update
sulla tabella corso*/
CREATE OR REPLACE TRIGGER update_corso
BEFORE UPDATE
ON corsi
FOR EACH ROW
EXECUTE FUNCTION controlla_partecipanti_max();

/*il trigger precedente chiama la function controlla_partecipanti_max, che
controlla che il nuovo valore del campo partecipanti_max sia uguale o superiore
del numero di studenti iscritti presenti nella tabella iscrizioni. Se il nuovo
valore fosse inferiore al numero di iscritti, verrebbe sollevata un eccezione
e verrebbe bloccato l'update*/
CREATE OR REPLACE FUNCTION controlla_partecipanti_max() RETURNS TRIGGER AS
$$
BEGIN
    IF (SELECT COUNT(*)
        FROM iscrizioni
        WHERE codice_corso = NEW.codice) > NEW.partecipanti_max
    THEN
        RAISE EXCEPTION 'Nuovo numero massimo di partecipanti inferiore al numero di partecipanti attuali';
    ELSE
        RETURN NEW;
    END IF;
END;
$$ LANGUAGE plpgsql



/*trigger che si attiva ad ogni update
sulla tabella presenze*/
CREATE OR REPLACE TRIGGER update_presenza
BEFORE UPDATE
ON presenze
FOR EACH ROW
EXECUTE FUNCTION vieta_aggiornamento_presenza();

/*il trigger precedente chiama la function vieta_aggiornamento_presenza, che
impedirà di aggiornare le righe della tabella presenze, per evitare
che si possa marcare la presenza di uno studente ad una lezione di un corso
che non frequenta*/
CREATE OR REPLACE FUNCTION vieta_aggiornamento_presenza() RETURNS TRIGGER AS
$$
BEGIN
    RAISE EXCEPTION 'Impossibile aggiornare una riga della tabella presenze.';
END;
$$ LANGUAGE plpgsql



/*trigger che si attiva ad ogni update
sulla tabella iscrizioni*/
CREATE OR REPLACE TRIGGER update_iscrizione
BEFORE UPDATE
ON iscrizioni
FOR EACH ROW
EXECUTE FUNCTION vieta_aggiornamento_iscrizione();

/*il trigger precedente chiama la function vieta_aggiornamento_iscrizioni, che
impedirà di aggiornare le righe della tabella iscrizioni, per evitare
che si possa iscrivere uno studente ad un corso al completo*/
CREATE OR REPLACE FUNCTION vieta_aggiornamento_iscrizione() RETURNS TRIGGER AS
$$
BEGIN
    RAISE EXCEPTION 'Impossibile aggiornare una riga della tabella iscrizioni.';
END;
$$ LANGUAGE plpgsql



/*trigger che si attiva ad ogni update
sulla tabella lezioni*/
CREATE OR REPLACE TRIGGER update_lezione
BEFORE UPDATE
ON lezioni
FOR EACH ROW
EXECUTE FUNCTION vieta_aggiornamento_corso_della_lezione();

/*il trigger precedente chiama la function vieta_aggiornamento_corso_della_lezione,
che impedirà di aggiornare il corso di una lezione per evitare che una lezione
possa essere frequentata da studenti non iscritti a quel corso*/
CREATE OR REPLACE FUNCTION vieta_aggiornamento_corso_della_lezione() RETURNS TRIGGER AS
$$
BEGIN
    IF (NEW.codice_corso) <> (OLD.codice_corso)
    THEN
        RAISE EXCEPTION 'Impossibile cambiare il corso di una lezione.';
    ELSE
        RETURN NEW;
    END IF;
END;
$$ LANGUAGE plpgsql