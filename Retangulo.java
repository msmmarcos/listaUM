public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo(double novaBase,double novaAltura) {
		this.base = novaBase;
		this.altura = novaAltura;
	}
	
	
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double novaBase) {
		this.base = novaBase;
	}
	
	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}
	
	public double calcularArea() {
		return this.base * this.altura;
		}
	
	public double calcularPerimetro() {
		return this.base * 2 + this.altura * 2;
	}
	
	
	public String toString() {
		return "Sua base é " + this.base + "\nSua altura é "+ this.altura;
	}
}
