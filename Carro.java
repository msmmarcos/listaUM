public class Carro {
	
	private String modelo;
	private String marca;
	private int ano;
	private String placa;

	
	
	public Carro(String novoModelo, String novaMarca, int novoAno, String novaPlaca) {
		this.modelo = novoModelo;
		this.marca = novaMarca;
		this.ano = novoAno;
		this.placa = novaPlaca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	
	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}
	
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
	
	public void setPlaca(String novaPlaca) {
		this.placa = novaPlaca;
	}
	
	public String toString() {
		return "Seu modelo é " + this.modelo + "\nSua marca é "+ this.marca +"\n Seu ano é " +this.ano + "\nSua placa é " + this.placa;
	}
}
