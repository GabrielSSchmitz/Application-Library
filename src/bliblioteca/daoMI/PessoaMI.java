package bliblioteca.daoMI;

import java.util.ArrayList;

import biblioteca.dao.PessoaDAO;
import biblioteca.entidade.Pessoa;

public class PessoaMI implements PessoaDAO {

	private static ArrayList<Pessoa> list = new ArrayList<>();

	public PessoaMI() {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<Pessoa> getConnection() {
		return list;
	}

	@Override
	public void salvaPessoa(Pessoa pessoa) {
		list.add(pessoa);
	}

	public Pessoa procuraPessoa(String cpf) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCpf().equals(cpf)) {
				return list.get(i);
			}
		}
		return null;
	}

	public static boolean cpfIsCadastrado(String cpf) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	public static ArrayList<Pessoa> getList() {
		return list;
	}

	public static void setList(ArrayList<Pessoa> list) {
		PessoaMI.list = list;
	}

	
}
