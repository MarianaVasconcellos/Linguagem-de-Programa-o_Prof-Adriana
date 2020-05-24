package main;

public class Sapato {

	private String modelo;
	private String marca;
	private int tamanho;
	
	public Sapato() {}

	public Sapato(String modelo, String marca, int tamanho) {
		this.modelo = modelo;
		this.marca = marca;
		this.tamanho = tamanho;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void serVestido(Pessoa pessoa) {
		System.out.printf("%s est� cal�ando %s de tamanho %d", pessoa.getNome(), modelo, tamanho);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + tamanho;
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
		Sapato other = (Sapato) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}

	public int indexOf(Sapato sapato) {
		// TODO Auto-generated method stub
		return 0;
	}
}
		
