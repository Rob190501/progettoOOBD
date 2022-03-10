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
import gui.HomeFrameOperatore;
import gui.LoginFrame;
import java.sql.Connection;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controller {
    
    private Connection connection = null;
    private LoginFrame loginFrame;
    private HomeFrameOperatore homeFrameOperatore;
    
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
            areaTematicaDAO = new AreaTematicaDAOImplementazione(this);
            
            setListaAreeTematiche(areaTematicaDAO.retrieveAllAreaTematica());
            
            corsoDAO = new CorsoDAOImplementazione(this);
            
            setListaCorsi(corsoDAO.retrieveAllCorso(listaAreeTematiche));
            
            lezioneDAO = new LezioneDAOImplementazione(this);
            
            setListaLezioni(lezioneDAO.retrieveAllLezione(listaCorsi));
            
            studenteDAO = new StudenteDAOImplementazione(this);
            
            setListaStudenti(studenteDAO.retrieveAllStudente(listaCorsi, listaLezioni));
            
            /*for(AreaTematica lista : listaAreeTematiche) {
                System.out.println(lista.toString());
            }*/
            
            /*for(Corso lista : listaCorsi) {
                System.out.println(lista.toString());
            }*/
            
            /*for(Lezione lista : listaLezioni) {
                System.out.println(lista.toString());
            }*/
            
            /*for(Studente lista : listaStudenti) {
                System.out.println(lista.toString());
            }*/
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
        else {
            homeFrameOperatore.setVisible(true);
        }
    }
    
    public void esciDaOperatore() {
        loginFrame.setVisible(true);
        homeFrameOperatore.setVisible(false);
    }
    
    public void terminaEsecuzione() {
        chiudiConnessione();
        System.exit(0);
    }
    
    public void inserisciTuttiGliStudentiInJTable(JTable tableStudenti) {
        DefaultTableModel modelTableStudenti = (DefaultTableModel) tableStudenti.getModel();
        modelTableStudenti.setRowCount(0);
        
        for(Studente studente : listaStudenti) {
            Object[] row = {studente, studente.getMatricola(), studente.getNome(), studente.getCognome()};
            modelTableStudenti.addRow(row);
        }
    }
    
    public void inserisciCorsiDelloStudenteInJTable(JTable tableStudenti, JTable tableCorsiDelloStudente) {
        Studente studenteSelezionato = (Studente) tableStudenti.getModel().getValueAt(tableStudenti.getSelectedRow(), 0);
        DefaultTableModel modelTablePresenze = (DefaultTableModel) tableCorsiDelloStudente.getModel();
        
        modelTablePresenze.setRowCount(0);
        
        for(Corso corso : studenteSelezionato.getCorsiFrequentati()) {
            Object[] row = {corso, corso.getCodiceCorso(), corso.getNomeCorso(), corso.getDescrizioneCorso()};
            modelTablePresenze.addRow(row);
        }
    }
    
    public void inserisciPresenzeInJTable(JTable tableStudenti, JTable tablePresenze) {
        Studente studenteSelezionato = (Studente) tableStudenti.getModel().getValueAt(tableStudenti.getSelectedRow(), 0);
        DefaultTableModel modelTablePresenze = (DefaultTableModel) tablePresenze.getModel();
        
        modelTablePresenze.setRowCount(0);
        
        for(Lezione lezione : studenteSelezionato.getPresenze()) {
            Object[] row = {lezione, lezione.getCodiceLezione(), lezione.getTitoloLezione(), lezione.getDataInizio(), lezione.getCorsoDellaLezione().getNomeCorso()};
            modelTablePresenze.addRow(row);
        }
    }
    
    public static void main(String[] args){        
        Controller c = new Controller();
        
    }
}
