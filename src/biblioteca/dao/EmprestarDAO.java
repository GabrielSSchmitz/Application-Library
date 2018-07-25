package biblioteca.dao;

import biblioteca.entidade.Emprestar;

public interface EmprestarDAO {
	void salvaEmprestar (Emprestar emprestar);
	
	Emprestar procuraEmprestar(int codigo);
}
