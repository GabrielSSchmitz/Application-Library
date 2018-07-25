package bliblioteca.daoMI;

import java.util.ArrayList;

import biblioteca.dao.EmprestarDAO;
import biblioteca.entidade.Emprestar;

public class EmprestarMI implements EmprestarDAO {

	static ArrayList<Emprestar> list = new ArrayList<>();

	static public ArrayList<Emprestar> getConnection() {
		return list;
	}

	@Override
	public void salvaEmprestar(Emprestar emprestar) {
		list.add(emprestar);
	}

	@Override
	public Emprestar procuraEmprestar(int codigo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodigo() == codigo) {
				return list.get(i);
			}
		}
		return null;
	}

}
