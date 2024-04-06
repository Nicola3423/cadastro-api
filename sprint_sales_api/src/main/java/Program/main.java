package Program;


import java.io.IOException;
import java.util.Scanner;


import model.Endereco;
import service.LupaService;
import service.UsuarioService;
import service.ViaCepService;
import model.Usuario;
import model.Lupa;

public class main {


    public static void main(String[] args) throws IOException{


        ViaCepService viacepservice = new ViaCepService();
       
        Scanner ler = new Scanner(System.in);
       
        String cep;
       
        System.out.print("Digite o cep: ");
        cep = ler.next();
       


        try {
            Endereco endereco = viacepservice.getEndereco(cep);
           
            System.out.println(endereco.getLogradouro() + "\n");
            System.out.println(endereco.getBairro() + "\n");
            System.out.println(endereco.getLocalidade()  + "\n");
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
		int opcao;
		String email;
		String Nome_completo;
		
        
        
        do {        
	           System.out.printf("===> Sistema de Cadastro de Usuarios <===\n\n");
	           System.out.printf("Escolha uma opção:\n");          
	           System.out.printf("1 - Cadastro de Usuario com Lupa \n" +
	                             "2 - Exibir todos os usuarios e lupa \n" +
	                             "3 - Atualizar usuario \n" +
	                             "4 - Excluir usuario \n" +
	                             "5 - Sair\n\n");


	           System.out.printf("Digite a opção desejada: ");
	           opcao = ler.nextInt();
	           
	           if (opcao == 1) {
	       		Usuario a = new Usuario();
	            
	            System.out.print("Digite o seu nome completo(Primeiro Nome): ");
	            a.setNome_completo(ler.next());
	            
	            System.out.println("Digite o seu contato: ");
	            a.setContato(ler.nextInt());
	            
	            System.out.println("Digite o seu e-mail corporativo: ");
	            a.setEmail_corporativo(ler.next());
	            
	            System.out.println("Digite o seu cargo: ");
	            a.setCargo(ler.next());
	            
	            System.out.println("Digite o seu país: ");
	            a.setPaís(ler.next());
	           
	            System.out.println("Digite a sua empresa: ");
	            a.setEmpresa(ler.next());
	            
				UsuarioService.InserirUsuario(a);
	            
	            Lupa b = new Lupa();
	            
	            System.out.print("Digite o nivel de ampliação da lupa: ");
	            b.setNivel_de_ampliação(ler.nextInt());
	            
	            System.out.println("Digite o tamanho da lupa: ");
	            b.setTamanho_da_lupa(ler.nextInt());
	            
	            LupaService.InserirLupa(b);
	       
	            System.in.read();

	           }
	           else if (opcao == 2) {
	        	   UsuarioService.ExibirUsuarios();
	        	   System.out.printf("\nLupas: ");
	        	   LupaService.ExibirLupas();
	           }
	           else if(opcao == 3) {
	        	   UsuarioService.ExibirUsuarios();
	        	   LupaService.ExibirLupas();
	        	   
	        	   
		            System.out.print("Digite o email corporativo do usuario que deseja alterar: ");
		            email = ler.next();
		            
		            System.out.print("Digite o novo nome do usuario: ");
		            Nome_completo = ler.next();
	        	   
		            UsuarioService.AtualizarUsuario(Nome_completo, email);
	           }
	           else if(opcao == 4) {
	        	   UsuarioService.ExibirUsuarios();
	        	   LupaService.ExibirLupas();
	        	   
		            System.out.print("Digite o email corporativo do usuario que deseja excluir: ");
		            email = ler.next();
		            
		            UsuarioService.ExcluirUsuario(email);	        	   
		    		}
	           else if(opcao == 5) {
	        	   System.out.printf("Sistema encerrado com sucesso !");
	        	   break;
	           }
	  }while((opcao >= 1 ) && (opcao <= 5));
	ler.close();
       
    }
}
