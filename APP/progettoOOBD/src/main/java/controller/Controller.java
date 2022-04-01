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
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.areeTematiche.PanelAreeTematicheHome;
import gui.homeFrame.panels.corsi.PanelCorsiHome;
import gui.homeFrame.panels.homePage.PanelHomePage;
import gui.homeFrame.panels.lezioni.PanelLezioniHome;
import gui.homeFrame.panels.studenti.PanelNuovoStudente;
import gui.homeFrame.panels.studenti.PanelStudentiHome;
import gui.login.LoginFrame;
import java.sql.Connection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    
    //attributi
    private Connection connection = null;
    
    private LoginFrame loginFrame;
    
    private HomeFrameOperatore homeFrameOperatore;
    
    private PanelHomePage panelHomePage;
    
    private PanelStudentiHome panelStudentiHome;
    private PanelNuovoStudente panelNuovoStudente;
    
    private PanelAreeTematicheHome panelAreeTematicheHome;
    
    private PanelCorsiHome panelCorsiHome;
    
    private PanelLezioniHome panelLezioniHome;
    
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
        loginFrame = new LoginFrame(this);
        loginFrame.setVisible(true);
    }
    //fine costruttore

    
    
    //getters e setters
    public Connection getConnection() {
        return connection;
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
    
    private void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public void setPanelHomePage(PanelHomePage panelHomePage) {
        this.panelHomePage = panelHomePage;
    }
    
    public void setPanelStudentiHome(PanelStudentiHome panelStudentiHome) {
        this.panelStudentiHome = panelStudentiHome;
    }
    
    public void setPanelNuovoStudente(PanelNuovoStudente panelNuovoStudente) {
        this.panelNuovoStudente = panelNuovoStudente;
    }
    
    public void setPanelAreeTematicheHome(PanelAreeTematicheHome panelAreeTematicheHome) {
        this.panelAreeTematicheHome = panelAreeTematicheHome;
    }
    
    public void setPanelCorsiHome(PanelCorsiHome panelCorsiHome) {
        this.panelCorsiHome = panelCorsiHome;
    }

    public void setPanelLezioniHome(PanelLezioniHome panelLezioniHome) {
        this.panelLezioniHome = panelLezioniHome;
    }
    
    private void setListaAreeTematiche(LinkedList<AreaTematica> listaAreeTematiche) {
        this.listaAreeTematiche = listaAreeTematiche;
    }

    private void setListaCorsi(LinkedList<Corso> listaCorsi) {
        this.listaCorsi = listaCorsi;
    }

    private void setListaLezioni(LinkedList<Lezione> listaLezioni) {
        this.listaLezioni = listaLezioni;
    }

    private void setListaStudenti(LinkedList<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }
    //fine getters e setters
    
    
    
    //connessione
    public boolean avviaConnessione(String userName, String password, String ip, String porta, String db) {        
        chiudiConnessione();
        try {
            setConnection(ConnessioneDB.getIstanza(userName, password, ip, porta, db).getConnection());
            avviaDAO();
            return true;
        }
        catch(Exception e) {
            loginFrame.mostraEccezione(e);
            return false;
        }
    }
    
    public void chiudiConnessione() {
        if(connection != null){
            try {
                connection.close();
            }
            catch(Exception e) {
                if(loginFrame.isVisible()) {
                    loginFrame.mostraEccezione(e);
                }
                if(homeFrameOperatore.isVisible()) {
                    homeFrameOperatore.mostraEccezione(e);
                }
            }
        }
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
        try {
            areaTematicaDAO = new AreaTematicaDAOImplementazione(this, connection);
            
            setListaAreeTematiche(areaTematicaDAO.retrieveAllAreaTematica());
            
            corsoDAO = new CorsoDAOImplementazione(this, connection);
            
            setListaCorsi(corsoDAO.retrieveAllCorso(listaAreeTematiche));
            
            lezioneDAO = new LezioneDAOImplementazione(this, connection);
            
            setListaLezioni(lezioneDAO.retrieveAllLezione(listaCorsi));
            
            studenteDAO = new StudenteDAOImplementazione(this, connection);
            
            setListaStudenti(studenteDAO.retrieveAllStudente(listaCorsi, listaLezioni));
        }
        catch (Exception e) {
            loginFrame.mostraEccezione(e);
        }
    }
    //fine DAO
    
    
    
    //cambio frame
    public void accessoOperatore(){
        loginFrame.setVisible(false);
        
        if(homeFrameOperatore == null) {
            homeFrameOperatore = new HomeFrameOperatore(this);
        }
        
        riempiTablePrincipali();
        
        homeFrameOperatore.setVisible(true);
    }
    
    public void esciDaOperatore() {
        loginFrame.setVisible(true);
        homeFrameOperatore.setVisible(false);
    }
    
    private void riempiTablePrincipali() {
        svuotaTutteTable();
        inserisciTuttiStudentiInJTable();
        inserisciTutteAreeTematicheInJTable();
        inserisciTuttiICorsiInJTable();
        inserisciTutteLezioniInJTable();
    }
    
    private void svuotaTutteTable() {
        panelStudentiHome.svuotaTutteTable();
        panelAreeTematicheHome.svuotaTutteTable();
        panelCorsiHome.svuotaTutteTable();
        panelLezioniHome.svuotaTutteTable();        
    }
    //fine cambio frame
    
    
    //panel home page
    public void informazioniHomePage() {
        panelHomePage.impostaInformazioniHomePage(listaStudenti.size(), listaAreeTematiche.size(), listaCorsi.size(), listaLezioni.size());
    }
    //fine panel home page
    
    
    
    //panel studenti
    public void inserisciTuttiStudentiInJTable() {
        for(Studente studente : listaStudenti) {
            Object[] row = {studente, studente.getMatricola(), studente.getNome(), studente.getCognome()};
            panelStudentiHome.inserisciRigaInTableStudenti(row);
        }
    }
    
    public void inserisciStudenteInJTable(Studente studente) {
        Object[] row = {studente, studente.getMatricola(), studente.getNome(), studente.getCognome()};
        panelStudentiHome.inserisciRigaInTableStudenti(row);
    }
    
    public void inserisciCorsiFrequentatiInJTable(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        for(Corso corso : studente.getCorsiFrequentati()) {
            Object[] row = {corso, corso.getCodice(), corso.getNome(), corso.getDescrizione()};
            panelStudentiHome.inserisciRigaInTableCorsiFrequentati(row);
        }
    }
    
    public void inserisciPresenzeInJTable(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        for(Lezione lezione : studente.getPresenze()) {
            Object[] row = {lezione, lezione.getCodice(), lezione.getTitolo(), lezione.getDataInizio(), lezione.getCorsoDellaLezione().getNome()};
            panelStudentiHome.inserisciRigaInTablePresenze(row);
        }
    }
    
    public void nuovoStudente(String nome, String cognome) {
        Studente studente = new Studente(nome, cognome);
        
        try {
            studenteDAO.createStudente(studente);
            listaStudenti.add(studente);
            inserisciStudenteInJTable(studente);
        } catch (Exception e) {
            homeFrameOperatore.mostraEccezione(e);
        }
    }
    
    public void eliminaStudente(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        try {
            studenteDAO.deleteStudente(studente);
            studente.rimuoviStudenteDaAssociazioni();
            listaStudenti.remove(studente);
        }
        catch(Exception e) {
            homeFrameOperatore.mostraEccezione(e);
        }
    }
    //fine panel studenti
    
    
    //panel aree tematiche
    public void inserisciTutteAreeTematicheInJTable() {
        for(AreaTematica areaTematica : listaAreeTematiche) {
            Object[] row = {areaTematica, areaTematica.getCodice(), areaTematica.getNome(), areaTematica.getDescrizione()};
            panelAreeTematicheHome.inserisciRigaInTableAreeTematiche(row);
        }
    }
    
    public void inserisciCorsiDellAreaInJTable(Object areaSelezionata) {
        AreaTematica areaTematica = (AreaTematica) areaSelezionata;
        for(Corso corso : areaTematica.getCorsiDellAreaTematica()) {
            Object row[] = {corso, corso.getCodice(), corso.getNome(), corso.getDescrizione(), corso.getTassoPresenzeMinime(), corso.getNumeroMassimoIscritti()};
            panelAreeTematicheHome.inserisciRigaInTableCorsiDellArea(row);
        }
    }
    //fine panel aree tematiche
    
    //panel corsi
    public void inserisciTuttiICorsiInJTable() {
        for(Corso corso : listaCorsi) {
            Object row[] = {corso, corso.getCodice(), corso.getNome(), corso.getDescrizione(), corso.getTassoPresenzeMinime(), corso.getNumeroMassimoIscritti()};
            panelCorsiHome.inserisciRigaInTableCorsi(row);
        }
    }
    
    public void inserisciLezioniDelCorsoInJTable(Object corsoSelezionato) {
        Corso corso = (Corso) corsoSelezionato;
        for(Lezione lezione : corso.getLezioniDelCorso()) {
            Object row[] = {lezione, lezione.getCodice(), lezione.getTitolo(), lezione.getDescrizione(), lezione.getDataInizio(), lezione.getOraInizio(), lezione.getDurata()};
            panelCorsiHome.inserisciRigaInTableLezioniDelCorso(row);
        }
    }
    
    public void inserisciStudenteDelCorsoInJTable(Object corsoSelezionato) {
        Corso corso = (Corso) corsoSelezionato;
        for(Studente studente : corso.getStudentiIscritti()) {
            Object row[] = {studente, studente.getMatricola(), studente.getNome(), studente.getCognome()};
            panelCorsiHome.inserisciRigaInTableStudentiIscritti(row);
        }
    }
    
    public void inserisciAreeDelCorsoInJTable(Object corsoSelezionato) {
        Corso corso = (Corso) corsoSelezionato;
        for(AreaTematica areaTematica : corso.getAreeTematicheDelCorso()) {
            Object row[] = {areaTematica, areaTematica.getCodice(), areaTematica.getNome(), areaTematica.getDescrizione()};
            panelCorsiHome.inserisciRigaInTableAreeDelCorso(row);
        }
    }
    //fine panel corsi
    
    //panel lezioni
    public void inserisciTutteLezioniInJTable() {
        for(Lezione lezione : listaLezioni) {
            Object row[] = {lezione, lezione.getCodice(), lezione.getTitolo(), lezione.getDescrizione(), lezione.getDataInizio(), lezione.getOraInizio(), lezione.getDurata()};
            panelLezioniHome.inserisciRigaInTableLezioni(row);
        }
    }
    
    public void inserisciStudentiPresentiInJTable(Object lezioneSelezionata) {
        Lezione lezione = (Lezione) lezioneSelezionata;
        for(Studente studente : lezione.getStudentiPresenti()) {
            Object row[] = {studente, studente.getMatricola(), studente.getNome(), studente.getCognome()};
            panelLezioniHome.inserisciRigaInTableStudentiPresenti(row);
        }
    }
    
    public void inserisciCorsoDellaLezioneInJTable(Object lezioneSelezionata) {
        Lezione lezione = (Lezione) lezioneSelezionata;
        Corso corsoDellaLezione = lezione.getCorsoDellaLezione();
        Object row[] = {corsoDellaLezione, corsoDellaLezione.getCodice(), corsoDellaLezione.getNome(), corsoDellaLezione.getDescrizione()};
        panelLezioniHome.inserisciRigaInTableCorsoDellaLezione(row);
    }
    //fine panel lezioni
    
    
    
    
    
    //main
    public static void main(String[] args){        
        Controller c = new Controller();
        
    }
}
