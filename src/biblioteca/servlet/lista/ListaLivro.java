package biblioteca.servlet.lista;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bliblioteca.daoMI.LivroMI;

@WebServlet("/ListaLivro")
public class ListaLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListaLivro() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("livrollista", LivroMI.getConnection());
		RequestDispatcher rd = request.getRequestDispatcher("/listaLivro.jsp");
		rd.forward(request, response);
	}

}
