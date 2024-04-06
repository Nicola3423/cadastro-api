package model;

public class Produto {
	


	private int id_produto;
	private int valor_do_produto;
	private int quantidade;
	private String nome;
	
	public Produto() {
		
	}
	
	public Produto(int id_produto, int valor_do_produto, int quantidade, String nome) {
		super();
		this.id_produto = id_produto;
		this.valor_do_produto = valor_do_produto;
		this.quantidade = quantidade;
		this.nome = nome;
	}
	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

	public int getValor_do_produto() {
		return valor_do_produto;
	}

	public void setValor_do_produto(int valor_do_produto) {
		this.valor_do_produto = valor_do_produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
