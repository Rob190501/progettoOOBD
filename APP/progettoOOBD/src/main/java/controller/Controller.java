package controller;

import connessione.ConnessioneDB;
import dao.implementazione.postgresql.AreaTematicaDAOImplementazione;
import dao.implementazione.postgresql.CorsoDAOImplementazione;
import dao.implementazione.postgresql.LezioneDAOImplementazione;
import dao.implementazione.postgresql.StudenteDAOImplementazione;
import dao.implementazione.postgresql.StudenteDelCorsoDAOImplementazione;
import dto.AreaTematica;
import dto.Corso;
import dto.Lezione;
import dto.Studente;
import eccezioni.associazioni.AssociazioneLezioneCorsoFallitaException;
import eccezioni.create.CreateAreaTematicaFallitoException;
import eccezioni.create.CreateCorsoFallitoException;
import eccezioni.create.CreateLezioneFallitoException;
import eccezioni.create.CreateStudenteDelCorsoFallitoException;
import eccezioni.create.CreateStudenteFallitoException;
import eccezioni.delete.DeleteAreaTematicaFallitoException;
import eccezioni.delete.DeleteCorsoFallitoException;
import eccezioni.delete.DeleteLezioneFallitoException;
import eccezioni.delete.DeleteStudenteDelCorsoFallitoException;
import eccezioni.delete.DeleteStudenteFallitoException;
import eccezioni.update.UpdateAreaTematicaFallitoException;
import eccezioni.update.UpdateCorsoFallitoException;
import eccezioni.update.UpdateLezioneFallitoException;
import eccezioni.update.UpdateStudenteFallitoException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.areeTematiche.PanelAggiornaAreaTematica;
import gui.homeFrame.panels.areeTematiche.PanelAreeTematiche;
import gui.homeFrame.panels.areeTematiche.PanelNuovaAreaTematica;
import gui.homeFrame.panels.corsi.PanelAggiornaCorso;
import gui.homeFrame.panels.corsi.PanelCorsi;
import gui.homeFrame.panels.corsi.PanelNuovoCorso;
import gui.homeFrame.panels.homePage.PanelHomePage;
import gui.homeFrame.panels.lezioni.PanelAggiornaLezione;
import gui.homeFrame.panels.lezioni.PanelLezioni;
import gui.homeFrame.panels.lezioni.PanelNuovaLezione;
import gui.homeFrame.panels.studenti.PanelAggiornaStudente;
import gui.homeFrame.panels.studenti.PanelIscrizioni;
import gui.homeFrame.panels.studenti.PanelNuovoStudente;
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
    private Connection connection;
    
    private LoginFrame loginFrame;
    
    private HomeFrameOperatore homeFrameOperatore;
    
    private PanelHomePage panelHomePage;
    
    private PanelStudenti panelStudenti;
    private PanelNuovoStudente panelNuovoStudente;
    private PanelAggiornaStudente panelAggiornaStudente;
    private PanelIscrizioni panelIscrizioni;
    
    private PanelAreeTematiche panelAreeTematiche;
    private PanelNuovaAreaTematica panelNuovaAreaTematica;
    private PanelAggiornaAreaTematica panelAggiornaAreaTematica;
    
    private PanelCorsi panelCorsi;
    private PanelNuovoCorso panelNuovoCorso;
    private PanelAggiornaCorso panelAggiornaCorso;
    
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
    
    private StudenteDelCorsoDAOImplementazione studenteDelCorsoDAO;
    //attributi
    
    //costruttore
    public Controller(){
    }
    //costruttore
    
    //getters e setters
    public Connection getConnection() {        
        return connection;
    }

    public LoginFrame getLoginFrame() {
        return loginFrame;
    }

    public HomeFrameOperatore getHomeFrameOperatore() {
        return homeFrameOperatore;
    }

    public PanelHomePage getPanelHomePage() {
        return panelHomePage;
    }

    public PanelStudenti getPanelStudenti() {
        return panelStudenti;
    }

    public PanelNuovoStudente getPanelNuovoStudente() {
        return panelNuovoStudente;
    }

    public PanelAreeTematiche getPanelAreeTematiche() {
        return panelAreeTematiche;
    }

    public PanelCorsi getPanelCorsi() {
        return panelCorsi;
    }

    public PanelLezioni getPanelLezioni() {
        return panelLezioni;
    }

    public LinkedList<AreaTematica> getListaAreeTematiche() {
        return listaAreeTematiche;
    }

    public AreaTematicaDAOImplementazione getAreaTematicaDAO() {
        return areaTematicaDAO;
    }

    public LinkedList<Corso> getListaCorsi() {
        return listaCorsi;
    }

    public CorsoDAOImplementazione getCorsoDAO() {
        return corsoDAO;
    }

    public LinkedList<Lezione> getListaLezioni() {
        return listaLezioni;
    }

    public LezioneDAOImplementazione getLezioneDAO() {
        return lezioneDAO;
    }

    public LinkedList<Studente> getListaStudenti() {
        return listaStudenti;
    }

    
    public StudenteDAOImplementazione getStudenteDAO() {    
        return studenteDAO;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setLoginFrame(LoginFrame loginFrame) {
        this.loginFrame = loginFrame;
    }

    public void setHomeFrameOperatore(HomeFrameOperatore homeFrameOperatore) {
        this.homeFrameOperatore = homeFrameOperatore;
    }

    public void setPanelHomePage(PanelHomePage panelHomePage) {
        this.panelHomePage = panelHomePage;
    }

    public void setPanelStudenti(PanelStudenti panelStudenti) {
        this.panelStudenti = panelStudenti;
    }

    public void setPanelNuovoStudente(PanelNuovoStudente panelNuovoStudente) {
        this.panelNuovoStudente = panelNuovoStudente;
    }

    public void setPanelAreeTematiche(PanelAreeTematiche panelAreeTematiche) {
        this.panelAreeTematiche = panelAreeTematiche;
    }

    public void setPanelNuovaAreaTematica(PanelNuovaAreaTematica panelNuovaAreaTematica) {
        this.panelNuovaAreaTematica = panelNuovaAreaTematica;
    }

    public void setPanelCorsi(PanelCorsi panelCorsi) {
        this.panelCorsi = panelCorsi;
    }

    public void setPanelLezioni(PanelLezioni panelLezioni) {
        this.panelLezioni = panelLezioni;
    }

    public void setListaAreeTematiche(LinkedList<AreaTematica> listaAreeTematiche) {
        this.listaAreeTematiche = listaAreeTematiche;
    }

    public void setAreaTematicaDAO(AreaTematicaDAOImplementazione areaTematicaDAO) {
        this.areaTematicaDAO = areaTematicaDAO;
    }

    public void setListaCorsi(LinkedList<Corso> listaCorsi) {
        this.listaCorsi = listaCorsi;
    }

    public void setCorsoDAO(CorsoDAOImplementazione corsoDAO) {
        this.corsoDAO = corsoDAO;
    }

    public void setListaLezioni(LinkedList<Lezione> listaLezioni) {
        this.listaLezioni = listaLezioni;
    }

    public void setLezioneDAO(LezioneDAOImplementazione lezioneDAO) {
        this.lezioneDAO = lezioneDAO;
    }

    public void setListaStudenti(LinkedList<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    public void setStudenteDAO(StudenteDAOImplementazione studenteDAO) {
        this.studenteDAO = studenteDAO;
    }
    //getters e setters
    
    //connessione
    public void avviaConnessione(String userName, String password, String ip, String porta, String db) {        
        chiudiConnessione();
        try {
            setConnection(ConnessioneDB.getIstanza(userName, password, ip, porta, db).getConnection());
            creaDAO();
            retrieveAllDTO();
            loginFrame.connessioneStabilita();
        }
        catch(SQLException | ClassNotFoundException | AssociazioneLezioneCorsoFallitaException e) {
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
    
    //esci
    public void terminaEsecuzione() {
        chiudiConnessione();
        System.exit(0);
    }
    //esci
    
    //DAO
    private void creaDAO() {
        areaTematicaDAO = new AreaTematicaDAOImplementazione(this, connection);
        corsoDAO = new CorsoDAOImplementazione(this, connection);
        lezioneDAO = new LezioneDAOImplementazione(this, connection);    
        studenteDAO = new StudenteDAOImplementazione(this, connection);
        
        studenteDelCorsoDAO = new StudenteDelCorsoDAOImplementazione(this, connection);
    }
    
    public void retrieveAllDTO() throws SQLException, AssociazioneLezioneCorsoFallitaException {
        this.listaAreeTematiche = areaTematicaDAO.retrieveAllAreaTematica();
        this.listaCorsi = corsoDAO.retrieveAllCorso(listaAreeTematiche);
        this.listaLezioni = lezioneDAO.retrieveAllLezione(listaCorsi);
        this.listaStudenti = studenteDAO.retrieveAllStudente(listaCorsi, listaLezioni);
    }
    //DAO
    
    //cambio frame
    public void accessoOperatore(){
        if(homeFrameOperatore == null) {
            homeFrameOperatore = new HomeFrameOperatore(this);
            creaPanel();
            homeFrameOperatore.aggiungiPanels();
        }
        impostaPanelsPrincipali();
        
        loginFrame.setVisible(false);
        homeFrameOperatore.setVisible(true);
    }
    
    public void esciDaOperatore() {
        loginFrame.setVisible(true);
        homeFrameOperatore.setVisible(false);
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
        
        panelAreeTematiche = new PanelAreeTematiche(this, homeFrameOperatore);
        homeFrameOperatore.setPanelAreeTematiche(panelAreeTematiche);
        
        panelNuovaAreaTematica = new PanelNuovaAreaTematica(this, homeFrameOperatore);
        homeFrameOperatore.setPanelNuovaAreaTematica(panelNuovaAreaTematica);
        
        panelAggiornaAreaTematica = new PanelAggiornaAreaTematica(this, homeFrameOperatore);
        homeFrameOperatore.setPanelAggiornaAreaTematica(panelAggiornaAreaTematica);
        
        panelCorsi = new PanelCorsi(this, homeFrameOperatore);
        homeFrameOperatore.setPanelCorsi(panelCorsi);
        
        panelNuovoCorso = new PanelNuovoCorso(this, homeFrameOperatore);
        homeFrameOperatore.setPanelNuovoCorso(panelNuovoCorso);
        
        panelAggiornaCorso = new PanelAggiornaCorso(this, homeFrameOperatore);
        homeFrameOperatore.setPanelAggiornaCorso(panelAggiornaCorso);
        
        panelLezioni = new PanelLezioni(this, homeFrameOperatore);
        homeFrameOperatore.setPanelLezioni(panelLezioni);
        
        panelNuovaLezione = new PanelNuovaLezione(this, homeFrameOperatore);
        homeFrameOperatore.setPanelNuovaLezione(panelNuovaLezione);
        
        panelAggiornaLezione = new PanelAggiornaLezione(this, homeFrameOperatore);
        homeFrameOperatore.setPanelAggiornaLezione(panelAggiornaLezione);
    }
    
    private void impostaPanelsPrincipali() {
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
        
        for(Corso corso : studente.getCorsiFrequentati()) {
            panelStudenti.inserisciInTableCorsiFrequentati(corso.creaRiga());
        }
        
        for(Lezione lezione : studente.getPresenze()) {
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
        catch (SQLException | CreateStudenteFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void eliminaStudente(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        try {
            studenteDAO.deleteStudente(studente);
            studente.rimuoviDaAssociazioni();
            listaStudenti.remove(studente);
            panelStudenti.rimuoviStudenteSelezionato();
            panelStudenti.svuotaTableAssociazioni();
        }
        catch(SQLException | DeleteStudenteFallitoException e) {
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
    
    public void aggiornaPanelIscrizioni(Studente studenteSelezionato) {
        panelIscrizioni.svuotaTableAssociazioni();
        
        for(Corso corso : studenteSelezionato.getCorsiFrequentati()) {
            panelIscrizioni.inserisciInTableCorsiFrequentati(corso.creaRiga());
        }
        for (Corso corso : listaCorsi) {
            if(corso.eFrequentabile(studenteSelezionato)) {
                panelIscrizioni.inserisciInTableCorsiFrequentabili(corso.creaRiga());
            }
        }
    }
    
    public void iscriviAlCorso(Object studenteSelezionato, Object corsoSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        Corso corso = (Corso) corsoSelezionato;
        
        try {
            studenteDelCorsoDAO.createStudenteDelCorso(studente, corso);
            studente.addCorso(corso);
            corso.addStudente(studente);
            aggiornaPanelIscrizioni(studente);
        }
        catch (SQLException | CreateStudenteDelCorsoFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void disiscriviDalCorso(Object studenteSelezionato, Object corsoSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        Corso corso = (Corso) corsoSelezionato;
        
        try {
            studenteDelCorsoDAO.deleteStudenteDelCorso(studente, corso);
            studente.removeCorso(corso);
            corso.removeStudente(studente);
            aggiornaPanelIscrizioni(studente);
        }
        catch (SQLException | DeleteStudenteDelCorsoFallitoException e) {
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
        catch(SQLException | UpdateStudenteFallitoException e) {
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
        catch (SQLException | CreateAreaTematicaFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void eliminaAreaTematica(Object areaTematicaSelezionata) {
        AreaTematica areaTematica = (AreaTematica) areaTematicaSelezionata;
        
        try {
            areaTematicaDAO.deleteAreaTematica(areaTematica);
            areaTematica.rimuoviDaAssociazioni();
            listaAreeTematiche.remove(areaTematica);
            panelAreeTematiche.rimuoviAreaTematicaSelezionata();
            panelAreeTematiche.svuotaTableAssociazioni();
        }
        catch(SQLException | DeleteAreaTematicaFallitoException e) {
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
        catch(SQLException | UpdateAreaTematicaFallitoException e) {
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
        
        for(Lezione lezione : corso.getLezioniDelCorso()) {
            panelCorsi.inserisciInTableLezioniDelCorso(lezione.creaRiga());
        }
        for(Studente studente : corso.getStudentiIscritti()) {
            panelCorsi.inserisciInTableStudentiDelCorso(studente.creaRiga());
        }
        for(AreaTematica areaTematica : corso.getAreeTematicheDelCorso()) {
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
        catch (SQLException | CreateCorsoFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void eliminaCorso(Object corsoSelezionato) {
        Corso corso = (Corso) corsoSelezionato;
        
        try {
            corsoDAO.deleteCorso(corso);
            listaLezioni.removeAll(corso.getLezioniDelCorso());
            corso.rimuoviDaAssociazioni();
            listaCorsi.remove(corso);
            impostaPanelLezioni();
            panelCorsi.rimuoviCorsoSelezionato();
            panelCorsi.svuotaTableAssociazioni();
        }
        catch(SQLException | DeleteCorsoFallitoException e) {
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
        catch(SQLException | UpdateCorsoFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
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
        
        corso.getLezioniDelCorso().add(lezione);
        
        try {
            lezioneDAO.createLezione(lezione);
            listaLezioni.add(lezione);
            panelLezioni.inserisciInTableLezioni(lezione.creaRiga());
        }
        catch (SQLException | CreateLezioneFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void eliminaLezione(Object lezioneSelezionata) {
        Lezione lezione = (Lezione) lezioneSelezionata;
        
        try {
            lezioneDAO.deleteLezione(lezione);
            lezione.rimuoviDaAssociazioni();
            listaLezioni.remove(lezione);
            panelLezioni.rimuoviLezioneSelezionata();
            panelLezioni.svuotaTableAssociazioni();
        }
        catch(SQLException | DeleteLezioneFallitoException e) {
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
        
        //System.out.println(Date.from(lezione.getDataInizio().toInstant()));
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
        catch(SQLException | UpdateLezioneFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    //sezione lezioni
}
