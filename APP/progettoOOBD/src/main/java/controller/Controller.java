package controller;

import connessione.ConnessioneDB;
import dao.implementazione.postgresql.AreaTematicaDAOImplementazione;
import dao.implementazione.postgresql.CorsoDAOImplementazione;
import dto.AreaTematica;
import dto.Corso;
import gui.HomeFrameOperatore;
import gui.HomeFrameStudente;
import gui.LoginFrame;
import java.sql.Connection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    
    private Connection connection = null;
    private LoginFrame loginFrame;
    private HomeFrameOperatore homeFrameOperatore;
    private HomeFrameStudente homeFrameStudente;
    
    private LinkedList<AreaTematica> listaAreeTematiche;
    private AreaTematicaDAOImplementazione areaTematicaDAO;
    
    private LinkedList<Corso> listaCorsi;
    private CorsoDAOImplementazione corsoDAO;
    
    public Controller(){
        loginFrame = new LoginFrame(this);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public void setListaAreeTematiche(LinkedList<AreaTematica> listaAreeTematiche) {
        this.listaAreeTematiche = listaAreeTematiche;
    }

    public void setListaCorsi(LinkedList<Corso> listaCorsi) {
        this.listaCorsi = listaCorsi;
    }
    
    public boolean avviaConnessione(String userName, String password, String ip, String porta, String db) {        
        chiudiConnessione();
        try {
            setConnection(ConnessioneDB.getIstanza(userName, password, ip, porta, db).getConnection());
            System.out.println("Connessione riuscita");
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
            
            /*for(AreaTematica lista : listaAreeTematiche) {
                System.out.println(lista.toString());
            }*/
            
            for(Corso lista : listaCorsi) {
                System.out.println(lista.toString());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void accessoOperatore(){
        loginFrame.setVisible(false);
        homeFrameOperatore = new HomeFrameOperatore(this);
    }
    
    public void terminaEsecuzione() {
        chiudiConnessione();
        System.exit(0);
    }
    
    public static void main(String[] args){
        
        Controller c = new Controller();
        
    }
}
