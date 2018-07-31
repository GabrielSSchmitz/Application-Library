package biblioteca.entidade;

public class Material extends Item {
	private String codigo;
	private int tipo = 0;
	private String nome = "";
	
//	----------------------------
	
	private String descricao;
	private String material;
	private String estante;
	private int quantidade;
	private int quantidadeEmprestimo;
	
	
//	----------------------------
	
	public Material(String codigo, int tipo, String nome, String descricao, String material, int quantidade, String estante) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.nome = nome;
		this.descricao = descricao;
		this.material = material;
		this.quantidade = quantidade;
		this.quantidadeEmprestimo = quantidade;
		this.estante = estante;
	}

//	----------------------------
	
	public String getDescricao() {
		return descricao;
	}

	public String getEstante() {
		return estante;
	}

	public void setEstante(String estante) {
		this.estante = estante;
	}

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

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
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
