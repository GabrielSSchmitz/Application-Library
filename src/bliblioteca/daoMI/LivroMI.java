package bliblioteca.daoMI;

import java.util.ArrayList;

import biblioteca.dao.LivroDAO;
import biblioteca.entidade.Livro;

public class LivroMI implements LivroDAO {

	private static ArrayList<Livro> list = new ArrayList<>();

	static public ArrayList<Livro> getConnection() {
		return list;
	}

	@Override
	public void salvaLivro(Livro livro) {
		list.add(livro);

	}

	@Override
	public Livro procuraLivro(int codigo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodigo() == codigo) {
				return list.get(i);
			}
		}
		return null;
	}

	public static ArrayList<Livro> getList() {
		return list;
	}

	public static void setList(ArrayList<Livro> list) {
		LivroMI.list = list;
	}

}
