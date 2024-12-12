package filtraggio;

public class Prodotto {
	
	// Attributes
	
	private String nome;
	private String categoria;
	private double prezzo;
	
	Prodotto (String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = Math.random() * 20 + 5;
	}
	
	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}
