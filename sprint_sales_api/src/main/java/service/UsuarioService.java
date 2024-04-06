package service;


import java.sql.ResultSet;
import dao.Dao;
import model.Usuario;


public class UsuarioService {
    
	public static void InserirUsuario(Usuario u) {  
        String query = String.format("insert into TB_USUARIO (NOME_COMPLETO,CARGO,EMAIL_CORPORATIVO,CONTATO,EMPRESA,PAIS) values('%s','%s','%s','%s','%s','%s')", u.getNome_completo(), u.getCargo(), u.getEmail_corporativo(), u.getContato(), u.getEmpresa(),u.getPais());
        Dao.InsertUpdateDeleteCommand(query);
        System.out.print("Usuario incluído com sucesso!\n");
    }
   
    public static void AtualizarUsuario(String Nome_completo, String email) {
        String query = String.format("update TB_USUARIO set NOME_COMPLETO = '%s' where EMAIL_CORPORATIVO = '%s'", Nome_completo, email);
        Dao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExcluirUsuario(String Email_corporativo) {
        String query = String.format("delete from TB_USUARIO where CARGO = '%s'", Email_corporativo);
        Dao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExibirUsuarios() {
        String query= "select * from TB_USUARIO";
       
        ResultSet rs = Dao.SelectCommand(query);
       
        try {
            while(rs.next()){
                System.out.println(rs.getString("Nome_completo")+" ");
                System.out.println(rs.getString("Cargo")+" ");
                System.out.println(rs.getString("Email_corporativo")+" ");
            }
        }
        catch (Exception e){
                System.out.println(e);
        }  
    }
   
    public static void ExibirUsuario(String Email_corporativo) {
        String query = String.format("select * from tb_usuario where id = '%s'", Email_corporativo);
        ResultSet rs = Dao.SelectCommand(query);
       
        try {
            while(rs.next()){
                System.out.print(rs.getString("Nome_completo")+" ");
                System.out.println(rs.getString("Cargo")+" ");
                System.out.println(rs.getString("Email_corporativo")+" ");
            }
        }
        catch (Exception e){
                System.out.println(e);
        }
    }


}
