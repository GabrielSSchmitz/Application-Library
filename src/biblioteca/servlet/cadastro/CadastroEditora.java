package biblioteca.servlet.cadastro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.entidade.Editora;
import bliblioteca.daoMI.EditoraMI;

@WebServlet("/CadastroEditora")
public class CadastroEditora extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroEditora() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean nacional = false;

		String nome = request.getParameter("nome");

		String nacionalString = request.getParameter("nacional");

		if (nacionalString != null) {
			nacional = true;
		}

//		----------------------------

		int size = EditoraMI.getConnection().size();
		int codigo;
		if (size == 0) {
			codigo = 0;
		} else {
			codigo = EditoraMI.getConnection().get(size - 1).getCodigo();
			codigo++;
		}

//		----------------------------

		Editora editora = new Editora(codigo, nome, nacional);

		EditoraMI.getConnection().add(editora);

//		----------------------------

		RequestDispatcher rd = request.getRequestDispatcher("/cadastro.jsp");
		rd.forward(request, response);
	}

}
