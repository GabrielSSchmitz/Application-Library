package biblioteca.entidade;

public class Emprestar {
	private Item item;
	private Pessoa pessoa;
	private int codigo;
	private String data;
	private boolean emprestimo;

//	----------------------------

	public Emprestar(Item item, Pessoa pessoa, int codigo, String data, boolean emprestimo) {
	super();
	this.item = item;
	this.pessoa = pessoa;
	this.codigo = codigo;
	this.data = data;
	this.emprestimo = emprestimo;
}

//	----------------------------

	public Item getItem() {
		return item;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public boolean isEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
