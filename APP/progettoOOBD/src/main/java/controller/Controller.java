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
import gui.home.HomeFrameOperatore;
import gui.home.studenti.PanelStudentiHome;
import gui.login.LoginFrame;
import java.sql.Connection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    
    private Connection connection = null;
    private LoginFrame loginFrame;
    private HomeFrameOperatore homeFrameOperatore;
    
    private PanelStudentiHome panelStudentiHome;
    
    private LinkedList<AreaTematica> listaAreeTematiche;
    private AreaTematicaDAOImplementazione areaTematicaDAO;
    
    private LinkedList<Corso> listaCorsi;
    private CorsoDAOImplementazione corsoDAO;
    
    private LinkedList<Lezione> listaLezioni;
    private LezioneDAOImplementazione lezioneDAO;
    
    private LinkedList<Studente> listaStudenti;
    private StudenteDAOImplementazione studenteDAO;
    
    
    public Controller(){
        loginFrame = new LoginFrame(this);
        loginFrame.setVisible(true);
    }

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
    
    public void setPanelStudentiHome(PanelStudentiHome panelStudentiHome) {
        this.panelStudentiHome = panelStudentiHome;
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
    
    public boolean avviaConnessione(String userName, String password, String ip, String porta, String db) {        
        chiudiConnessione();
        try {
            setConnection(ConnessioneDB.getIstanza(userName, password, ip, porta, db).getConnection());
            avviaDAO();
            return true;
        }
        catch(Exception e) {
            System.out.println("Connessione fallita");
            return false;
        }
    }
    
    public void chiudiConnessione() {
        if(connection != null){
            try {
                connection.close();
            }
            catch(Exception e) {
                System.out.println("Impossibile chiudere la connessione");
            }
        }
    }
    
    public void avviaDAO() {
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
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void accessoOperatore(){
        loginFrame.setVisible(false);
        
        if(homeFrameOperatore == null) {
            homeFrameOperatore = new HomeFrameOperatore(this);
        }
        
        homeFrameOperatore.setVisible(true);
    }
    
    public void esciDaOperatore() {
        loginFrame.setVisible(true);
        homeFrameOperatore.setVisible(false);
    }
    
    public void terminaEsecuzione() {
        chiudiConnessione();
        System.exit(0);
    }
    
    public void informazioniHomePage() {
        homeFrameOperatore.impostaInformazioniHomePage(listaStudenti.size(), listaAreeTematiche.size(), listaCorsi.size(), listaLezioni.size());
    }
    
    public void inserisciTuttiStudentiInJTable() {
        for(Studente studente : listaStudenti) {
            Object[] row = {studente, studente.getMatricola(), studente.getNome(), studente.getCognome()};
            panelStudentiHome.inserisciStudenteInTableStudenti(row);
        }
    }
    
    public void inserisciStudenteInJTable(Studente studente) {
        Object[] row = {studente, studente.getMatricola(), studente.getNome(), studente.getCognome()};
        panelStudentiHome.inserisciStudenteInTableStudenti(row);
    }
    
    public void inserisciCorsiFrequentatiInJTable(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        for(Corso corso : studente.getCorsiFrequentati()) {
            Object[] row = {corso, corso.getCodiceCorso(), corso.getNomeCorso(), corso.getDescrizioneCorso()};
            panelStudentiHome.inserisciCorsoInTableCorsiFrequentati(row);
        }
    }
    
    public void inserisciPresenzeInJTable(Object studenteSelezionato) {
        Studente studente = (Studente) studenteSelezionato;
        
        for(Lezione lezione : studente.getPresenze()) {
            Object[] row = {lezione, lezione.getCodiceLezione(), lezione.getTitoloLezione(), lezione.getDataInizio(), lezione.getCorsoDellaLezione().getNomeCorso()};
            panelStudentiHome.inserisciLezioneInTablePresenze(row);
        }
    }
    
    public void nuovoStudente(String nome, String cognome) {
        Studente studente = new Studente(nome, cognome);
        
        try {
            studenteDAO.createStudente(studente);
            listaStudenti.add(studente);
            inserisciStudenteInJTable(studente);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args){        
        Controller c = new Controller();
        
    }
}
