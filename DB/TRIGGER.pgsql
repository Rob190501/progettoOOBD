CREATE OR REPLACE TRIGGER nuova_iscrizione
BEFORE INSERT
ON iscrizioni
FOR EACH ROW
EXECUTE FUNCTION controlla_disponibilita();

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



CREATE OR REPLACE TRIGGER nuova_presenza
BEFORE INSERT
ON presenze
FOR EACH ROW
EXECUTE FUNCTION controlla_iscrizione();

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



CREATE OR REPLACE TRIGGER disiscrizione
BEFORE DELETE
ON iscrizioni
FOR EACH ROW
EXECUTE FUNCTION rimuovi_presenze();

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



CREATE OR REPLACE TRIGGER update_corso
BEFORE UPDATE
ON corsi
FOR EACH ROW
EXECUTE FUNCTION controlla_partecipanti_max();

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