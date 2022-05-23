CREATE DATABASE corsi_di_formazione;

CREATE TABLE corso (
    codice_corso INTEGER GENERATED ALWAYS AS IDENTITY
                         (START WITH 0
                          INCREMENT BY 1
                          MINVALUE 0),
    nome_corso VARCHAR (200) NOT NULL,
    descrizione_corso VARCHAR (200) NOT NULL,
    tasso_presenze_min INTEGER NOT NULL,
    partecipanti_max INTEGER NOT NULL,

    CONSTRAINT pk_corso PRIMARY KEY (codice_corso)
);

CREATE TABLE area_tematica (
    codice_area_tematica INTEGER GENERATED ALWAYS AS IDENTITY
                                 (START WITH 0
                                  INCREMENT BY 1
                                  MINVALUE 0),
    nome_area_tematica VARCHAR (200) NOT NULL,
    descrizione_area_tematica VARCHAR (200) NOT NULL,

    CONSTRAINT pk_area_tematica PRIMARY KEY (codice_area_tematica)
);

CREATE TABLE lezione (
    codice_lezione INTEGER GENERATED ALWAYS AS IDENTITY
                           (START WITH 0
                            INCREMENT BY 1
                            MINVALUE 0),
    titolo_lezione VARCHAR (200) NOT NULL,
    descrizione_lezione VARCHAR (300) NOT NULL,
    durata_lezione TIME NOT NULL,
    data_inizio DATE NOT NULL,
    ora_inizio TIME NOT NULL,
    codice_corso INTEGER NOT NULL,

    CONSTRAINT pk_lezione PRIMARY KEY (codice_lezione),

    CONSTRAINT fk_corso_della_lezione FOREIGN KEY (codice_corso)
    REFERENCES corso (codice_corso)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

alter table lezione
alter column data_inizio TYPE TIMESTAMP WITH TIME ZONE;

CREATE TABLE studente (
    matricola INTEGER GENERATED ALWAYS AS IDENTITY
                      (START WITH 0
                       INCREMENT BY 1
                       MINVALUE 0),
    nome VARCHAR (200) NOT NULL,
    cognome VARCHAR (200) NOT  NULL,

    CONSTRAINT pk_studente PRIMARY KEY (matricola)
);

CREATE TABLE area_del_corso (
    codice_area_tematica INTEGER NOT NULL,
    codice_corso INTEGER NOT NULL,

    CONSTRAINT fk_adc_codice_area_tematica FOREIGN KEY (codice_area_tematica)
    REFERENCES area_tematica (codice_area_tematica)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT fk_adc_codice_corso FOREIGN KEY (codice_corso)
    REFERENCES corso (codice_corso)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT unica_tupla_adc UNIQUE (codice_area_tematica, codice_corso)
);

CREATE TABLE studenti_del_corso (
    matricola INTEGER NOT NULL,
    codice_corso INTEGER NOT NULL,    

    CONSTRAINT fk_sdc_matricola FOREIGN KEY (matricola)
    REFERENCES studente (matricola)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT fk_sdc_codice_corso FOREIGN KEY (codice_corso)
    REFERENCES corso (codice_corso)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT unica_tupla_sdc UNIQUE (matricola, codice_corso)
);

CREATE TABLE presenze (
    matricola INTEGER NOT NULL,
    codice_lezione INTEGER NOT NULL,

    CONSTRAINT fk_sal_matricola FOREIGN KEY (matricola)
    REFERENCES studente (matricola)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT fk_sal_codice_lezione FOREIGN KEY (codice_lezione)
    REFERENCES lezione (codice_lezione)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT unica_tupla_sal UNIQUE (matricola, codice_lezione)
);