package main;

import java.util.List;

import helpers.GENERO;

public class Lugar {

	private String pontoturistico;
	private String rua;
	private String cidade;
	private String pais;
		
	public Lugar() {}

	public Lugar(String pontoturistico, String rua, String cidade, String pais) {
		this.pontoturistico = pontoturistico;
		this.rua = rua;
		this.cidade = cidade;
		this.pais = pais;
	}

	public String getPontoturistico() {
		return pontoturistico;
	}
	
	public void setPontoturistico(String pontoturistico) {
		this.pontoturistico = pontoturistico;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void receberVisita(List<Pessoa> pessoas) {
		pessoas.forEach(pessoa -> {
			if(pessoa.getIdade() < 18) {
				String frase = pessoa.getGenero() == GENERO.FEMININO ? " é muito nova para viajar sozinha." 
						: " é muito novo para viajar sozinho.";
				System.out.println(pessoa.getNome() + frase);
			} else {				
				System.out.println(pessoa.getNome() + "pode viajar");
			}
		});
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((pontoturistico == null) ? 0 : pontoturistico.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lugar other = (Lugar) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (pontoturistico == null) {
			if (other.pontoturistico != null)
				return false;
		} else if (!pontoturistico.equals(other.pontoturistico))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}
}
