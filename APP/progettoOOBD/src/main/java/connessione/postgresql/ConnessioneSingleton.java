package connessione.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneSingleton {
    
    private static ConnessioneSingleton istanza = null;
    private Connection connection;
    
    private ConnessioneSingleton(String userName, String password, String url) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(url, userName, password);
    }
    
    public static ConnessioneSingleton getIstanza(String userName, String password, String ip, String porta, String db) throws SQLException, ClassNotFoundException {
        if(istanza == null || istanza.getConnection().isClosed()) {
            String url = "jdbc:postgresql://" + ip + ":" + porta + "/" + db;
            istanza = new ConnessioneSingleton(userName, password, url);
        }
        return istanza;
    }
    
    public Connection getConnection() {
        return connection;
    }
    
}
