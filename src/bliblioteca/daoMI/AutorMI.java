package bliblioteca.daoMI;

import java.util.ArrayList;

import biblioteca.dao.AutorDAO;
import biblioteca.entidade.Autor;

public class AutorMI implements AutorDAO {
	
	private static ArrayList<Autor> list = new ArrayList<>();
	
	public static ArrayList<Autor> getConnection() {
		return list;
	}
	
	@Override
	public void salvaAutor(Autor autor) {	
		list.add(autor);
	}

	@Override
	public Autor procuraAutor(int codigo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodigo() == codigo) {
				return list.get(i);
			}
		}
		return null;
	}

	public static ArrayList<Autor> getList() {
		return list;
	}

	public static void setList(ArrayList<Autor> list) {
		AutorMI.list = list;
	}

}
