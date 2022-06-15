package controller;

import connessione.postgresql.ConnessioneDB;
import connessione.postgresql.DBBuilder;
import dao.implementazione.postgresql.AreaDelCorsoDAOImplementazione;
import dao.implementazione.postgresql.AreaTematicaDAOImplementazione;
import dao.implementazione.postgresql.CorsoDAOImplementazione;
import dao.implementazione.postgresql.LezioneDAOImplementazione;
import dao.implementazione.postgresql.PresenzeDAOImplementazione;
import dao.implementazione.postgresql.StudenteDAOImplementazione;
import dao.implementazione.postgresql.IscrizioniDAOImplementazione;
import dto.AreaTematica;
import dto.Corso;
import dto.Lezione;
import dto.Studente;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import eccezioni.update.UpdateFallitoException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.areeTematiche.PanelAggiornaAreaTematica;
import gui.homeFrame.panels.areeTematiche.PanelAreeTematiche;
import gui.homeFrame.panels.areeTematiche.PanelCorsiDellArea;
import gui.homeFrame.panels.areeTematiche.PanelNuovaAreaTematica;
import gui.homeFrame.panels.corsi.PanelAggiornaCorso;
import gui.homeFrame.panels.corsi.PanelCorsi;
import gui.homeFrame.panels.corsi.PanelNuovoCorso;
import gui.homeFrame.panels.corsi.PanelProspettoCorso;
import gui.homeFrame.panels.corsi.PanelRicercaCorso;
import gui.homeFrame.panels.homePage.PanelHomePage;
import gui.homeFrame.panels.lezioni.PanelAggiornaLezione;
import gui.homeFrame.panels.lezioni.PanelLezioni;
import gui.homeFrame.panels.lezioni.PanelNuovaLezione;
import gui.homeFrame.panels.studenti.PanelAggiornaStudente;
import gui.homeFrame.panels.studenti.PanelIscrizioni;
import gui.homeFrame.panels.studenti.PanelNuovoStudente;
import gui.homeFrame.panels.studenti.PanelPresenze;
import gui.homeFrame.panels.studenti.PanelStudenti;
import gui.login.LoginFrame;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.LinkedList;



public class Controller {
    
    //attributi
    private String fusoOrario;
    
    private Connection connection;
    
    private LoginFrame loginFrame;
    
    private HomeFrameOperatore homeFrameOperatore;
    
    private PanelHomePage panelHomePage;
    
    private PanelStudenti panelStudenti;
    private PanelNuovoStudente panelNuovoStudente;
    private PanelAggiornaStudente panelAggiornaStudente;
    private PanelIscrizioni panelIscrizioni;
    private PanelPresenze panelPresenze;
    
    private PanelAreeTematiche panelAreeTematiche;
    private PanelNuovaAreaTematica panelNuovaAreaTematica;
    private PanelAggiornaAreaTematica panelAggiornaAreaTematica;
    private PanelCorsiDellArea panelCorsiDellArea;
    private PanelRicercaCorso panelRicercaCorso;
    
    private PanelCorsi panelCorsi;
    private PanelNuovoCorso panelNuovoCorso;
    private PanelAggiornaCorso panelAggiornaCorso;
    private PanelProspettoCorso panelProspettoCorso;
    
    private PanelLezioni panelLezioni;
    private PanelNuovaLezione panelNuovaLezione;
    private PanelAggiornaLezione panelAggiornaLezione;
    
    private LinkedList<AreaTematica> listaAreeTematiche;
    private AreaTematicaDAOImplementazione areaTematicaDAO;
    
    private LinkedList<Corso> listaCorsi;
    private CorsoDAOImplementazione corsoDAO;
    
    private LinkedList<Lezione> listaLezioni;
    private LezioneDAOImplementazione lezioneDAO;
    
    private LinkedList<Studente> listaStudenti;
    private StudenteDAOImplementazione studenteDAO;
    
    private AreaDelCorsoDAOImplementazione areaDelCorsoDAO;
    
    private IscrizioniDAOImplementazione iscrizioniDAO;
    
    private PresenzeDAOImplementazione presenzeDAO;
    //attributi
    
    //costruttore
    public Controller() {
        fusoOrario = "Europe/Rome";
    }
    //costruttore
    
    //getters e setters
    public String getFusoOrario() {
        return fusoOrario;
    }
    
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public LinkedList<AreaTematica> getListaAreeTematiche() {
        return listaAreeTematiche;
    }

    public LinkedList<Corso> getListaCorsi() {
        return listaCorsi;
    }

    public LinkedList<Lezione> getListaLezioni() {
        return listaLezioni;
    }

    public LinkedList<Studente> getListaStudenti() {
        return listaStudenti;
    }
    //getters e setters
    
    //connessione
    public void avviaConnessione(String userName, String password, String ip, String porta, String db) {        
        chiudiConnessione();
        try {
            connection = ConnessioneDB.getIstanza(userName, password, ip, porta, db).getConnection();
            connessioneStabilita();
        }
        catch(SQLException e) {
            if(e.getSQLState().equals("3D000") && loginFrame.confermaCreazioneDB()) {
                costruisciDB(userName, password, ip, porta, db);
            }
            else {
                loginFrame.connessioneNonStabilita();
                loginFrame.mostraEccezione(e.getMessage());
            }
        }
        catch(ClassNotFoundException e) {
            loginFrame.connessioneNonStabilita();
            loginFrame.mostraEccezione(e.getMessage());
        }
    }
    
    public void costruisciDB(String userName, String password, String ip, String porta, String db) {
        try {
            DBBuilder dbBuilder = new DBBuilder(this, userName, password, ip, porta, db);
            connection = dbBuilder.createDatabase(userName, password, ip, porta, db);
            connessioneStabilita();
        }
        catch (SQLException | ClassNotFoundException e) {
            loginFrame.connessioneNonStabilita();
            loginFrame.mostraEccezione(e.getMessage());
        }
    }
    
    public void connessioneStabilita() {
        try {
            creaDAO();
            retrieveAllDTO();
            loginFrame.connessioneStabilita();
        }
        catch(RetrieveFallitoException | AssociazioneFallitaException e) {
            loginFrame.connessioneNonStabilita();
            loginFrame.mostraEccezione(e.getMessage());
        }
    }
    
    public void chiudiConnessione() {
        if(connection != null){   
            try {
                connection.close();
            }
            catch(SQLException e) {
                if(loginFrame.isVisible()) {
                    loginFrame.mostraEccezione(e.getMessage());
                }
                if(homeFrameOperatore.isVisible()) {
                    homeFrameOperatore.mostraEccezione(e.getMessage());
                }
            }
        }
    }
    
    public void chiudiConnessionePerErrori() {
        chiudiConnessione();
        esciDaOperatore();
        loginFrame.connessioneNonStabilita();
    }
    //connessione
    
    //termina esecuzione
    public void terminaEsecuzione() {
        chiudiConnessione();
        System.exit(0);
    }
    //termina esecuzione
    
    //DAO
    private void creaDAO() {
        areaTematicaDAO = new AreaTematicaDAOImplementazione(this, connection);
        corsoDAO = new CorsoDAOImplementazione(this, connection);
        lezioneDAO = new LezioneDAOImplementazione(this, connection);    
        studenteDAO = new StudenteDAOImplementazione(this, connection);
        areaDelCorsoDAO =  new AreaDelCorsoDAOImplementazione(this, connection);
        iscrizioniDAO = new IscrizioniDAOImplementazione(this, connection);
        presenzeDAO = new PresenzeDAOImplementazione(this, connection);
    }
    
    public void retrieveAllDTO() throws RetrieveFallitoException, AssociazioneFallitaException {
        this.listaAreeTematiche = areaTematicaDAO.retrieveAllAreaTematica();
        this.listaCorsi = corsoDAO.retrieveAllCorso();
        this.listaLezioni = lezioneDAO.retrieveAllLezione(listaCorsi);
        this.listaStudenti = studenteDAO.retrieveAllStudente();
    }
    
    public void setAreeTematicheDelCorso(Corso corso) throws RetrieveFallitoException, AssociazioneFallitaException {
        areaDelCorsoDAO.retrieveAllAreaDelCorso(corso, listaAreeTematiche);
    }
    
    public void setCorsiFrequentati(Studente studente) throws RetrieveFallitoException, AssociazioneFallitaException {
        iscrizioniDAO.retrieveIscrizioniByStudente(studente, listaCorsi);
    }
    
    public void setPresenze(Studente studente) throws RetrieveFallitoException, AssociazioneFallitaException {
        presenzeDAO.retrievePresenzeByStudente(studente, listaLezioni);
    }
    
    public void removePresenza(Studente studente, Lezione lezione) throws DeleteFallitoException {
        presenzeDAO.deletePresenza(studente, lezione);
    }
    //DAO
    
    //cambio frame
    public void creaGUI() {
        loginFrame = new LoginFrame(this);
        homeFrameOperatore = new HomeFrameOperatore(this);
        creaPanel();
        loginFrame.setVisible(true);
    }
    
    private void creaPanel() {
        panelHomePage = new PanelHomePage(this, homeFrameOperatore);
        homeFrameOperatore.setPanelHomePage(panelHomePage);
        
        panelStudenti = new PanelStudenti(this, homeFrameOperatore);
        homeFrameOperatore.setPanelStudenti(panelStudenti);
        
        panelNuovoStudente = new PanelNuovoStudente(this, homeFrameOperatore);
        homeFrameOperatore.setPanelNuovoStudente(panelNuovoStudente);
        
        panelAggiornaStudente = new PanelAggiornaStudente(this, homeFrameOperatore);
        homeFrameOperatore.setPanelAggiornaStudente(panelAggiornaStudente);
        
        panelIscrizioni = new PanelIscrizioni(this, homeFrameOperatore);
        homeFrameOperatore.setPanelIscrizioni(panelIscrizioni);
        
        panelPresenze = new PanelPresenze(this, homeFrameOperatore);
        homeFrameOperatore.setPanelPresenze(panelPresenze);
        
        panelAreeTematiche = new PanelAreeTematiche(this, homeFrameOperatore);
        homeFrameOperatore.setPanelAreeTematiche(panelAreeTematiche);
        
        panelNuovaAreaTematica = new PanelNuovaAreaTematica(this, homeFrameOperatore);
        homeFrameOperatore.setPanelNuovaAreaTematica(panelNuovaAreaTematica);
        
        panelAggiornaAreaTematica = new PanelAggiornaAreaTematica(this, homeFrameOperatore);
        homeFrameOperatore.setPanelAggiornaAreaTematica(panelAggiornaAreaTematica);
        
        panelCorsiDellArea = new PanelCorsiDellArea(this, homeFrameOperatore);
        homeFrameOperatore.setPanelCorsiDellArea(panelCorsiDellArea);
        
        panelCorsi = new PanelCorsi(this, homeFrameOperatore);
        homeFrameOperatore.setPanelCorsi(panelCorsi);
        
        panelNuovoCorso = new PanelNuovoCorso(this, homeFrameOperatore);
        homeFrameOperatore.setPanelNuovoCorso(panelNuovoCorso);
        
        panelAggiornaCorso = new PanelAggiornaCorso(this, homeFrameOperatore);
        homeFrameOperatore.setPanelAggiornaCorso(panelAggiornaCorso);
        
        panelProspettoCorso = new PanelProspettoCorso(this, homeFrameOperatore);
        homeFrameOperatore.setPanelProspettoCorso(panelProspettoCorso);
        
        panelRicercaCorso = new PanelRicercaCorso(this, homeFrameOperatore);
        homeFrameOperatore.setPanelRicercaCorso(panelRicercaCorso);
        
        panelLezioni = new PanelLezioni(this, homeFrameOperatore);
        homeFrameOperatore.setPanelLezioni(panelLezioni);
        
        panelNuovaLezione = new PanelNuovaLezione(this, homeFrameOperatore);
        homeFrameOperatore.setPanelNuovaLezione(panelNuovaLezione);
        
        panelAggiornaLezione = new PanelAggiornaLezione(this, homeFrameOperatore);
        homeFrameOperatore.setPanelAggiornaLezione(panelAggiornaLezione);
    }
    
    public void accessoOperatore(){
        impostaPanelPrincipali();
        
        loginFrame.setVisible(false);
        homeFrameOperatore.setVisible(true);
    }
    
    public void esciDaOperatore() {
        loginFrame.setVisible(true);
        homeFrameOperatore.setVisible(false);
    }
    
    private void impostaPanelPrincipali() {
        impostaPanelStudenti();
        impostaPanelAreeTematiche();
        impostaPanelCorsi();
        impostaPanelLezioni();
    }
    //cambio frame
    
    //sezione home page
    public void aggiornaHomePage() {
        panelHomePage.impostaInformazioniHomePage(listaStudenti.size(), listaAreeTematiche.size(), listaCorsi.size(), listaLezioni.size());
    }
    //sezione home page
    
    //sezione studenti
    public void impostaPanelStudenti() {
        panelStudenti.svuotaTutteTable();
        for(Studente studente : listaStudenti) {
            panelStudenti.inserisciInTableStudenti(studente.creaRiga());
        }
    }
    
    public void aggiornaSelezionePanelStudenti(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        panelStudenti.svuotaTableAssociazioni();
        
        for(Corso corso : studente.getListaCorsiFrequentati()) {
            panelStudenti.inserisciInTableCorsiFrequentati(corso.creaRiga());
        }
        
        for(Lezione lezione : studente.getListaPresenze()) {
            panelStudenti.inserisciInTablePresenze(lezione.creaRiga());
        }
    }
    
    public void nuovoStudente(String nome, String cognome) {
        Studente studente = new Studente(nome, cognome);
        
        try {
            studenteDAO.createStudente(studente);
            listaStudenti.add(studente);
            panelStudenti.inserisciInTableStudenti(studente.creaRiga());
        }
        catch (CreateFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void eliminaStudente(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        try {
            studenteDAO.deleteStudente(studente);
            listaStudenti.remove(studente);
            panelStudenti.rimuoviStudenteSelezionato();
            panelStudenti.svuotaTableAssociazioni();
        }
        catch(DeleteFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void impostaPanelIscrizioni(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        panelIscrizioni.svuotaTutteTable();
        panelIscrizioni.inserisciStudenteSelezionato(studente.creaRiga());
        aggiornaPanelIscrizioni(studente);
    }
    
    public void aggiornaPanelIscrizioni(Studente studente) {
        panelIscrizioni.svuotaTableAssociazioni();
        
        for(Corso corso : studente.getListaCorsiFrequentati()) {
            panelIscrizioni.inserisciInTableCorsiFrequentati(corso.creaRiga());
        }
        for (Corso corso : listaCorsi) {
            if(corso.eFrequentabile(studente)) {
                panelIscrizioni.inserisciInTableCorsiFrequentabili(corso.creaRiga());
            }
        }
    }
    
    public void iscriviAlCorso(Object studenteSelezionato, Object corsoSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        Corso corso = (Corso) corsoSelezionato;
        
        try {
            iscrizioniDAO.createIscrizione(studente, corso);
            aggiornaPanelIscrizioni(studente);
        }
        catch (CreateFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void disiscriviDalCorso(Object studenteSelezionato, Object corsoSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        Corso corso = (Corso) corsoSelezionato;
        
        try {
            iscrizioniDAO.deleteIscrizione(studente, corso);
            aggiornaPanelIscrizioni(studente);
        }
        catch (DeleteFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void impostaPanelPresenze(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        panelPresenze.svuotaTutteTable();
        panelPresenze.inserisciStudenteSelezionato(studente.creaRiga());
        aggiornaPanelPresenze(studente);
    }
    
    public void aggiornaPanelPresenze(Studente studente) {
        panelPresenze.svuotaTableAssociazioni();
        
        for(Lezione lezione : studente.getListaPresenze()) {
            panelPresenze.inserisciInTablePresenzeRegistrate(lezione.creaRiga());
        }
        for (Corso corso : studente.getListaCorsiFrequentati()) {
            for(Lezione lezione : corso.getListaLezioni()) {
                if(!studente.getListaPresenze().contains(lezione)) {
                    panelPresenze.inserisciInTablePresenzePossibili(lezione.creaRiga());
                }
            }
        }
    }
    
    public void registraPresenza(Object studenteSelezionato, Object lezioneSelezionata) {
        Studente studente = (Studente) studenteSelezionato;
        Lezione lezione = (Lezione) lezioneSelezionata;
        
        try {
            presenzeDAO.createPresenza(studente, lezione);
            aggiornaPanelPresenze(studente);
        }
        catch (CreateFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void rimuoviPresenza(Object studenteSelezionato, Object lezioneSelezionata) {
        Studente studente = (Studente) studenteSelezionato;
        Lezione lezione = (Lezione) lezioneSelezionata;
        
        try {
            presenzeDAO.deletePresenza(studente, lezione);
            aggiornaPanelPresenze(studente);
        }
        catch (DeleteFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void impostaPanelAggiornaStudente(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        panelAggiornaStudente.svuotaCampi();
        panelAggiornaStudente.inserisciStudenteSelezionato(studente.creaRiga());
        panelAggiornaStudente.setNome(studente.getNome());
        panelAggiornaStudente.setCognome(studente.getCognome());
    }
    
    public void aggiornaStudente(Object studenteSelezionato, String nome, String cognome) {
        Studente studente = (Studente) studenteSelezionato;
        
        studente.setNome(nome);
        studente.setCognome(cognome);
        try {
            studenteDAO.updateStudente(studente);
            panelStudenti.aggiornaStudenteSelezionato(studente.creaRiga());
            panelStudenti.svuotaTableAssociazioni();
        }
        catch(UpdateFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    //sezione studenti
    
    //sezione aree tematiche
    public void impostaPanelAreeTematiche() {
        panelAreeTematiche.svuotaTutteTable();
        for(AreaTematica areaTematica : listaAreeTematiche) {
            panelAreeTematiche.inserisciInTableAreeTematiche(areaTematica.creaRiga());
        }
    }
    
    public void aggiornaSelezionePanelAreeTematiche(Object areaSelezionata) {
        AreaTematica areaTematica = (AreaTematica) areaSelezionata;
        
        panelAreeTematiche.svuotaTableAssociazioni();
        
        for(Corso corso : areaTematica.getCorsiDellAreaTematica()) {
            panelAreeTematiche.inserisciInTableCorsiDellArea(corso.creaRiga());
        }
    }
    
    public void nuovaAreaTematica(String nome, String descrizione) {
        AreaTematica area = new AreaTematica(nome, descrizione);
        
        try {
            areaTematicaDAO.createAreaTematica(area);
            listaAreeTematiche.add(area);
            panelAreeTematiche.inserisciInTableAreeTematiche(area.creaRiga());
        }
        catch (CreateFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void eliminaAreaTematica(Object areaTematicaSelezionata) {
        AreaTematica areaTematica = (AreaTematica) areaTematicaSelezionata;
        
        try {
            areaTematicaDAO.deleteAreaTematica(areaTematica);
            listaAreeTematiche.remove(areaTematica);
            panelAreeTematiche.rimuoviAreaTematicaSelezionata();
            panelAreeTematiche.svuotaTableAssociazioni();
        }
        catch(DeleteFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void impostaPanelAggiornaAreaTematica(Object areaTematicaSelezionata) {
        AreaTematica areaTematica = (AreaTematica) areaTematicaSelezionata;
        
        panelAggiornaAreaTematica.svuotaCampi();
        panelAggiornaAreaTematica.inserisciAreaTematicaSelezionata(areaTematica.creaRiga());
        panelAggiornaAreaTematica.setNome(areaTematica.getNome());
        panelAggiornaAreaTematica.setDescrizione(areaTematica.getDescrizione());
    }
    
    public void aggiornaAreaTematica(Object areaTematicaSelezionata, String nome, String descrizione) {
        AreaTematica areaTematica = (AreaTematica) areaTematicaSelezionata;
        
        areaTematica.setNome(nome);
        areaTematica.setDescrizione(descrizione);
        try {
            areaTematicaDAO.updateAreaTematica(areaTematica);
            panelAreeTematiche.aggiornaAreaTematicaSelezionata(areaTematica.creaRiga());
            panelAreeTematiche.svuotaTableAssociazioni();
        }
        catch(UpdateFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void impostaPanelCorsiDellArea(Object areaTematicaSelezionata) {
        AreaTematica areaTematica = (AreaTematica) areaTematicaSelezionata;
        panelCorsiDellArea.svuotaTutteTable();
        panelCorsiDellArea.inserisciAreaTematicaSelezionata(areaTematica.creaRiga());
        aggiornaPanelCorsiDellArea(areaTematica);
    }
    
    public void aggiornaPanelCorsiDellArea(AreaTematica areaTematica) {
        panelCorsiDellArea.svuotaTableAssociazioni();
        
        for(Corso corso : areaTematica.getCorsiDellAreaTematica()) {
            panelCorsiDellArea.inserisciInTableCorsiRegistrati(corso.creaRiga());
        }
        for (Corso corso : listaCorsi) {
            if(!areaTematica.getCorsiDellAreaTematica().contains(corso)) {
                panelCorsiDellArea.inserisciInTableCorsiRegistrabili(corso.creaRiga());
            }
        }
    }
    
    public void registraAreaDelCorso(Object areaTematicaSelezionata, Object corsoSelezionato) {
        AreaTematica areaTematica = (AreaTematica) areaTematicaSelezionata;
        Corso corso = (Corso) corsoSelezionato;
        
        try {
            areaDelCorsoDAO.createAreaDelCorso(corso, areaTematica);
            aggiornaPanelCorsiDellArea(areaTematica);
        }
        catch (CreateFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void rimuoviAreaDelCorso(Object areaTematicaSelezionata, Object corsoSelezionato) {
        AreaTematica areaTematica = (AreaTematica) areaTematicaSelezionata;
        Corso corso = (Corso) corsoSelezionato;
        
        try {
            areaDelCorsoDAO.deleteAreaDelCorso(corso, areaTematica);
            aggiornaPanelCorsiDellArea(areaTematica);
        }
        catch (DeleteFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    //sezione aree tematiche
    
    //sezione corsi
    public void impostaPanelCorsi() {
        panelCorsi.svuotaTutteTable();
        for(Corso corso : listaCorsi) {
            panelCorsi.inserisciInTableCorsi(corso.creaRiga());
        }
    }
    
    public void aggiornaSelezionePanelCorsi(Object corsoSelezionato) {
        Corso corso = (Corso) corsoSelezionato;
        
        panelCorsi.svuotaTableAssociazioni();
        
        for(Lezione lezione : corso.getListaLezioni()) {
            panelCorsi.inserisciInTableLezioniDelCorso(lezione.creaRiga());
        }
        for(Studente studente : corso.getStudentiIscritti()) {
            panelCorsi.inserisciInTableStudentiDelCorso(studente.creaRiga());
        }
        for(AreaTematica areaTematica : corso.getListaAreeTematiche()) {
            panelCorsi.inserisciInTableAreeDelCorso(areaTematica.creaRiga());
        }
    }
    
    public void nuovoCorso(String nome, String descrizione, int tassoPresenzeMinime, int numeroMassimoIscritti) {
        Corso corso = new Corso(nome, descrizione, tassoPresenzeMinime, numeroMassimoIscritti);
        
        try {
            corsoDAO.createCorso(corso);
            listaCorsi.add(corso);
            panelCorsi.inserisciInTableCorsi(corso.creaRiga());
        }
        catch (CreateFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void eliminaCorso(Object corsoSelezionato) {
        Corso corso = (Corso) corsoSelezionato;
        
        try {
            corsoDAO.deleteCorso(corso);
            listaLezioni.removeAll(corso.getListaLezioni());
            listaCorsi.remove(corso);
            panelCorsi.rimuoviCorsoSelezionato();
            panelCorsi.svuotaTableAssociazioni();
            impostaPanelLezioni();
        }
        catch(DeleteFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void impostaPanelAggiornaCorso(Object corsoSelezionato) {
        Corso corso = (Corso) corsoSelezionato;
        
        panelAggiornaCorso.svuotaCampi();
        panelAggiornaCorso.inserisciCorsoSelezionato(corso.creaRiga());
        panelAggiornaCorso.setNome(corso.getNome());
        panelAggiornaCorso.setDescrizione(corso.getDescrizione());
        panelAggiornaCorso.setTassoPresenzeMinimo(corso.getTassoPresenzeMinime());
        panelAggiornaCorso.setNumeroMassimoIscritti(corso.getNumeroMassimoIscritti());
    }
    
    public void aggiornaCorso(Object corsoSelezionato, String nome, String descrizione, int tassoPresenzeMinime, int numeroMassimoIscritti) {
        Corso corso = (Corso) corsoSelezionato;
        
        corso.setNome(nome);
        corso.setDescrizione(descrizione);
        corso.setTassoPresenzeMinime(tassoPresenzeMinime);
        corso.setNumeroMassimoIscritti(numeroMassimoIscritti);
        try {
            corsoDAO.updateCorso(corso);
            panelCorsi.aggiornaCorsoSelezionato(corso.creaRiga());
            panelCorsi.svuotaTableAssociazioni();
        }
        catch(UpdateFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void impostaPanelProspettoCorso(Object corsoSelezionato) {
        Corso corso = (Corso) corsoSelezionato;
        
        panelProspettoCorso.svuotaTutteTable();
        panelProspettoCorso.inserisciInTableCorsoSelezionato(corso.creaRiga());
        for(Studente studente : corso.getStudentiIscritti()) {
            if(studente.eIdoneo(corso)) {
                panelProspettoCorso.inserisciInTableStudentiIdonei(studente.creaRiga());
            }
        }
        panelProspettoCorso.setNumeroMedioPresenze(corso.getNumeroPresenzeMedio());
        panelProspettoCorso.setNumeroMinimoPresenze(corso.getNumeroPresenzeMinimo());
        panelProspettoCorso.setNumeroMassimoPresenze(corso.getNumeroPresenzeMassimo());
        panelProspettoCorso.setPercentualeRiempimento(corso.getPercentualeRiempimentoMedia());
    }
    
    public void ricercaCorso(String parolaChiave) {
        panelRicercaCorso.svuotaTutteTable();
        for(Corso corso : listaCorsi) {
            if(corso.ricerca(parolaChiave)) {
                panelRicercaCorso.inserisciInTableCorsi(corso.creaRiga());
            }
        }
    }
    //sezione corsi
    
    //sezione lezioni
    public void impostaPanelLezioni() {
        panelLezioni.svuotaTutteTable(); 
        for(Lezione lezione : listaLezioni) {
            panelLezioni.inserisciInTableLezioni(lezione.creaRiga());
        }
    }
    
    public void aggiornaSelezionePanelLezioni(Object lezioneSelezionata) {
        Lezione lezione = (Lezione) lezioneSelezionata;
        
        panelLezioni.svuotaTableAssociazioni();
        
        for(Studente studente : lezione.getStudentiPresenti()) {
            panelLezioni.inserisciInTableStudentiPresenti(studente.creaRiga());
        }
        
        panelLezioni.inserisciInTableCorsoDellaLezione(lezione.getCorsoDellaLezione().creaRiga());
    }
    
    public void impostaPanelNuovaLezione() {
        panelNuovaLezione.svuotaCampi();
        for(Corso corso : listaCorsi) {
            panelNuovaLezione.inserisciInTableCorsi(corso.creaRiga());
        }
    }
    
    public void nuovaLezione(String titolo, String descrizione, String durata, Object dataInizioSelezionata, Object corsoSelezionato) {
        ZonedDateTime dataInizio = ZonedDateTime.ofInstant( ((Date) dataInizioSelezionata).toInstant(), ZoneId.of("Europe/Rome"));
        dataInizio = dataInizio.truncatedTo(ChronoUnit.MINUTES);
        Corso corso = (Corso) corsoSelezionato;
        Lezione lezione = new Lezione (titolo, descrizione, durata, dataInizio, corso);
        
        corso.getListaLezioni().add(lezione);
        
        try {
            lezioneDAO.createLezione(lezione);
            listaLezioni.add(lezione);
            panelLezioni.inserisciInTableLezioni(lezione.creaRiga());
        }
        catch (CreateFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void eliminaLezione(Object lezioneSelezionata) {
        Lezione lezione = (Lezione) lezioneSelezionata;
        
        try {
            lezioneDAO.deleteLezione(lezione);
            listaLezioni.remove(lezione);
            panelLezioni.rimuoviLezioneSelezionata();
            panelLezioni.svuotaTableAssociazioni();
        }
        catch(DeleteFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void impostaPanelAggiornaLezione(Object lezioneSelezionata)  {
        Lezione lezione = (Lezione) lezioneSelezionata;
        
        panelAggiornaLezione.svuotaCampi();
        panelAggiornaLezione.inserisciLezioneSelezionata(lezione.creaRiga());
        panelAggiornaLezione.setTitolo(lezione.getTitolo());
        panelAggiornaLezione.setDescrizione(lezione.getDescrizione());
        panelAggiornaLezione.setDurata(lezione.getDurata());
        panelAggiornaLezione.setDataOraInizio(Date.from(lezione.getDataInizio().toInstant()));
    }
    
    public void aggiornaLezione(Object lezioneSelezionata, String titolo, String descrizione, String durata, Object dataInizioSelezionata) {
        Lezione lezione = (Lezione) lezioneSelezionata;
        
        ZonedDateTime dataInizio = ZonedDateTime.ofInstant( ((Date) dataInizioSelezionata).toInstant(), ZoneId.of("Europe/Rome"));
        dataInizio = dataInizio.truncatedTo(ChronoUnit.MINUTES);
        
        lezione.setTitolo(titolo);
        lezione.setDescrizione(descrizione);
        lezione.setDurata(durata);
        lezione.setDataInizio(dataInizio);
        
        try {
            lezioneDAO.updateLezione(lezione);
            panelLezioni.aggiornaLezioneSelezionata(lezione.creaRiga());
            panelLezioni.svuotaTableAssociazioni();
        }
        catch(UpdateFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    //sezione lezioni
}
