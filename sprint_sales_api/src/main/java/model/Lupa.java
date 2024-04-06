package model;

public class Lupa {
	
	private int tamanho_da_lupa;
	private int nivel_de_ampliação;
	
	
	public int getTamanho_da_lupa() {
		return tamanho_da_lupa;
	}

	public void setTamanho_da_lupa(int tamanho_da_lupa) {
		this.tamanho_da_lupa = tamanho_da_lupa;
	}

	public int getNivel_de_ampliação() {
		return nivel_de_ampliação;
	}

	public void setNivel_de_ampliação(int nivel_de_ampliação) {
		this.nivel_de_ampliação = nivel_de_ampliação;
	}

	public Lupa() {
		
	}
	
	public Lupa(int tamanho_da_lupa, int nivel_de_ampliação) {
		this.tamanho_da_lupa = tamanho_da_lupa;
		this.nivel_de_ampliação = nivel_de_ampliação;
	}

}
