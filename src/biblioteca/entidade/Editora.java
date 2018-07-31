package biblioteca.entidade;

public class Editora {
	private String codigo;
	private String nome;
	private boolean nacional;

	public Editora(String codigo, String nome, boolean nacional) {
		this.codigo = codigo;
		this.nome = nome;
		this.nacional = nacional;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isNacional() {
		return nacional;
	}

	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}

}
