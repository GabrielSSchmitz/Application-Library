package biblioteca.entidade;

public interface Item {
	// Ser Classe pai
	int codigo = 0;
	int tipo = 0;
	String nome = "";
	
	public String getNome();
	public int getCodigo();
	public int getTipo();
	
	public void setNome (String nome);
	public void setCodigo (int codigo);
	public void setTipo (int tipo);
}
