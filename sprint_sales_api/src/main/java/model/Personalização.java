package model;

public class Personalização {
	
	private String tema_da_pagina;
	private String idioma;
	
	public Personalização(String tema_da_pagina, String idioma) {
		this.tema_da_pagina = tema_da_pagina;
		this.idioma = idioma;
	}
	
	public Personalização() {
		
	}
	
	public String getTema_da_pagina() {
		return tema_da_pagina;
	}
	public void setTema_da_pagina(String tema_da_pagina) {
		this.tema_da_pagina = tema_da_pagina;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
}
