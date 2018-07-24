package biblioteca.entidade;

public class Emprestar {
	private Pessoa pessoa;
	private Material material;
	private Livro livro;
	private Periodico periodico;
	private int codigo;

//	----------------------------

	public Emprestar(int codigo, Pessoa pessoa, Material material) {
		super();
		this.codigo = codigo;
		this.pessoa = pessoa;
		this.material = material;
	}

	public Emprestar(int codigo, Pessoa pessoa, Livro livro) {
		super();
		this.codigo = codigo;
		this.pessoa = pessoa;
		this.livro = livro;
	}

	public Emprestar(int codigo, Pessoa pessoa, Periodico periodico) {
		super();
		this.codigo = codigo;
		this.pessoa = pessoa;
		this.periodico = periodico;
	}

//	----------------------------

	public Item item() {
		if (material != null) {
			return material;
		} else if (livro != null) {
			return livro;
		} else {
			return periodico;
		}
	}

//	----------------------------

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Periodico getPeriodico() {
		return periodico;
	}

	public void setPeriodico(Periodico periodico) {
		this.periodico = periodico;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
