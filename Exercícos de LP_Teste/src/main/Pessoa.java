package main;

import helpers.GENERO;

public class Pessoa {

	private String nome;
	private int idade;
	private long RG;
	private GENERO genero;
	
	public Pessoa() {}

	public Pessoa(String nome, int idade, long RG, GENERO genero) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.RG = RG;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getRG() {
		return RG;
	}

	public void setRG(long RG) {
		this.RG = RG;
	}
	
	public GENERO getGenero() {
		return genero;
	}

	public void setGenero(GENERO genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
}
