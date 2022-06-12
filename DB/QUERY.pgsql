SELECT *
FROM corsi;

SELECT *
FROM lezioni;

delete from lezioni
where codice = 13;

select titolo, descrizione, durata, data_inizio  at time zone 'cest', codice_corso
from lezioni;

select durata + data_inizio  at time zone 'cest', codice_corso
from lezioni;

SELECT *
FROM aree_tematiche;

SELECT *
FROM aree_dei_corsi;

SELECT *
FROM presenze;

DELETE
from presenze
where matricola = 3 AND codice_lezione = 15;

SELECT *
FROM studenti;

update studenti
set nome = 'mario', cognome = 'rossi'
where matricola = 3;

SELECT *
FROM iscrizioni;

/*Seleziona tutte le informazioni relative alle presenze di un determinato studente*/
SELECT *
FROM studenti INNER JOIN (lezioni INNER JOIN presenze
                          ON lezioni.codice = presenze.codice_lezione)
     ON studenti.matricola = presenze.matricola
WHERE studenti.matricola = 0;


/*Seleziona il nome del corso e il nome dell'area tematica di tutti i corsi
che hanno almeno un'area tematica*/
SELECT corsi.codice, corsi.nome, aree_tematiche.nome
FROM corsi, aree_tematiche, aree_dei_corsi
WHERE corsi.codice = aree_dei_corsi.codice_corso AND
      aree_tematiche.codice = aree_dei_corsi.codice_area_tematica
ORDER BY corsi.codice;

/*Seleziona il nome del corso con tutte le informazioni relative alle sue aree
tematiche, lasciando nei risultati anche i corsi sprovvisti di aree tematiche*/
SELECT corsi.nome, aree_tematiche.codice, aree_tematiche.nome, aree_tematiche.descrizione
FROM corsi LEFT JOIN aree_dei_corsi
     ON corsi.codice = aree_dei_corsi.codice_corso left join aree_tematiche
     ON aree_tematiche.codice = aree_dei_corsi.codice_area_tematica
ORDER BY corsi.codice;