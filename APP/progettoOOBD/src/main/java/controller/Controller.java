package controller;

import connessione.ConnessioneDB;
import dao.implementazione.postgresql.AreaTematicaDAOImplementazione;
import dao.implementazione.postgresql.CorsoDAOImplementazione;
import dao.implementazione.postgresql.LezioneDAOImplementazione;
import dao.implementazione.postgresql.StudenteDAOImplementazione;
import dto.AreaTematica;
import dto.Corso;
import dto.Lezione;
import dto.Studente;
import eccezioni.associazioni.AssociazioneCorsoAreaTematicaFallitaException;
import eccezioni.associazioni.AssociazioneLezioneCorsoFallitaException;
import eccezioni.associazioni.AssociazioneStudenteCorsoFallitaException;
import eccezioni.associazioni.AssociazioneStudenteLezioneFallitaException;
import eccezioni.create.CreateStudenteDelCorsoFallitoException;
import eccezioni.create.CreateStudenteFallitoException;
import eccezioni.delete.DeleteStudenteDelCorsoFallitoException;
import eccezioni.delete.DeleteStudenteFallitoException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.areeTematiche.PanelAreeTematiche;
import gui.homeFrame.panels.corsi.PanelCorsi;
import gui.homeFrame.panels.homePage.PanelHomePage;
import gui.homeFrame.panels.lezioni.PanelLezioni;
import gui.homeFrame.panels.studenti.PanelIscrizioni;
import gui.homeFrame.panels.studenti.PanelNuovoStudente;
import gui.homeFrame.panels.studenti.PanelStudenti;
import gui.login.LoginFrame;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

public class Controller {
    
    //attributi
    private Connection connection;
    
    private LoginFrame loginFrame;
    
    private HomeFrameOperatore homeFrameOperatore;
    
    private PanelHomePage panelHomePage;
    
    private PanelStudenti panelStudenti;
    private PanelNuovoStudente panelNuovoStudente;
    private PanelIscrizioni panelIscrizioni;
    
    private PanelAreeTematiche panelAreeTematiche;
    
    private PanelCorsi panelCorsi;
    
    private PanelLezioni panelLezioni;
    
    private LinkedList<AreaTematica> listaAreeTematiche;
    private AreaTematicaDAOImplementazione areaTematicaDAO;
    
    private LinkedList<Corso> listaCorsi;
    private CorsoDAOImplementazione corsoDAO;
    
    private LinkedList<Lezione> listaLezioni;
    private LezioneDAOImplementazione lezioneDAO;
    
    private LinkedList<Studente> listaStudenti;
    private StudenteDAOImplementazione studenteDAO;
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
        catch(SQLException | ClassNotFoundException | AssociazioneCorsoAreaTematicaFallitaException |
              AssociazioneLezioneCorsoFallitaException | AssociazioneStudenteCorsoFallitaException | AssociazioneStudenteLezioneFallitaException e) {
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
    }
    
    public void retrieveAllDTO() throws SQLException, AssociazioneCorsoAreaTematicaFallitaException, AssociazioneLezioneCorsoFallitaException,
                                        AssociazioneStudenteCorsoFallitaException, AssociazioneStudenteLezioneFallitaException {
        setListaAreeTematiche(areaTematicaDAO.retrieveAllAreaTematica());
        setListaCorsi(corsoDAO.retrieveAllCorso(listaAreeTematiche));
        setListaLezioni(lezioneDAO.retrieveAllLezione(listaCorsi));
        setListaStudenti(studenteDAO.retrieveAllStudente(listaCorsi, listaLezioni));
    }
    //DAO
    
    //cambio frame
    public void accessoOperatore(){
        if(homeFrameOperatore == null) {
            homeFrameOperatore = new HomeFrameOperatore(this);
            creaPanels();
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
    
    private void creaPanels() {
        panelHomePage = new PanelHomePage(this, homeFrameOperatore);
        homeFrameOperatore.setPanelHomePage(panelHomePage);
        
        panelStudenti = new PanelStudenti(this, homeFrameOperatore);
        homeFrameOperatore.setPanelStudenti(panelStudenti);
        
        panelNuovoStudente = new PanelNuovoStudente(this, homeFrameOperatore);
        homeFrameOperatore.setPanelNuovoStudente(panelNuovoStudente);
        
        panelIscrizioni = new PanelIscrizioni(this, homeFrameOperatore);
        homeFrameOperatore.setPanelIscrizioni(panelIscrizioni);
        
        panelAreeTematiche = new PanelAreeTematiche(this, homeFrameOperatore);
        homeFrameOperatore.setPanelAreeTematiche(panelAreeTematiche);
        
        panelCorsi = new PanelCorsi(this, homeFrameOperatore);
        homeFrameOperatore.setPanelCorsi(panelCorsi);
        
        panelLezioni = new PanelLezioni(this, homeFrameOperatore);
        homeFrameOperatore.setPanelLezioni(panelLezioni);
    }
    
    private void impostaPanelsPrincipali() {
        impostaPanelStudenti();
        impostaPanelAreeTematiche();
        impostaPanelCorsi();
        impostaPanelLezioni();
    }
    //cambio frame
    
    //imposta panels
    public void impostaPanelStudenti() {
        panelStudenti.svuotaTutteTable();
        for(Studente studente : listaStudenti) {
            panelStudenti.inserisciInTableStudenti(studente.creaRiga());
        }
    }
    
    public void impostaPanelIscrizioni(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        panelIscrizioni.svuotaTutteTable();
        panelIscrizioni.inserisciStudenteSelezionato(studente.creaRiga());
        aggiornaPanelIscrizioni(studenteSelezionato);
    }
    
    public void impostaPanelAreeTematiche() {
        panelAreeTematiche.svuotaTutteTable();
        for(AreaTematica areaTematica : listaAreeTematiche) {
            panelAreeTematiche.inserisciInTableAreeTematiche(areaTematica.creaRiga());
        }
    }
    
    public void impostaPanelCorsi() {
        panelCorsi.svuotaTutteTable();
        for(Corso corso : listaCorsi) {
            panelCorsi.inserisciInTableCorsi(corso.creaRiga());
        }
    }
    
    public void impostaPanelLezioni() {
        panelLezioni.svuotaTutteTable(); 
        for(Lezione lezione : listaLezioni) {
            panelLezioni.inserisciInTableLezioni(lezione.creaRiga());
        }
    }
    //imposta panels
    
    //sezione home page
    public void aggiornaHomePage() {
        panelHomePage.impostaInformazioniHomePage(listaStudenti.size(), listaAreeTematiche.size(), listaCorsi.size(), listaLezioni.size());
    }
    //sezione home page
    
    //sezione studenti
    public void aggiornaPanelStudenti(Object studenteSelezionato) {
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
        }
        catch(SQLException | DeleteStudenteFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    
    public void aggiornaPanelIscrizioni(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        panelIscrizioni.svuotaTableAssociazioni();
        
        for(Corso corso : studente.getCorsiFrequentati()) {
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
            studenteDAO.createStudenteDelCorso(studente, corso);
            studente.addCorso(corso);
            corso.addStudente(studente);
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
            studenteDAO.deleteStudenteDelCorso(studente, corso);
            studente.removeCorso(corso);
            corso.removeStudente(studente);
        }
        catch (SQLException | DeleteStudenteDelCorsoFallitoException e) {
            homeFrameOperatore.mostraEccezione(e.getMessage());
            chiudiConnessionePerErrori();
        }
    }
    //sezione studenti
    
    //sezione aree tematiche
    public void aggiornaPanelAreeTematiche(Object areaSelezionata) {
        AreaTematica areaTematica = (AreaTematica) areaSelezionata;
        
        panelAreeTematiche.svuotaTableAssociazioni();
        
        for(Corso corso : areaTematica.getCorsiDellAreaTematica()) {
            panelAreeTematiche.inserisciInTableCorsiDellArea(corso.creaRiga());
        }
    }
    //sezione aree tematiche
    
    //sezione corsi
    public void aggiornaPanelCorsi(Object corsoSelezionato) {
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
    //sezione corsi
    
    //sezione lezioni
    public void aggiornaPanelLezioni(Object lezioneSelezionata) {
        Lezione lezione = (Lezione) lezioneSelezionata;
        
        panelLezioni.svuotaTableAssociazioni();
        
        for(Studente studente : lezione.getStudentiPresenti()) {
            panelLezioni.inserisciInTableStudentiPresenti(studente.creaRiga());
        }
        
        panelLezioni.inserisciInTableCorsoDellaLezione(lezione.getCorsoDellaLezione().creaRiga());
    }
    //sezione lezioni
    
    //main
    public static void main(String[] args){        
        Controller controller = new Controller();
        controller.setLoginFrame(new LoginFrame(controller));
        controller.getLoginFrame().setVisible(true);
    }
}
