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
		String identificador = request.getParameter("identificador");

		String nome = request.getParameter("nome");

		String nacionalString = request.getParameter("nacional");

		if (nacionalString != null) {
			nacional = true;
		}

//		----------------------------

		Editora editora = new Editora(identificador, nome, nacional);

		EditoraMI.getConnection().add(editora);

//		----------------------------

		RequestDispatcher rd = request.getRequestDispatcher("ListaEditora");
		rd.forward(request, response);
	}

}
