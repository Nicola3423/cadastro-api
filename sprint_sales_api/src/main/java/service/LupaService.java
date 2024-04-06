package service;

import java.sql.ResultSet;
import dao.Dao;
import model.Lupa;


public class LupaService {
	
	public static void InserirLupa(Lupa u) {  
        String query = String.format("insert into TB_LUPA (TAMANHO_DA_LUPA,NIVEL_DE_AMPLIACAO) values('%s','%s')", u.getTamanho_da_lupa(), u.getNivel_de_ampliação());
        Dao.InsertUpdateDeleteCommand(query);
        System.out.printf("Lupa incluída com sucesso!\n");
    }
    public static void ExibirLupas() {
        String query= "select * from TB_LUPA";
       
        ResultSet rs = Dao.SelectCommand(query);
       
        try {
            while(rs.next()){
                System.out.print(rs.getString("Tamanho da lupa")+" ");
                System.out.println(rs.getString("Nivel de ampliacao")+" ");
            }
        }
        catch (Exception e){
                System.out.println(e);
        }  
    }
   
    public static void ExibirLupas(String NIVEL_DE_AMPLIACAO) {
        String query = String.format("select * from TB_LUPA where id = '%s'", NIVEL_DE_AMPLIACAO);
        ResultSet rs = Dao.SelectCommand(query);
       
        try {
            while(rs.next()){
                System.out.print(rs.getString("Tamanho da lupa")+" ");
                System.out.println(rs.getString("Nivel de ampliacao")+" ");
            }
        }
        catch (Exception e){
                System.out.println(e);
        }
    }

}
