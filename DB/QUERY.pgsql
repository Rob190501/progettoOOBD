SELECT *
FROM corso;

SELECT *
FROM lezione;

delete from lezione
where codice_lezione = 13;

select titolo_lezione, descrizione_lezione, durata_lezione, data_inizio  at time zone 'cest', codice_corso
from lezione;

select durata_lezione + data_inizio  at time zone 'cest', codice_corso
from lezione;

SELECT *
FROM area_tematica;

SELECT *
FROM area_del_corso;

SELECT *
FROM presenze;

DELETE
from presenze
where matricola = 3 AND codice_lezione = 15;

SELECT *
FROM studente;

update studente
set nome = 'mario', cognome = 'rossi'
where matricola = 3;

SELECT *
FROM studenti_del_corso;

/*Seleziona tutte le informazioni relative alle presenze di un determinato studente*/
SELECT *
FROM studente INNER JOIN (lezione INNER JOIN presenze
                          ON lezione.codice_lezione = presenze.codice_lezione)
     ON studente.matricola = presenze.matricola
WHERE studente.matricola = 0;


/*Seleziona il nome del corso e il nome dell'area tematica di tutti i corsi
che hanno almeno un'area tematica*/
SELECT corso.codice_corso, corso.nome_corso, area_tematica.nome_area_tematica
FROM corso, area_tematica, area_del_corso
WHERE corso.codice_corso = area_del_corso.codice_corso AND
      area_tematica.codice_area_tematica = area_del_corso.codice_area_tematica
ORDER BY corso.codice_corso;

/*Seleziona il nome del corso con tutte le informazioni relative alle sue aree
tematiche, lasciando nei risultati anche i corsi sprovvisti di aree tematiche*/
SELECT corso.nome_corso, area_tematica.codice_area_tematica, area_tematica.nome_area_tematica, area_tematica.descrizione_area_tematica
FROM corso LEFT JOIN area_del_corso
     ON corso.codice_corso = area_del_corso.codice_corso left join area_tematica
     ON area_tematica.codice_area_tematica = area_del_corso.codice_area_tematica
ORDER BY corso.codice_corso;