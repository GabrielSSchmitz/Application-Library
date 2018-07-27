package biblioteca.servlet.lista;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bliblioteca.daoMI.EmprestarMI;


/**
 * Servlet implementation class ListaEmprestimo
 */
@WebServlet("/ListaEmprestimo")
public class ListaEmprestimo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListaEmprestimo() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("emprestarLista", EmprestarMI.getConnection());
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmprestar.jsp");
		rd.forward(request, response);
	}

}
