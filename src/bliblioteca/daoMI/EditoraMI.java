package bliblioteca.daoMI;

import java.util.ArrayList;

import biblioteca.dao.EditoraDAO;
import biblioteca.entidade.Editora;

public class EditoraMI implements EditoraDAO {

	static ArrayList<Editora> list = new ArrayList<>();

	static public ArrayList<Editora> getConnection() {
		return list;
	}

	@Override
	public void salvaAutor(Editora editora) {
		list.add(editora);
	}

	@Override
	public Editora procuraEditora(String codigo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodigo() == codigo) {
				return list.get(i);
			}
		}
		return null;
	}

	public static ArrayList<Editora> getList() {
		return list;
	}

	public static void setList(ArrayList<Editora> list) {
		EditoraMI.list = list;
	}
	
	

}
