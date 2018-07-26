package bliblioteca.daoMI;

import java.util.ArrayList;

import biblioteca.dao.MaterialDAO;
import biblioteca.entidade.Material;

public class MaterialMI implements MaterialDAO {

	private static ArrayList<Material> list = new ArrayList<>();

	@Override
	public void salvaMaterial(Material material) {
		list.add(material);

	}

	static public void emprestimo(int codigo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodigo() == codigo) {
				list.get(i).setQuantidadeEmprestimo(list.get(i).getQuantidadeEmprestimo() - 1);
			}
		}
	}
	
	static public void devolucao(int codigo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodigo() == codigo) {
				list.get(i).setQuantidadeEmprestimo(list.get(i).getQuantidadeEmprestimo() + 1);
			}
		}
	}
	
	public static ArrayList<Material> getConnection() {
		return list;
	}

	@Override
	public Material procuraMaterial(int codigo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodigo() == codigo) {
				return list.get(i);
			}
		}
		return null;
	}

	public static ArrayList<Material> getList() {
		return list;
	}

	public static void setList(ArrayList<Material> list) {
		MaterialMI.list = list;
	}

}
