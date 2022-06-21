CREATE DATABASE corsi_di_formazione;

/*Creazione tabella corsi*/
CREATE TABLE corsi (
    /*definiziione attributi*/
    codice INTEGER GENERATED ALWAYS AS IDENTITY
                            (START WITH 0
                             INCREMENT BY 1
                             MINVALUE 0),
    nome VARCHAR (200) NOT NULL,
    descrizione VARCHAR (200) NOT NULL,
    tasso_presenze_min INTEGER NOT NULL,
    partecipanti_max INTEGER NOT NULL,

    /*Vincolo di chiave primaria*/
    CONSTRAINT pk_corso PRIMARY KEY (codice),

    /*L’attributo corsi.tasso_presenze_min deve essere >=0 e <=100*/
    CONSTRAINT controllo_tasso_presenze
    CHECK (tasso_presenze_min >= 0 AND tasso_presenze_min <=100),
    
    /*L’attributo corsi.partecipanti_max deve essere >=0*/
    CONSTRAINT controllo_partecipanti_max
    CHECK (partecipanti_max >= 0)
);

/*Creazione tabella aree tematiche*/
CREATE TABLE aree_tematiche (
    /*definizione attributi*/
    codice INTEGER GENERATED ALWAYS AS IDENTITY
                            (START WITH 0
                             INCREMENT BY 1
                             MINVALUE 0),
    nome VARCHAR (200) NOT NULL,
    descrizione VARCHAR (200) NOT NULL,

    /*vincolo di chiave primaria*/
    CONSTRAINT pk_area_tematica PRIMARY KEY (codice)
);

/*creazione tabella lezioni*/
CREATE TABLE lezioni (
    /*definizione attributi*/
    codice INTEGER GENERATED ALWAYS AS IDENTITY
                            (START WITH 0
                             INCREMENT BY 1
                             MINVALUE 0),
    titolo VARCHAR (200) NOT NULL,
    descrizione VARCHAR (300) NOT NULL,
    durata INTERVAL NOT NULL,
    data_inizio TIMESTAMP WITH TIME ZONE NOT NULL,
    codice_corso INTEGER NOT NULL,

    /*vincolo di chiave primaria*/
    CONSTRAINT pk_lezione PRIMARY KEY (codice),

    /*vincolo di chiave esterna necessario per effettuare
    l'associazione con la tabella corsi. Se il corso a cui
    si riferisce la chiave esterna venisse eliminato, allora
    anche la lezione che gli è associata verrebbe eliminata*/
    CONSTRAINT fk_corso_della_lezione FOREIGN KEY (codice_corso)
    REFERENCES corsi (codice)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

/*creazione tabella studenti*/
CREATE TABLE studenti (
    /*definizione attributi*/
    matricola INTEGER GENERATED ALWAYS AS IDENTITY
                      (START WITH 0
                       INCREMENT BY 1
                       MINVALUE 0),
    nome VARCHAR (200) NOT NULL,
    cognome VARCHAR (200) NOT  NULL,

    /*Vincolo di chiave primaria*/
    CONSTRAINT pk_studente PRIMARY KEY (matricola)
);

/*creazione tabella aree_dei_corsi, tabella nata dall'associazione
molti a molti che c'è tra corsi e aree tematiche*/
CREATE TABLE aree_dei_corsi (
    codice_area_tematica INTEGER NOT NULL,
    codice_corso INTEGER NOT NULL,

    /*Vincolo di chiave esterna verso la tabella aree_tematiche.
    Alla cancellazione della corrispondente area tematica, verrebbe
    cancellata anche la riga che ne contiene la chiave*/
    CONSTRAINT fk_adc_codice_area_tematica FOREIGN KEY (codice_area_tematica)
    REFERENCES aree_tematiche (codice)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    /*Vincolo di chiave esterna verso la tabella corsi.
    Alla cancellazione del corrispondente corso, verrebbe
    cancellata anche la riga che ne contiene la chiave*/
    CONSTRAINT fk_adc_codice_corso FOREIGN KEY (codice_corso)
    REFERENCES corsi (codice)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    /*vincolo di unicità per ogni riga della tabella, serve per
    evitare che non si ripeta la stessa associazione più volte*/
    CONSTRAINT unica_tupla_adc UNIQUE (codice_area_tematica, codice_corso)
);

/*creazione tabella iscrizioni, tabella nata dall'associazione
molti a molti che c'è tra studenti e corsi*/
CREATE TABLE iscrizioni (
    matricola INTEGER NOT NULL,
    codice_corso INTEGER NOT NULL,    

    /*Vincolo di chiave esterna verso la tabella studenti.
    Alla cancellazione del corrispondente studente, verrebbe
    cancellata anche la riga che ne contiene la chiave*/
    CONSTRAINT fk_iscrizioni_matricola FOREIGN KEY (matricola)
    REFERENCES studenti (matricola)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    /*Vincolo di chiave esterna verso la tabella corsi.
    Alla cancellazione del corrispondente corso, verrebbe
    cancellata anche la riga che ne contiene la chiave*/
    CONSTRAINT fk_iscrizioni_codice_corso FOREIGN KEY (codice_corso)
    REFERENCES corsi (codice)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    /*vincolo di unicità per ogni riga della tabella, serve per
    evitare che non si ripeta la stessa associazione più volte*/
    CONSTRAINT unica_tupla_iscrizioni UNIQUE (matricola, codice_corso)
);

/*creazione tabella iscrizioni, tabella nata dall'associazione
molti a molti che c'è tra studenti e lezioni*/
CREATE TABLE presenze (
    matricola INTEGER NOT NULL,
    codice_lezione INTEGER NOT NULL,

    /*Vincolo di chiave esterna verso la tabella studenti.
    Alla cancellazione del corrispondente studente, verrebbe
    cancellata anche la riga che ne contiene la chiave*/
    CONSTRAINT fk_presenze_matricola FOREIGN KEY (matricola)
    REFERENCES studenti (matricola)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    /*Vincolo di chiave esterna verso la tabella lezioni.
    Alla cancellazione della corrispondente lezione, verrebbe
    cancellata anche la riga che ne contiene la chiave*/
    CONSTRAINT fk_presenze_codice_lezione FOREIGN KEY (codice_lezione)
    REFERENCES lezioni (codice)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    /*vincolo di unicità per ogni riga della tabella, serve per
    evitare che non si ripeta la stessa associazione più volte*/
    CONSTRAINT unica_tupla_presenze UNIQUE (matricola, codice_lezione)
);