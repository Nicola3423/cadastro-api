package model;

public class Dados_de_Analytics {
	
	private String origem_de_trafego;
	private int duração_da_sessão;
	private String taxa_de_rejeicao;
	private String taxa_de_conversao;
	
	public Dados_de_Analytics(String origem_de_trafego, int duração_da_sessão, String taxa_de_rejeicao, String taxa_de_conversao) {

		this.origem_de_trafego = origem_de_trafego;
		this.duração_da_sessão = duração_da_sessão;
		this.taxa_de_rejeicao = taxa_de_rejeicao;
		this.taxa_de_conversao = taxa_de_conversao;
	}


	
	public String getOrigem_de_trafego() {
		return origem_de_trafego;
	}

	public void setOrigem_de_trafego(String origem_de_trafego) {
		this.origem_de_trafego = origem_de_trafego;
	}

	public int getDuração_da_sessão() {
		return duração_da_sessão;
	}

	public void setDuração_da_sessão(int duração_da_sessão) {
		this.duração_da_sessão = duração_da_sessão;
	}

	public String getTaxa_de_rejeicao() {
		return taxa_de_rejeicao;
	}

	public void setTaxa_de_rejeicao(String taxa_de_rejeicao) {
		this.taxa_de_rejeicao = taxa_de_rejeicao;
	}

	public String getTaxa_de_conversao() {
		return taxa_de_conversao;
	}

	public void setTaxa_de_conversao(String taxa_de_conversao) {
		this.taxa_de_conversao = taxa_de_conversao;
	}

	
	Dados_de_Analytics(){
		
	}

}
