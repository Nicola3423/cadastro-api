package model;


public class compras {
	
	private String historico_de_compras;
	private int data_da_compra;
	private int valor_da_compra;
	private String preferencias_de_pagamento;
	
	public String getHistorico_de_compras() {
		return historico_de_compras;
	}

	public void setHistorico_de_compras(String historico_de_compras) {
		this.historico_de_compras = historico_de_compras;
	}

	public int getData_da_compra() {
		return data_da_compra;
	}

	public void setData_da_compra(int data_da_compra) {
		this.data_da_compra = data_da_compra;
	}

	public int getValor_da_compra() {
		return valor_da_compra;
	}

	public void setValor_da_compra(int valor_da_compra) {
		this.valor_da_compra = valor_da_compra;
	}

	public String getPreferencias_de_pagamento() {
		return preferencias_de_pagamento;
	}

	public void setPreferencias_de_pagamento(String preferencias_de_pagamento) {
		this.preferencias_de_pagamento = preferencias_de_pagamento;
	}


	public compras(String historico_de_compras, int data_da_compra, int valor_da_compra,String preferencias_de_pagamento) {
		this.historico_de_compras = historico_de_compras;
		this.data_da_compra = data_da_compra;
		this.valor_da_compra = valor_da_compra;
		this.preferencias_de_pagamento = preferencias_de_pagamento;
	}
	
	public compras(){
		
	}
}
