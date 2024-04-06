package model;

public class Preferencias {
	
	private String produtos_ou_servicos_preferidos;
	private String feedback_do_cliente;
	private String preferencias_de_marketing;
	private String classficacao_de_possiveis_clientes;
	
	
	public String getProdutos_ou_servicos_preferidos() {
		return produtos_ou_servicos_preferidos;
	}
	public void setProdutos_ou_servicos_preferidos(String produtos_ou_servicos_preferidos) {
		this.produtos_ou_servicos_preferidos = produtos_ou_servicos_preferidos;
	}
	public String getFeedback_do_cliente() {
		return feedback_do_cliente;
	}
	public void setFeedback_do_cliente(String feedback_do_cliente) {
		this.feedback_do_cliente = feedback_do_cliente;
	}
	public String getPreferencias_de_marketing() {
		return preferencias_de_marketing;
	}
	public void setPreferencias_de_marketing(String preferencias_de_marketing) {
		this.preferencias_de_marketing = preferencias_de_marketing;
	}
	public String getClassficacao_de_possiveis_clientes() {
		return classficacao_de_possiveis_clientes;
	}
	public void setClassficacao_de_possiveis_clientes(String classficacao_de_possiveis_clientes) {
		this.classficacao_de_possiveis_clientes = classficacao_de_possiveis_clientes;
	}
	
	Preferencias(){
		
	}
	public Preferencias(String produtos_ou_servicos_preferidos, String feedback_do_cliente, String preferencias_de_marketing, String classficacao_de_possiveis_clientes) {
		
		this.produtos_ou_servicos_preferidos = produtos_ou_servicos_preferidos;
		this.feedback_do_cliente = feedback_do_cliente;
		this.preferencias_de_marketing = preferencias_de_marketing;
		this.classficacao_de_possiveis_clientes = classficacao_de_possiveis_clientes;
	}
	
}
