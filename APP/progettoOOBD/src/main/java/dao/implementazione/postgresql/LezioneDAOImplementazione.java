package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.LezioneDAOInterfaccia;
import dto.Lezione;
import java.sql.Connection;
import java.util.LinkedList;

public class LezioneDAOImplementazione implements LezioneDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String retrieveAllLezione ="SELECT * "+
                                       "FROM LEZIONE";
    
    public LezioneDAOImplementazione(Controller controller, Connection connection) {
        setController(controller);
        setConnection(connection);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public boolean createLezione(Lezione lez) {
        return true;
    }

    @Override
    public Lezione retrieveLezioneByTitolo(String titoloLezione) {
        return null;
    }

    @Override
    public LinkedList<Lezione> retrieveAllLezione() {
        return null;
    }

    @Override
    public boolean updateLezione(Lezione lez) {
        return true;
    }

    @Override
    public boolean deleteLezione(Lezione lez) {
        return true;
    }
    
}
