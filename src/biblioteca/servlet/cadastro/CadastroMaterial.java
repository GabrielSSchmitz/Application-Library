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
		String identificador = request.getParameter("identificador");
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		String tipo = request.getParameter("tipo");
		String quantidadeString = request.getParameter("quantidade");
		String estante = request.getParameter("estante");

		int quantidade = Integer.parseInt(quantidadeString);


		Material material = new Material(identificador, 2, nome, descricao, tipo, quantidade,estante);

		MaterialMI.getConnection().add(material);

//		----------------------------

		RequestDispatcher rd = request.getRequestDispatcher("ListaMaterial");
		rd.forward(request, response);
	}

}
