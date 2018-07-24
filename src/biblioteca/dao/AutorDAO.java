package biblioteca.dao;

import biblioteca.entidade.Autor;

public interface AutorDAO {

	void salvaAutor (Autor autor);
	
	Autor procuraAutor(int codigo);
	
}
