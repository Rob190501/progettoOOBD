INSERT INTO corsi (nome, descrizione, tasso_presenze_min, partecipanti_max) VALUES
('Informatica', 'Si studia informatica', 75, 5),
('Matematica', 'Si studia matematica', 50, 10),
('Medicina', 'Si studia medicina', 100, 2),
('Giurisprudenza', 'Si studia giurisprudenza', 0, 5);

INSERT INTO lezioni (titolo, descrizione, durata, data_inizio, codice_corso) VALUES
('Lezione 0', 'Lezione di presentazione del corso di informatica', '02:00:00', '2021-09-17 09:00:00', 0),
('Lezione 1', 'Programmazione', '02:00:00', '2021-09-18 09:00:00', 0),
('Lezione 1', 'Introduzione al corso di medicina', '02:00:00', '2021-09-17 11:00:00', 2),
('Lezione 1', 'Prima lezione matematica', '02:00:00', '2021-09-17 16:00:00', 1),
('Lezione 1', 'Inizio lezioni giurisprudenza', '02:30:00', '2021-09-17 18:00:00', 3);

INSERT INTO aree_tematiche (nome, descrizione) VALUES
('Scienze', 'Corsi scientifici'),
('Legge', 'Corsi di giurisprudenza'),
('Medicina', 'Corsi di medicina');

INSERT INTO studenti (nome, cognome) VALUES
('Roberto', 'Ambrosino'),
('Sadman', 'Ahmed'),
('Mario', 'Rossi'),
('Lucia', 'Gialli');

INSERT INTO aree_dei_corsi (codice_area_tematica, codice_corso ) VALUES
(0, 0),
(0, 1),
(2, 2),
(1, 3);

INSERT INTO iscrizioni (matricola, codice_corso) VALUES
(0, 0),
(1, 0),
(2, 2),
(3, 2);

INSERT INTO presenze (matricola, codice_lezione) VALUES
(0, 0),
(0, 1),
(1, 0),
(1, 1),
(2, 2),
(3, 2);