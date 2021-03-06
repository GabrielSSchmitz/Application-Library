package biblioteca.entidade;

public class Periodico extends Item {

	private String codigo;
	private int tipo = 0;
	private String nome = "";

//	----------------------------

	private int volume;
	private int quantidade;
	private int quantidadeEmprestimo;

//	----------------------------

	public Periodico(String codigo, int tipo, String nome, int volume, int quantidade) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.nome = nome;
		this.volume = volume;
		this.quantidade = quantidade;
		this.quantidadeEmprestimo = quantidade;
	}

//	----------------------------
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidadeEmprestimo() {
		return quantidadeEmprestimo;
	}

	public void setQuantidadeEmprestimo(int quantidadeEmprestimo) {
		this.quantidadeEmprestimo = quantidadeEmprestimo;
	}

}
