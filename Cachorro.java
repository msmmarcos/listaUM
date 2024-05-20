public class Cachorro {

	private String nome;
	private String raca;
	private int ano;
	
	
	public Cachorro(String novoNome, String novaRaca, int novoAno) {
		this.nome = novoNome;
		this.raca = novaRaca;
		this.ano = novoAno;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setRaca(String novaRaca) {
		this.raca = novaRaca;
	}
	
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
	
	  public String latir() {
	    	return "au au";
	    }
}
