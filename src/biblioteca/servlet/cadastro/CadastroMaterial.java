package biblioteca.servlet.cadastro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.entidade.Material;
import bliblioteca.daoMI.MaterialMI;

@WebServlet("/CadastroMaterial")
public class CadastroMaterial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		String tipo = request.getParameter("tipo");
		String quantidadeString = request.getParameter("quantidade");

		int quantidade = Integer.parseInt(quantidadeString);

//		----------------------------

		int size = MaterialMI.getConnection().size();

		int codigo;
		if (size == 0) {
			codigo = 2020;
		} else {
			codigo = MaterialMI.getConnection().get(size - 1).getCodigo();
			codigo++;
		}

//		----------------------------

		Material material = new Material(codigo, 2, nome, descricao, tipo, quantidade);

		MaterialMI.getConnection().add(material);

//		----------------------------

		RequestDispatcher rd = request.getRequestDispatcher("ListaMaterial");
		rd.forward(request, response);
	}

}
