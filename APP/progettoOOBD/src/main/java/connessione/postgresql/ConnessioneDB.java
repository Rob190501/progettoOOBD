package connessione.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneDB{
    
    private static ConnessioneDB istanza = null;
    private Connection connection = null;
    
    private ConnessioneDB(String userName, String password, String url) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(url, userName, password);
        
    }
    
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
}
