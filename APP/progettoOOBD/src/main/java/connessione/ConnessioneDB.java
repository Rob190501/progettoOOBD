/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connessione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rob19
 */
public class ConnessioneDB{
	
    private static ConnessioneDB istanza = null;
    private Connection connection = null;
    private final String USER = "postgres";
    private final String PSW = "admin";
    private final String IP = "localhost";
    private final String PORT = "5432";
    private final String db = "corsi_di_formazione";
    private String url = "jdbc:postgresql://" + IP + ":" + PORT + "/" + db;
	
    private ConnessioneDB() throws Exception {
        Class.forName("org.postgresql.Driver");
			
        connection = DriverManager.getConnection(url, USER, PSW);
    }
	
    public Connection getConnection() {
        return connection;
    }
	
    public static ConnessioneDB getIstanza() throws Exception {
        if(istanza == null) {
            istanza = new ConnessioneDB();
        }
		
        return istanza;
    }
}
