package connessione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneDB{
    
    //attributi
    private static ConnessioneDB istanza = null;
    private Connection connection = null;
    //fine attributi
    
    //cosruttore
    private ConnessioneDB(String userName, String password, String url) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(url, userName, password);
    }
    //fine costruttore
    
    //getters e setters
    public Connection getConnection() {
        return connection;
    }
    
    public static ConnessioneDB getIstanza(String userName, String password, String ip, String porta, String db) throws SQLException, ClassNotFoundException {
        if(istanza == null || istanza.getConnection().isClosed()) {
            String url = "jdbc:postgresql://" + ip + ":" + porta + "/" + db;
            istanza = new ConnessioneDB(userName, password, url);
        }
        return istanza;
    }
    //fine getters e setters
}
