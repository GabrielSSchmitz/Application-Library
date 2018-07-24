package biblioteca.dao;

import biblioteca.entidade.*;

public interface PessoaDAO {

	void salvaPessoa(Pessoa pessoa);

	Pessoa procuraPessoa(String cpf);
}
