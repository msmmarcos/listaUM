public class Professor {
	private String nome;
    private String departamento;
    private String titulacao;
    
    public Professor(String novoNome, String novoDepartamento,String novaTitulacao) {
    	this.nome = novoNome;
    	this.departamento = novoDepartamento;
    	this.titulacao = novaTitulacao;
    }
    public String getNome() {
    	return nome;
    }
    
    public String getDepartamento() {
    	return departamento;
    }
    public String getTitlacao() {
    	return titulacao;
    }
    public void setNome(String novoNome) {
    	this.nome = novoNome;
    }
    
    public void setDepartamento(String novoDepartamento) {
    	this.departamento = novoDepartamento;
    }
    
    public void setTitulacao(String novaTitulacao ) {
    	this.titulacao = novaTitulacao;
    }
    
    public String toString() {
    	return "O nome do aluno é" + this.nome + "Seu departamento é" + this.departamento + "Sua titulação é" + this.titulacao;
    }
}
