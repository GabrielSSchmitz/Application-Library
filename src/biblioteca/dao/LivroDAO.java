package biblioteca.dao;

import biblioteca.entidade.Livro;

public interface LivroDAO {
	
	void salvaLivro (Livro livro);
	
	Livro procuraLivro(int codigo);
}
