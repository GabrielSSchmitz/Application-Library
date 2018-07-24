package biblioteca.entidade;

public class Editora {
	private int codigo;
	private String nome;
	private boolean nacional;

	public Editora(int codigo, String nome, boolean nacional) {
		this.codigo = codigo;
		this.nome = nome;
		this.nacional = nacional;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
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
