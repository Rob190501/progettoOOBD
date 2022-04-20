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
import gui.homeFrame.panels.studenti.PanelNuovaIscrizione;
import gui.homeFrame.panels.studenti.PanelNuovoStudente;
import gui.homeFrame.panels.studenti.PanelStudenti;
import gui.login.LoginFrame;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

public class Controller {
    
    //attributi
    private Connection connection;
    
    private LoginFrame loginFrame;
    
    private HomeFrameOperatore homeFrameOperatore;
    
    private PanelHomePage panelHomePage;
    
    private PanelStudenti panelStudentiHome;
    private PanelNuovoStudente panelNuovoStudente;
    private PanelNuovaIscrizione panelNuovaIscrizione;
    
    private PanelAreeTematiche panelAreeTematicheHome;
    
    private PanelCorsi panelCorsiHome;
    
    private PanelLezioni panelLezioniHome;
    
    private LinkedList<AreaTematica> listaAreeTematiche;
    private AreaTematicaDAOImplementazione areaTematicaDAO;
    
    private LinkedList<Corso> listaCorsi;
    private CorsoDAOImplementazione corsoDAO;
    
    private LinkedList<Lezione> listaLezioni;
    private LezioneDAOImplementazione lezioneDAO;
    
    private LinkedList<Studente> listaStudenti;
    private StudenteDAOImplementazione studenteDAO;
    //fine attributi
    
    //costruttore
    public Controller(){
    }
    //fine costruttore
    
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

    public PanelStudenti getPanelStudentiHome() {
        return panelStudentiHome;
    }

    public PanelNuovoStudente getPanelNuovoStudente() {
        return panelNuovoStudente;
    }

    public PanelAreeTematiche getPanelAreeTematicheHome() {
        return panelAreeTematicheHome;
    }

    public PanelCorsi getPanelCorsiHome() {
        return panelCorsiHome;
    }

    public PanelLezioni getPanelLezioniHome() {
        return panelLezioniHome;
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

    public void setPanelStudentiHome(PanelStudenti panelStudentiHome) {
        this.panelStudentiHome = panelStudentiHome;
    }

    public void setPanelNuovoStudente(PanelNuovoStudente panelNuovoStudente) {
        this.panelNuovoStudente = panelNuovoStudente;
    }

    public void setPanelAreeTematicheHome(PanelAreeTematiche panelAreeTematicheHome) {
        this.panelAreeTematicheHome = panelAreeTematicheHome;
    }

    public void setPanelCorsiHome(PanelCorsi panelCorsiHome) {
        this.panelCorsiHome = panelCorsiHome;
    }

    public void setPanelLezioniHome(PanelLezioni panelLezioniHome) {
        this.panelLezioniHome = panelLezioniHome;
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
    //fine getters e setters
    
    //connessione
    public void avviaConnessione(String userName, String password, String ip, String porta, String db) {        
        chiudiConnessione();
        try {
            setConnection(ConnessioneDB.getIstanza(userName, password, ip, porta, db).getConnection());
            avviaDAO();
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
    //fine connessione
    
    //esci
    public void terminaEsecuzione() {
        chiudiConnessione();
        System.exit(0);
    }
    //fine esci
    
    
    
    //DAO
    private void avviaDAO() {
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
    //fine DAO
    
    //ricerca
    /*
    public AreaTematica cercaAreaTematica(int codice) throws AreaTematicaNonTrovataException {
        for(AreaTematica areaTematica : listaAreeTematiche) {
            if(areaTematica.getCodice() == codice) {
                return areaTematica;
            }
        }
        throw new AreaTematicaNonTrovataException();
    }
    
    public Corso cercaCorso(int codice) throws CorsoNonTrovatoException {
        for(Corso corso : listaCorsi) {
            if(corso.getCodice() == codice) {
                return corso;
            }
        }
        throw new CorsoNonTrovatoException();
    }
    
    public Lezione cercaLezione(int codice) throws AreaTematicaNonTrovataException {
        for(Lezione lezione : listaLezioni) {
            if(lezione.getCodice() == codice) {
                return lezione;
            }
        }
        throw new AreaTematicaNonTrovataException();
    }
    
    public Studente cercaStudente(int matricola) throws StudenteNonTrovatoException {
        for(Studente studente : listaStudenti) {
            if(studente.getMatricola() == matricola) {
                return studente;
            }
        }
        throw new StudenteNonTrovatoException();
    }
    */
    //fine ricerca
    
    //cambio frame
    public void accessoOperatore(){
        loginFrame.setVisible(false);
        
        if(homeFrameOperatore == null) {
            homeFrameOperatore = new HomeFrameOperatore(this);
            creaPanels();
            homeFrameOperatore.aggiungiPanels();
        }
        
        riempiTablePrincipali();
        homeFrameOperatore.setVisible(true);
    }
    
    public void esciDaOperatore() {
        loginFrame.setVisible(true);
        homeFrameOperatore.setVisible(false);
    }
    
    private void creaPanels() {
        panelHomePage = new PanelHomePage(this, homeFrameOperatore);
        homeFrameOperatore.setPanelHomePage(panelHomePage);
        
        panelStudentiHome = new PanelStudenti(this, homeFrameOperatore);
        homeFrameOperatore.setPanelStudentiHome(panelStudentiHome);
        
        panelNuovoStudente = new PanelNuovoStudente(this, homeFrameOperatore);
        homeFrameOperatore.setPanelNuovoStudente(panelNuovoStudente);
        
        panelNuovaIscrizione = new PanelNuovaIscrizione(this, homeFrameOperatore);
        homeFrameOperatore.setPanelNuovaIscrizione(panelNuovaIscrizione);
        
        panelAreeTematicheHome = new PanelAreeTematiche(this, homeFrameOperatore);
        homeFrameOperatore.setPanelAreeTematicheHome(panelAreeTematicheHome);
        
        panelCorsiHome = new PanelCorsi(this, homeFrameOperatore);
        homeFrameOperatore.setPanelCorsiHome(panelCorsiHome);
        
        panelLezioniHome = new PanelLezioni(this, homeFrameOperatore);
        homeFrameOperatore.setPanelLezioniHome(panelLezioniHome);
    }
    
    private void riempiTablePrincipali() {
        svuotaTutteTable();
        inserisciTuttiStudenti();
        inserisciTutteAreeTematiche();
        inserisciTuttiICorsi();
        inserisciTutteLezioni();
    }
    
    private void svuotaTutteTable() {
        panelStudentiHome.svuotaTutteTable();
        panelAreeTematicheHome.svuotaTutteTable();
        panelCorsiHome.svuotaTutteTable();
        panelLezioniHome.svuotaTutteTable();        
    }
    //fine cambio frame
    
    
    
    //sezione home page
    public void aggiornaInformazioniHomePage() {
        panelHomePage.impostaInformazioniHomePage(listaStudenti.size(), listaAreeTematiche.size(), listaCorsi.size(), listaLezioni.size());
    }
    //sezione panel home page
    
    
    
    //sezione studenti
    
    public void aggiornaPanelStudenti(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        for(Corso corso : studente.getCorsiFrequentati()) {
            panelStudentiHome.inserisciInTableCorsiFrequentati(corso.creaRiga());
        }
        
        for(Lezione lezione : studente.getPresenze()) {
            panelStudentiHome.inserisciInTablePresenze(lezione.creaRiga());
        }
    }
    
    
    
    public void inserisciTuttiStudenti() {
        for(Studente studente : listaStudenti) {
            panelStudentiHome.inserisciInTableStudenti(studente.creaRiga());
        }
    }
    
    /*public void inserisciCorsiFrequentati(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        for(Corso corso : studente.getCorsiFrequentati()) {
            panelStudentiHome.inserisciInTableCorsiFrequentati(corso.creaRiga());
        }
    }
    
    public void inserisciPresenze(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        for(Lezione lezione : studente.getPresenze()) {
            panelStudentiHome.inserisciInTablePresenze(lezione.creaRiga());
        }
    }*/
    
    public void nuovoStudente(String nome, String cognome) {
        Studente studente = new Studente(nome, cognome);
        
        try {
            studenteDAO.createStudente(studente);
            listaStudenti.add(studente);
            panelStudentiHome.inserisciInTableStudenti(studente.creaRiga());
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
    
    public void impostaPanelNuovaIscrizione(Object studenteSelezionato) {
        panelNuovaIscrizione.svuotaTutteTable();
        aggiornaPanelNuovaIscrizione(studenteSelezionato);
        Studente studente = (Studente) studenteSelezionato;
        panelNuovaIscrizione.inserisciStudenteSelezionato(studente.creaRiga());
        /*inserisciCorsiFrequentati(studente);
        inserisciCorsiFrequentabili(studente);*/
    }
    
    public void aggiornaPanelNuovaIscrizione(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        panelNuovaIscrizione.svuotaTableAssociazioni();
        inserisciCorsiFrequentati(studente);
        inserisciCorsiFrequentabili(studente);
    }
    
    public void inserisciCorsiFrequentati(Studente studente) {
        for(Corso corso : studente.getCorsiFrequentati()) {
            panelNuovaIscrizione.inserisciInTableCorsiFrequentati(corso.creaRiga());
        }
    }
    
    public void inserisciCorsiFrequentabili(Studente studente) {
        for (Corso corso : listaCorsi) {
            if(corso.eFrequentabile(studente)) {
                panelNuovaIscrizione.inserisciInTableCorsiFrequentabili(corso.creaRiga());
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
    //fine sezione studenti
    
    
    //sezione aree tematiche
    public void inserisciTutteAreeTematiche() {
        for(AreaTematica areaTematica : listaAreeTematiche) {
            panelAreeTematicheHome.inserisciInTableAreeTematiche(areaTematica.creaRiga());
        }
    }
    
    public void inserisciTuttiCorsiDellArea(Object areaSelezionata) {
        AreaTematica areaTematica = (AreaTematica) areaSelezionata;
        for(Corso corso : areaTematica.getCorsiDellAreaTematica()) {
            panelAreeTematicheHome.inserisciInTableCorsiDellArea(corso.creaRiga());
        }
    }
    //fine sezione aree tematiche
    
    //sezione corsi
    public void inserisciTuttiICorsi() {
        for(Corso corso : listaCorsi) {
            panelCorsiHome.inserisciInTableCorsi(corso.creaRiga());
        }
    }
    
    public void inserisciLezioniDelCorso(Object corsoSelezionato) {
        Corso corso = (Corso) corsoSelezionato;
        for(Lezione lezione : corso.getLezioniDelCorso()) {
            panelCorsiHome.inserisciInTableLezioniDelCorso(lezione.creaRiga());
        }
    }
    
    public void inserisciStudentiDelCorso(Object corsoSelezionato) {
        Corso corso = (Corso) corsoSelezionato;
        for(Studente studente : corso.getStudentiIscritti()) {
            panelCorsiHome.inserisciInTableStudentiDelCorso(studente.creaRiga());
        }
    }
    
    public void inserisciAreeDelCorsoInJTable(Object corsoSelezionato) {
        Corso corso = (Corso) corsoSelezionato;
        for(AreaTematica areaTematica : corso.getAreeTematicheDelCorso()) {
            panelCorsiHome.inserisciInTableAreeDelCorso(areaTematica.creaRiga());
        }
    }
    //fine sezione corsi
    
    //sezione lezioni
    public void inserisciTutteLezioni() {
        for(Lezione lezione : listaLezioni) {
            panelLezioniHome.inserisciInTableLezioni(lezione.creaRiga());
        }
    }
    
    public void inserisciStudentiPresenti(Object lezioneSelezionata) {
        Lezione lezione = (Lezione) lezioneSelezionata;
        for(Studente studente : lezione.getStudentiPresenti()) {
            panelLezioniHome.inserisciInTableStudentiPresenti(studente.creaRiga());
        }
    }
    
    public void inserisciCorsoDellaLezione(Object lezioneSelezionata) {
        Lezione lezione = (Lezione) lezioneSelezionata;
        Corso corso = lezione.getCorsoDellaLezione();
        panelLezioniHome.inserisciInTableCorsoDellaLezione(corso.creaRiga());
    }
    //fine sezione lezioni
    
    
    
    
    
    //main
    public static void main(String[] args){        
        Controller controller = new Controller();
        controller.setLoginFrame(new LoginFrame(controller));
        controller.getLoginFrame().setVisible(true);
    }
}
