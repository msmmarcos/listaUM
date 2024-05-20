public class DataHora {
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	
	public DataHora(int novoDia,int novoMes,int novoAno, int novaHora) {
		this.dia = novoDia;
		this.mes = novoMes;
		this.ano = novoAno;
	    this.hora = novaHora;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public int getHora() {
		return hora;
	}
	
	public void setDia(int novoDia) {
		this.dia = novoDia;
	}
	
	public void setMes(int novoMes) {
		this.mes = novoMes;
	}
	
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
	
	public void setHora(int novaHora) {
		this.hora = novaHora;
	}
	
	public String toString() {
		return "Seu dia é " + this.dia + "seu mes é " + this.mes + "seu ano é " + this.ano + "sua hora é " + this.hora;
	}
}
