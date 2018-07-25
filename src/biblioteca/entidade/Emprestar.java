package biblioteca.entidade;

public class Emprestar {
	private Pessoa pessoa;
	private Material material;
	private Livro livro;
	private Periodico periodico;
	private int codigo;
	private String data;

//	----------------------------

	public Emprestar(int codigo, Pessoa pessoa, Material material, String data) {
		super();
		this.codigo = codigo;
		this.pessoa = pessoa;
		this.material = material;
		this.data = data;
	}

	public Emprestar(int codigo, Pessoa pessoa, Livro livro, String data) {
		super();
		this.codigo = codigo;
		this.pessoa = pessoa;
		this.livro = livro;
		this.data = data;
	}

	public Emprestar(int codigo, Pessoa pessoa, Periodico periodico, String data) {
		super();
		this.codigo = codigo;
		this.pessoa = pessoa;
		this.periodico = periodico;
		this.data = data;
	}

//	----------------------------

	public Item getItem() {
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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
