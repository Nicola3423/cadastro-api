package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import connection.ConexaoDB;


public class Dao {


    public static boolean InsertUpdateDeleteCommand(String SQLCommand){
        boolean result = false;            
       
        try {
            Connection conn = ConexaoDB.getConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(SQLCommand);
        }catch (Exception e){
            System.out.println(e);
        }
        result = true;
       
        return result;
    }
   
    public static ResultSet SelectCommand(String SQLCommand) {
        ResultSet rs = null;
       
        try {
            Connection conn = ConexaoDB.getConnection();
            Statement statement = conn.createStatement();
            rs = statement.executeQuery(SQLCommand);
        }catch (Exception e){
            System.out.println(e);
        }
       
        return rs;
    }  
}
