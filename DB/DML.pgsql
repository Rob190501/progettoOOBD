INSERT INTO corso (nome_corso, descrizione_corso, tasso_presenze_min, partecipanti_max) VALUES
('Informatica', 'Si studia informatica', 50, 3),
('Matematica', 'Si studia matematica', 50, 10);

INSERT INTO area_tematica (nome_area_tematica, descrizione_area_tematica) VALUES
('Informatica', 'Area di informatica'),
('Matematica', 'Area di matematica'),
('Medicina', 'Area di medicina');

INSERT INTO area_del_corso (codice_area_tematica, codice_corso ) VALUES
(0, 5);

INSERT INTO studente (nome, cognome) VALUES
('Roberto', 'Ambrosino'),
('Mario', 'Rossi'),
('Lucia', 'Gialli');

INSERT INTO studenti_del_corso (matricola, codice_corso) VALUES
(0, 0),
(0, 1);

INSERT INTO presenze (matricola, codice_lezione) VALUES
(3, 15);

INSERT INTO lezione (titolo_lezione, descrizione_lezione, durata_lezione, data_inizio, codice_corso) VALUES
/*('Lezione 1', 'Lezione di presentazione', '02:00:00', '2021-09-17 09:00:00', 4),
('Lezione 2', 'Introduzione', '02:00:00', '2021-09-17 11:00:00', 4),
('Lezione 3', 'Spiegazione', '02:00:00', '2021-09-17 16:00:00', 4),
('Lezione 4', 'Spiegazione 2', '02:30:00', '2021-09-17 18:00:00', 4)*/
('Lezione 1', 'Lezione di presentazione', '02:30', '2021-09-17 18:00:00 UTC', 5);

delete from lezione
where codice_lezione = 14;