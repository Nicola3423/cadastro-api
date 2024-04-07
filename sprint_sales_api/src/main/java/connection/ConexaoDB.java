package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoDB {
    public static Connection getConnection(){
           
        Connection conn=null;
       
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm554227", "");
           
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return conn;
    }
}
