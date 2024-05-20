public class Livro {
	
	private String titulo;
	private String autor;
	private String    editora;
	private String anoPublicacao;
	
	public Livro(String novoTitulo, String novoAutor, String novoEditora, String novoAnoPublicacao) {
		this.titulo = novoTitulo;
		this.autor = novoAutor;
		this.editora = novoEditora;
		this.anoPublicacao = novoAnoPublicacao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getEditora() {
		return editora;
	}
	public String getAnoPUblicacao() {
		return anoPublicacao;
	}
	
	public void setTitulo(String novoTitulo) {
		this.titulo = novoTitulo;
	}
	public void setAutor(String novoAutor) {
		this.autor = novoAutor;
	}
	public void setEditora(String  novoEditora) {
		this.editora = novoEditora;
	}
	public void setAnoPublicacao(String novoAnoPublicacao) {
		this.anoPublicacao = novoAnoPublicacao;
	}
	
	public String toString() {
		return "Seu titulo é\n" + this.titulo + "seu autor è \n" + this.autor + "sua editora é\n" + this.editora + "seu anopublicacao é\n" + this.anoPublicacao;	}

}
