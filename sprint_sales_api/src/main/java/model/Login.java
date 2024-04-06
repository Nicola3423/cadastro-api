package model;

public class Login {
	
	private String nome_do_usuario;
	private String senha;
	private int codigo_de_acesso;
	
	public Login(String nome_do_usuario, String senha, int codigo_de_acesso) {
		this.nome_do_usuario = nome_do_usuario;
		this.senha = senha;
		this.codigo_de_acesso = codigo_de_acesso;
	}
	
	public String getNome_do_usuario() {
		return nome_do_usuario;
	}
	public void setNome_do_usuario(String nome_do_usuario) {
		this.nome_do_usuario = nome_do_usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getCodigo_de_acesso() {
		return codigo_de_acesso;
	}
	public void setCodigo_de_acesso(int codigo_de_acesso) {
		this.codigo_de_acesso = codigo_de_acesso;
	}
	Login(){
		
	}
}
