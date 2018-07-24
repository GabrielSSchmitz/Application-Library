package biblioteca.servlet.lista;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bliblioteca.daoMI.PeriodicoMI;


@WebServlet("/ListaPeriodico")
public class ListaPeriodico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public ListaPeriodico() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("periodicoLista", PeriodicoMI.getConnection());
		RequestDispatcher rd = request.getRequestDispatcher("/listaPeriodico.jsp");
		rd.forward(request, response);
	}

}
