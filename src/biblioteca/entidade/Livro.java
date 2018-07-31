package biblioteca.entidade;

import java.util.ArrayList;

public class Livro extends Item {
	private String codigo;
	private int tipo = 0;
	private String nome = "";

//	----------------------------

	private String data;
	private int edicao;
	private int volume;
	private Editora editora;
	private ArrayList<Autor> autores;
	private int quantidade;
	private int quantidadeEmprestimo;

//	----------------------------

	public Livro(String codigo, int tipo, String nome, String data, int edicao, int volume, Editora editora,
			int quantidade) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.nome = nome;
		this.data = data;
		this.edicao = edicao;
		this.volume = volume;
		this.editora = editora;
		this.quantidade = quantidade;
		this.quantidadeEmprestimo = quantidade;
	}

//	----------------------------

	public void adicionaAutor(Autor autor) {
		autores.add(autor);
	}

//	----------------------------

	public int getQuantidadeEmprestimo() {
		return quantidadeEmprestimo;
	}

	public void setQuantidadeEmprestimo(int quantidadeEmprestimo) {
		this.quantidadeEmprestimo = quantidadeEmprestimo;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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

}
