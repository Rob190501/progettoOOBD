package connessione.postgresql;

import controller.Controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class DBBuilder {

    private Controller controller;
    private Connection connection;
    private String userName;
    private String password;
    private String ip;
    private String porta;
    private String db;
    
    private String createDatabase = "CREATE DATABASE ";
    
    private String createTable ="CREATE TABLE corsi ( " +
                                "    codice INTEGER GENERATED ALWAYS AS IDENTITY " +
                                "                            (START WITH 0 " +
                                "                             INCREMENT BY 1 " +
                                "                             MINVALUE 0), " +
                                "    nome VARCHAR (200) NOT NULL, " +
                                "    descrizione VARCHAR (200) NOT NULL, " +
                                "    tasso_presenze_min INTEGER NOT NULL, " +
                                "    partecipanti_max INTEGER NOT NULL, " +
                                "    CONSTRAINT pk_corso PRIMARY KEY (codice), " +
                                "    CONSTRAINT controllo_tasso_presenze " +
                                "    CHECK (tasso_presenze_min >= 0 AND tasso_presenze_min <=100), " +
                                "    CONSTRAINT controllo_partecipanti_max " +
                                "    CHECK (partecipanti_max >= 0) " +
                                "); " +
                                "CREATE TABLE aree_tematiche ( " +
                                "    codice INTEGER GENERATED ALWAYS AS IDENTITY " +
                                "                            (START WITH 0 " +
                                "                             INCREMENT BY 1 " +
                                "                             MINVALUE 0), " +
                                "    nome VARCHAR (200) NOT NULL, " +
                                "    descrizione VARCHAR (200) NOT NULL, " +
                                "    CONSTRAINT pk_area_tematica PRIMARY KEY (codice) " +
                                "); " +
                                "CREATE TABLE lezioni ( " +
                                "    codice INTEGER GENERATED ALWAYS AS IDENTITY " +
                                "                            (START WITH 0 " +
                                "                             INCREMENT BY 1 " +
                                "                             MINVALUE 0), " +
                                "    titolo VARCHAR (200) NOT NULL, " +
                                "    descrizione VARCHAR (300) NOT NULL, " +
                                "    durata INTERVAL NOT NULL, " +
                                "    data_inizio TIMESTAMP WITH TIME ZONE NOT NULL, " +
                                "    codice_corso INTEGER NOT NULL, " +
                                "    CONSTRAINT pk_lezione PRIMARY KEY (codice), " +
                                "    CONSTRAINT fk_corso_della_lezione FOREIGN KEY (codice_corso) " +
                                "    REFERENCES corsi (codice) " +
                                "    ON DELETE CASCADE " +
                                "    ON UPDATE CASCADE " +
                                "); " +
                                "CREATE TABLE studenti ( " +
                                "    matricola INTEGER GENERATED ALWAYS AS IDENTITY " +
                                "                      (START WITH 0 " +
                                "                       INCREMENT BY 1 " +
                                "                       MINVALUE 0), " +
                                "    nome VARCHAR (200) NOT NULL, " +
                                "    cognome VARCHAR (200) NOT  NULL, " +
                                "    CONSTRAINT pk_studente PRIMARY KEY (matricola) " +
                                "); " +
                                "CREATE TABLE aree_dei_corsi ( " +
                                "    codice_area_tematica INTEGER NOT NULL, " +
                                "    codice_corso INTEGER NOT NULL, " +
                                "    CONSTRAINT fk_adc_codice_area_tematica FOREIGN KEY (codice_area_tematica) " +
                                "    REFERENCES aree_tematiche (codice) " +
                                "    ON DELETE CASCADE " +
                                "    ON UPDATE CASCADE, " +
                                "    CONSTRAINT fk_adc_codice_corso FOREIGN KEY (codice_corso) " +
                                "    REFERENCES corsi (codice) " +
                                "    ON DELETE CASCADE " +
                                "    ON UPDATE CASCADE, " +
                                "    CONSTRAINT unica_tupla_adc UNIQUE (codice_area_tematica, codice_corso) " +
                                "); " +
                                "CREATE TABLE iscrizioni ( " +
                                "    matricola INTEGER NOT NULL, " +
                                "    codice_corso INTEGER NOT NULL,     " +
                                "    CONSTRAINT fk_iscrizioni_matricola FOREIGN KEY (matricola) " +
                                "    REFERENCES studenti (matricola) " +
                                "    ON DELETE CASCADE " +
                                "    ON UPDATE CASCADE, " +
                                "    CONSTRAINT fk_iscrizioni_codice_corso FOREIGN KEY (codice_corso) " +
                                "    REFERENCES corsi (codice) " +
                                "    ON DELETE CASCADE " +
                                "    ON UPDATE CASCADE, " +
                                "    CONSTRAINT unica_tupla_iscrizioni UNIQUE (matricola, codice_corso) " +
                                "); " +
                                "CREATE TABLE presenze ( " +
                                "    matricola INTEGER NOT NULL, " +
                                "    codice_lezione INTEGER NOT NULL, " +
                                "    CONSTRAINT fk_presenze_matricola FOREIGN KEY (matricola) " +
                                "    REFERENCES studenti (matricola) " +
                                "    ON DELETE CASCADE " +
                                "    ON UPDATE CASCADE, " +
                                "    CONSTRAINT fk_presenze_codice_lezione FOREIGN KEY (codice_lezione) " +
                                "    REFERENCES lezioni (codice) " +
                                "    ON DELETE CASCADE " +
                                "    ON UPDATE CASCADE, " +
                                "    CONSTRAINT unica_tupla_presenze UNIQUE (matricola, codice_lezione) " +
                                ");";
    
    private String createTriggerFunction = "CREATE OR REPLACE FUNCTION controlla_disponibilita() RETURNS TRIGGER AS " +
                                        "' " +
                                        "BEGIN " +
                                        "    IF (SELECT count(*) " +
                                        "        FROM iscrizioni " +
                                        "        WHERE codice_corso = NEW.codice_corso) < (SELECT partecipanti_max " +
                                        "                                                  FROM corsi " +
                                        "                                                  WHERE codice = NEW.codice_corso) " +
                                        "    THEN " +
                                        "        RETURN NEW; " +
                                        "    ELSE " +
                                        "        RAISE EXCEPTION ''Posti liberi insufficienti''; " +
                                        "    END IF; " +
                                        "END; " +
                                        "' LANGUAGE plpgsql;  " +
            
                                        "CREATE OR REPLACE FUNCTION controlla_iscrizione() RETURNS TRIGGER AS " +
                                        "' " +
                                        "BEGIN " +
                                        "    IF (SELECT COUNT(*) " +
                                        "        FROM iscrizioni " +
                                        "        WHERE matricola = NEW.matricola AND codice_corso = (SELECT codice_corso " +
                                        "                                                            FROM lezioni " +
                                        "                                                            WHERE codice = NEW.codice_lezione)) > 0 " +
                                        "    THEN " +
                                        "        RETURN NEW; " +
                                        "    ELSE " +
                                        "        RAISE EXCEPTION ''Studente non iscritto al corso della lezione''; " +
                                        "    END IF; " +
                                        "END; " +
                                        "' LANGUAGE plpgsql;  " +
            
                                        "CREATE OR REPLACE FUNCTION rimuovi_presenze() RETURNS TRIGGER AS " +
                                        "' " +
                                        "BEGIN " +
                                        "    DELETE " +
                                        "    FROM presenze " +
                                        "    WHERE matricola = OLD.matricola AND codice_lezione IN (SELECT codice " +
                                        "                                                           FROM lezioni " +
                                        "                                                           WHERE codice_corso = OLD.codice_corso); " +
                                        "    RETURN OLD; " +
                                        "END; " +
                                        "' LANGUAGE plpgsql;  " +
            
                                        "CREATE OR REPLACE FUNCTION controlla_partecipanti_max() RETURNS TRIGGER AS " +
                                        "' " +
                                        "BEGIN " +
                                        "    IF (SELECT COUNT(*) " +
                                        "        FROM iscrizioni " +
                                        "        WHERE codice_corso = NEW.codice) > NEW.partecipanti_max " +
                                        "    THEN " +
                                        "        RAISE EXCEPTION ''Nuovo numero massimo di partecipanti inferiore al numero di partecipanti attuali''; " +
                                        "    ELSE " +
                                        "        RETURN NEW; " +
                                        "    END IF; " +
                                        "END; " +
                                        "' LANGUAGE plpgsql;" +
                                        
                                        "CREATE OR REPLACE FUNCTION vieta_aggiornamento_presenza() RETURNS TRIGGER AS " +
                                        "' " +
                                        "BEGIN " +
                                        "    RAISE EXCEPTION ''Impossibile aggiornare una riga della tabella presenze.''; " +
                                        "END; " +
                                        "' LANGUAGE plpgsql;" +
                                        
                                        "CREATE OR REPLACE FUNCTION vieta_aggiornamento_iscrizione() RETURNS TRIGGER AS " +
                                        "' " +
                                        "BEGIN " +
                                        "    RAISE EXCEPTION ''Impossibile aggiornare una riga della tabella iscrizioni.''; " +
                                        "END; " +
                                        "' LANGUAGE plpgsql;" +
            
                                        "CREATE OR REPLACE FUNCTION vieta_aggiornamento_corso_della_lezione() RETURNS TRIGGER AS " +
                                        "' " +
                                        "BEGIN " +
                                        "    IF (NEW.codice_corso) <> (OLD.codice_corso) " +
                                        "    THEN " +
                                        "        RAISE EXCEPTION ''Impossibile cambiare il corso di una lezione.''; " +
                                        "    ELSE " +
                                        "        RETURN NEW; " +
                                        "    END IF; " +
                                        "END; " +
                                        "' LANGUAGE plpgsql;";
    
    private String createTrigger =  "CREATE OR REPLACE TRIGGER nuova_iscrizione " +
                                    "BEFORE INSERT " +
                                    "ON iscrizioni " +
                                    "FOR EACH ROW " +
                                    "EXECUTE FUNCTION controlla_disponibilita(); " +
            
                                    "CREATE OR REPLACE TRIGGER nuova_presenza " +
                                    "BEFORE INSERT  " +
                                    "ON presenze  " +
                                    "FOR EACH ROW  " +
                                    "EXECUTE FUNCTION controlla_iscrizione(); " +
            
                                    "CREATE OR REPLACE TRIGGER disiscrizione " +
                                    "BEFORE DELETE " +
                                    "ON iscrizioni " +
                                    "FOR EACH ROW " +
                                    "EXECUTE FUNCTION rimuovi_presenze(); " +
            
                                    "CREATE OR REPLACE TRIGGER update_corso " +
                                    "BEFORE UPDATE " +
                                    "ON corsi " +
                                    "FOR EACH ROW " +
                                    "EXECUTE FUNCTION controlla_partecipanti_max();" +
            
                                    "CREATE OR REPLACE TRIGGER update_presenza " +
                                    "BEFORE UPDATE " +
                                    "ON presenze " +
                                    "FOR EACH ROW " +
                                    "EXECUTE FUNCTION vieta_aggiornamento_presenza();" +
            
                                    "CREATE OR REPLACE TRIGGER update_iscrizione " +
                                    "BEFORE UPDATE " +
                                    "ON iscrizioni " +
                                    "FOR EACH ROW " +
                                    "EXECUTE FUNCTION vieta_aggiornamento_iscrizione();" +
            
                                    "CREATE OR REPLACE TRIGGER update_lezione " +
                                    "BEFORE UPDATE " +
                                    "ON lezioni " +
                                    "FOR EACH ROW " +
                                    "EXECUTE FUNCTION vieta_aggiornamento_corso_della_lezione();";
    
    private String insertDemo = "INSERT INTO corsi (nome, descrizione, tasso_presenze_min, partecipanti_max) VALUES " +
                                "('Informatica', 'Si studia informatica', 75, 5), " +
                                "('Matematica', 'Si studia matematica', 50, 10), " +
                                "('Medicina', 'Si studia medicina', 100, 2), " +
                                "('Giurisprudenza', 'Si studia giurisprudenza', 0, 5); " +
                                
                                "INSERT INTO lezioni (titolo, descrizione, durata, data_inizio, codice_corso) VALUES " +
                                "('Lezione 0', 'Lezione di presentazione del corso di informatica', '02:00:00', '2021-09-17 09:00:00', 0), " +
                                "('Lezione 1', 'Programmazione', '02:00:00', '2021-09-18 09:00:00', 0), " +
                                "('Lezione 1', 'Introduzione al corso di medicina', '02:00:00', '2021-09-17 11:00:00', 2), " +
                                "('Lezione 1', 'Prima lezione matematica', '02:00:00', '2021-09-17 16:00:00', 1), " +
                                "('Lezione 1', 'Inizio lezioni giurisprudenza', '02:30:00', '2021-09-17 18:00:00', 3); " +
                                
                                "INSERT INTO aree_tematiche (nome, descrizione) VALUES " +
                                "('Scienze', 'Corsi scientifici'), " +
                                "('Legge', 'Corsi di giurisprudenza'), " +
                                "('Medicina', 'Corsi di medicina'); " +
                                
                                "INSERT INTO studenti (nome, cognome) VALUES " +
                                "('Roberto', 'Ambrosino'), " +
                                "('Sadman', 'Ahmed'), " +
                                "('Mario', 'Rossi'), " +
                                "('Lucia', 'Gialli'); " +
                                
                                "INSERT INTO aree_dei_corsi (codice_area_tematica, codice_corso ) VALUES " +
                                "(0, 0), " +
                                "(0, 1), " +
                                "(2, 2), " +
                                "(1, 3); " +
                                
                                "INSERT INTO iscrizioni (matricola, codice_corso) VALUES " +
                                "(0, 0), " +
                                "(1, 0), " +
                                "(2, 2), " +
                                "(3, 2); " +
                                
                                "INSERT INTO presenze (matricola, codice_lezione) VALUES " +
                                "(0, 0)," +
                                "(0, 1)," +
                                "(1, 0)," +
                                "(1, 1)," +
                                "(2, 2)," +
                                "(3, 2);";
    
    public DBBuilder(Controller controller, String userName, String password, String ip, String porta, String db) throws SQLException, ClassNotFoundException {
        this.controller = controller;
        if(this.connection != null) {
            this.connection.close();
        }
        this.connection = ConnessioneSingleton.getIstanza(userName, password, ip, porta, "postgres").getConnection();
        this.userName = userName;
        this.password = password;
        this.ip = ip;
        this.porta = porta;
        this.db = db;
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public void buildDatabase() throws SQLException, ClassNotFoundException {
        try (Statement stmt = connection.createStatement();) {
            stmt.executeUpdate(createDatabase + db);
        }
        connection.close();
        connection = ConnessioneSingleton.getIstanza(userName, password, ip, porta, db).getConnection();
        createTable();
        createTriggerFunction();
        createTrigger();
        insertDemo();
    }
    
    public void createTable() throws SQLException {
        try(Statement stmt = connection.createStatement();) {
            stmt.executeUpdate(createTable);
        }
    }
    
    public void createTriggerFunction() throws SQLException {
        try(Statement stmt = connection.createStatement();) {
            stmt.executeUpdate(createTriggerFunction);
        }
    }
    
    public void createTrigger() throws SQLException {
        try(Statement stmt = connection.createStatement();) {
            stmt.executeUpdate(createTrigger);
        }
    }
    
    public void insertDemo() throws SQLException {
        try(Statement stmt = connection.createStatement();) {
            stmt.executeUpdate(insertDemo);
        }
    }
    
}
