INSERTT INTO corso (nome_corso, descrizione_corso, tasso_presenze_min, partecipanti_max) VALUES
('Enformatica', 'Si studia informatica', 50, 150),
('enformatica', 'Si studia matematica', 50, 150);

INSERTT INTO area_tematica (nome_area_tematica, descrizione_area_tematica) VALUES
('Informatica', 'Area di informatica'),
('Matematica', 'Area di matematica'),
('Medicina', 'Area di medicina');

INSERT INTO area_del_corso (codice_area_tematica, codice_corso ) VALUES
(0, 0),
(2, 1),
(0, 3),
(3, 0);

INSERT INTO studente (nome, cognome) VALUES
('Roberto', 'Ambrosino'),
('Mario', 'Rossi'),
('Lucia', 'Gialli');

INSERT INTO studenti_del_corso (matricola, codice_corso) VALUES
(0, 0),
(0, 1);

INSERT INTO presenze (matricola, codice_lezione) VALUES
(14, 0);
(0, 0);

INSERT INTO lezione (titolo_lezione, descrizione_lezione, durata_lezione, data_inizio, ora_inizio, codice_corso) VALUES
('Lezione 1', 'Lezione di presentazione', '02:00:00', '17-09-2021', '09:00:00', 0),
('Lezione 1', 'Lezione di presentazione del corso di Matematica', '02:00:00', '2021-09-17', '11:00:00', 1);

DELETE FROM studente
WHERE matricola = 6;