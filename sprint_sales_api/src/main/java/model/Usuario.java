package model;

public class Usuario {
	
	private String nome_completo;
	private String cargo;
	private String email_corporativo;
	private int contato;
	private String empresa;
	private String pais;
	
	public Usuario(){
		
	}
	
	public Usuario(String nome_completo, String cargo, String email_corporativo, int contato, String empresa, String pais) {
		this.nome_completo = nome_completo;
		this.cargo = cargo;
		this.email_corporativo = email_corporativo;
		this.contato = contato;
		this.empresa = empresa;
		this.pais = pais;
	}
	
	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail_corporativo() {
		return email_corporativo;
	}

	public void setEmail_corporativo(String email_corporativo) {
		this.email_corporativo = email_corporativo;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getPais() {
		return pais;
	}

	public void setPaís(String pais) {
		this.pais = pais;
	}

}
