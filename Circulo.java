public class Circulo {
	
	private double raio;
	
	public Circulo(double novoRaio) {
		this.raio = novoRaio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double novoRaio) {
		this.raio = novoRaio;
	}
	
	public double calcularArea(){
		return this.raio * this.raio * 3.14;
	}
	
	public double calcularPerimetro() {
		return 2 * 3.14 * this.raio;
		
	}
	
	public String toString() {
		return "Seu raio é " + this.raio;
	}
}
