CREATE DATABASE corsi_di_formazione;

CREATE TABLE corso (
    nome_corso VARCHAR (200),
    descrizione_corso VARCHAR (200) NOT NULL,
    tasso_presenze_min INTEGER NOT NULL,
    partecipanti_max INTEGER NOT NULL,

    CONSTRAINT pk_corso PRIMARY KEY (nome_corso)
);

CREATE TABLE area_tematica (
    nome_area VARCHAR (200),

    CONSTRAINT pk_area PRIMARY KEY (nome_area)
);

CREATE TABLE lezione (
    titolo_lezione VARCHAR (200),
    descrizione_lezione VARCHAR (300) NOT NULL,
    durata_lezione TIME NOT NULL,
    data_inizio DATE NOT NULL,
    ora_inizio TIME NOT NULL,

    CONSTRAINT pk_lezione PRIMARY KEY (titolo_lezione)
);

CREATE TABLE studente (
    matricola INTEGER GENERATED ALWAYS AS IDENTITY
                      (START WITH 0
                       INCREMENT BY 1
                       MINVALUE 0),
    nome VARCHAR (200) NOT NULL,
    cognome VARCHAR (200) NOT  NULL,

    CONSTRAINT pk_studente PRIMARY KEY (matricola)
);

CREATE TABLE lezioni_del_corso (
    nome_corso VARCHAR (200) NOT NULL,
    titolo_lezione VARCHAR (200) NOT NULL,

    CONSTRAINT fk_ldc_nome_corso FOREIGN KEY (nome_corso) REFERENCES corso (nome_corso)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT fk_ldc_titolo_lezione FOREIGN KEY (titolo_lezione) REFERENCES lezione (titolo_lezione)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE area_del_corso (
    nome_corso VARCHAR (200) NOT NULL,
    nome_area VARCHAR (200),

    CONSTRAINT fk_adc_nome_corso FOREIGN KEY (nome_corso) REFERENCES corso (nome_corso)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT fk_adc_nome_area FOREIGN KEY (nome_area) REFERENCES area_tematica (nome_area)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE studenti_del_corso (
    nome_corso VARCHAR (200) NOT NULL,
    matricola INTEGER NOT NULL,

    CONSTRAINT fk_sdc_nome_corso FOREIGN KEY (nome_corso) REFERENCES corso (nome_corso)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT fk_sdc_matricola FOREIGN KEY (matricola) REFERENCES studente (matricola)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE studenti_a_lezione (
    titolo_lezione VARCHAR (200) NOT NULL,
    matricola INTEGER NOT NULL,

    CONSTRAINT fk_sal_titolo_lezione FOREIGN KEY (titolo_lezione) REFERENCES lezione (titolo_lezione)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    CONSTRAINT fk_sal_matricola FOREIGN KEY (matricola) REFERENCES studente (matricola)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);