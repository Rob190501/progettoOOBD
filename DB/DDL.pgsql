CREATE DATABASE corsi_di_formazione;

CREATE TABLE corsi (
    codice INTEGER GENERATED ALWAYS AS IDENTITY
                            (START WITH 0
                             INCREMENT BY 1
                             MINVALUE 0),
    nome VARCHAR (200) NOT NULL,
    descrizione VARCHAR (200) NOT NULL,
    tasso_presenze_min INTEGER NOT NULL,
    partecipanti_max INTEGER NOT NULL,

    CONSTRAINT pk_corso PRIMARY KEY (codice),

    CONSTRAINT controllo_tasso_presenze
    CHECK (tasso_presenze_min >= 0 AND tasso_presenze_min <=100),

    CONSTRAINT controllo_partecipanti_max
    CHECK (partecipanti_max >= 0)
);

CREATE TABLE aree_tematiche (
    codice INTEGER GENERATED ALWAYS AS IDENTITY
                            (START WITH 0
                             INCREMENT BY 1
                             MINVALUE 0),
    nome VARCHAR (200) NOT NULL,
    descrizione VARCHAR (200) NOT NULL,

    CONSTRAINT pk_area_tematica PRIMARY KEY (codice)
);

CREATE TABLE lezioni (
    codice INTEGER GENERATED ALWAYS AS IDENTITY
                            (START WITH 0
                             INCREMENT BY 1
                             MINVALUE 0),
    titolo VARCHAR (200) NOT NULL,
    descrizione VARCHAR (300) NOT NULL,
    durata INTERVAL NOT NULL,
    data_inizio TIMESTAMP WITH TIME ZONE NOT NULL,
    codice_corso INTEGER NOT NULL,

    CONSTRAINT pk_lezione PRIMARY KEY (codice),

    CONSTRAINT fk_corso_della_lezione FOREIGN KEY (codice_corso)
    REFERENCES corsi (codice)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE studenti (
    matricola INTEGER GENERATED ALWAYS AS IDENTITY
                      (START WITH 0
                       INCREMENT BY 1
                       MINVALUE 0),
    nome VARCHAR (200) NOT NULL,
    cognome VARCHAR (200) NOT  NULL,

    CONSTRAINT pk_studente PRIMARY KEY (matricola)
);

CREATE TABLE aree_dei_corsi (
    codice_area_tematica INTEGER NOT NULL,
    codice_corso INTEGER NOT NULL,

    CONSTRAINT fk_adc_codice_area_tematica FOREIGN KEY (codice_area_tematica)
    REFERENCES aree_tematiche (codice)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT fk_adc_codice_corso FOREIGN KEY (codice_corso)
    REFERENCES corsi (codice)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT unica_tupla_adc UNIQUE (codice_area_tematica, codice_corso)
);

CREATE TABLE iscrizioni (
    matricola INTEGER NOT NULL,
    codice_corso INTEGER NOT NULL,    

    CONSTRAINT fk_iscrizioni_matricola FOREIGN KEY (matricola)
    REFERENCES studenti (matricola)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT fk_iscrizioni_codice_corso FOREIGN KEY (codice_corso)
    REFERENCES corsi (codice)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT unica_tupla_iscrizioni UNIQUE (matricola, codice_corso)
);

CREATE TABLE presenze (
    matricola INTEGER NOT NULL,
    codice_lezione INTEGER NOT NULL,

    CONSTRAINT fk_presenze_matricola FOREIGN KEY (matricola)
    REFERENCES studenti (matricola)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT fk_presenze_codice_lezione FOREIGN KEY (codice_lezione)
    REFERENCES lezioni (codice)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT unica_tupla_presenze UNIQUE (matricola, codice_lezione)
);