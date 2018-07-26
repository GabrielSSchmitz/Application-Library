package biblioteca.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bliblioteca.daoMI.EmprestarMI;
import bliblioteca.daoMI.LivroMI;
import bliblioteca.daoMI.MaterialMI;
import bliblioteca.daoMI.PeriodicoMI;

/**
 * Servlet implementation class Devolucao
 */
@WebServlet("/Devolucao")
public class Devolucao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Devolucao() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmprestarMI emprestarMI = new EmprestarMI();
		emprestarMI.setList(EmprestarMI.getConnection());

		String cpf = request.getParameter("cpf");
		String codigoString = request.getParameter("codigo");
		int codigo = Integer.parseInt(codigoString);

	}

}
