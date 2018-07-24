package biblioteca.servlet.cadastro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.entidade.Autor;
import bliblioteca.daoMI.AutorMI;

@WebServlet("/CadastroAutor")
public class CadastroAutor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroAutor() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String codigoString = request.getParameter("codigo");
		int codigo = Integer.parseInt(codigoString);
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");

//		----------------------------

		Autor autor = new Autor(codigo, nome, sobrenome);
		
		AutorMI.getConnection().add(autor);

//		----------------------------


		RequestDispatcher rd = request.getRequestDispatcher("/cadastro.jsp");
		rd.forward(request, response);
	}

}
