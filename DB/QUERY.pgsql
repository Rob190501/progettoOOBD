SELECT *
FROM corso;

SELECT *
FROM lezione;

SELECT *
FROM area_tematica;

SELECT *
FROM area_del_corso;

SELECT *
FROM studente;

/*Seleziona tutte le informazioni relative alle presenze di un determinato studente*/
SELECT *
FROM studente INNER JOIN (lezione INNER JOIN presenze
                          ON lezione.codice_lezione = presenze.codice_lezione)
     ON studente.matricola = presenze.matricola
WHERE studente.matricola = 0;


/*Seleziona il nome del corso e il nome dell'area tematica di tutti i corsi
che hanno almeno un'area tematica*/
SELECT nome_corso, nome_area_tematica
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