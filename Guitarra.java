
public class Guitarra {

	private String numeroDeSerie, fabricante, modelo, tipo, madeira;
	private double preco;
	
	Guitarra(String numeroDeSerie, String fabricante, String modelo, String tipo, String madeira, double preco){
		this.numeroDeSerie = numeroDeSerie;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tipo = tipo;
		this.madeira = madeira;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "\n Numero de Série: " + this.numeroDeSerie + "\n Fabricante: " + this.fabricante
				+ "\n Modelo: " + this.modelo + "\n Tipo: " + this.tipo + "\n Madeira: " + this.madeira + "\n Preço: " + this.preco;
	}
	
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public String getMadeira() {
		return madeira;
	}

	public double getPreco() {
		return preco;
	}

	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setMadeira(String madeira) {
		this.madeira = madeira;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
