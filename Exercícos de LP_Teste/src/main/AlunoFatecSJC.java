package main;

import helpers.GENERO;

public class AlunoFatecSJC {

	private String nome;
	private String ra;
	private String curso;
	private GENERO genero;
	
	public AlunoFatecSJC() {}
	
	public AlunoFatecSJC(String nome, int ra, int curso, GENERO genero, String ra1, String curso1) {
		super();
		this.nome = nome;
		this.ra = ra1;
		this.curso = curso1;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(int Ra, String ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(int curso, Object ra) {
		this.ra = (String) ra;
	}

	public GENERO getGenero() {
		return genero;
	}

	public void setGenero(GENERO genero) {
		this.genero = genero;
	}

	public void estudar() {
		String sentimento = genero == GENERO.FEMININO ? "OK" : "Preocupado"; 
		System.out.printf("%s está estudando.... e está %s", nome, sentimento);
	}
	
	public void dormir() {
		System.out.println("Fatec");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		int ra = 0;
		result = prime * result + ra;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		int curso = 0;
		result = prime * result + curso;
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
		AlunoFatecSJC other = (AlunoFatecSJC) obj;
		if (genero != other.genero)
			return false;
		if (ra != other.curso)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (curso != other.curso)
			return false;
		return true;
	}
}
