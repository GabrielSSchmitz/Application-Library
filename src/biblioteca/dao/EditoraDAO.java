package biblioteca.dao;

import biblioteca.entidade.Editora;

public interface EditoraDAO {
	
	void salvaAutor (Editora editora);
	
	Editora procuraEditora (int codigo);
}
