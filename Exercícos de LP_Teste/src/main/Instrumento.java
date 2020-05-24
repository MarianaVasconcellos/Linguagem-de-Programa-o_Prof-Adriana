package main;

public class Instrumento {

	private String modelo;
	private Double preco;
	
	public Instrumento() {
		super();
	}

	public Instrumento(String modelo, Double valor) {
		this.modelo = modelo;
		this.preco = valor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getValor() {
		return preco;
	}

	public void setValor(Double valor, Double preco) {
		this.preco = preco;
	}
	
	public String avaliarValor() {
		return preco.compareTo(Double.valueOf(15000.00)) > 0 ? "Está fora do meu orçamento" : "Vou levar!";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
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
		Instrumento other = (Instrumento) obj;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		return true;
	}

	public void avaliarPreco() {
		// TODO Auto-generated method stub
		
	}
}
