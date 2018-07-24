package biblioteca.servlet.lista;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bliblioteca.daoMI.MaterialMI;


@WebServlet("/ListaMaterial")
public class ListaMaterial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListaMaterial() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("materialLista", MaterialMI.getConnection());
		RequestDispatcher rd = request.getRequestDispatcher("/listaMaterial.jsp");
		rd.forward(request, response);
	}

}
