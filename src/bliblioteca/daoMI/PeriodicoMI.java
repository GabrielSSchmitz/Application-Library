package bliblioteca.daoMI;

import java.util.ArrayList;

import biblioteca.dao.PeriodicoDAO;
import biblioteca.entidade.Periodico;

public class PeriodicoMI implements PeriodicoDAO {

	private static ArrayList<Periodico> list = new ArrayList<>();

//	----------------------------

	public static ArrayList<Periodico> getConnection() {
		return list;
	}
	
	static public void emprestimo(String codigo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodigo() == codigo) {
				list.get(i).setQuantidadeEmprestimo(list.get(i).getQuantidadeEmprestimo() - 1);
			}
		}
	}
	
	static public void devolucao(String codigo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodigo() == codigo) {
				list.get(i).setQuantidadeEmprestimo(list.get(i).getQuantidadeEmprestimo() + 1);
			}
		}
	}

//	----------------------------

	@Override
	public void salvaPeriodico(Periodico periodico) {
		list.add(periodico);
	}

	@Override
	public Periodico procuraPeriodicol(String codigo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodigo() == codigo) {
				return list.get(i);
			}
		}
		return null;
	}

	public static ArrayList<Periodico> getList() {
		return list;
	}

	public static void setList(ArrayList<Periodico> list) {
		PeriodicoMI.list = list;
	}

}
