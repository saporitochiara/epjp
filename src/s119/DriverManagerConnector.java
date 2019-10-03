package s119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerConnector {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
//    private static final String URL = "jdbc:mysql://localhost:3306/me?serverTimeZone=Europe
    private static final String USER = "me";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            String user = conn.getSchema();
            if (user == null) {
            	user = conn.getCatalog();
            }
            
            
            System.out.println("Connected as " + conn.getSchema());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
