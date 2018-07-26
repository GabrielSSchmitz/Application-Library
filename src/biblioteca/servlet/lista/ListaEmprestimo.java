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
		for (int i = 0; i < EmprestarMI.getConnection().size(); i++) {
			System.out.println("Código: " + EmprestarMI.getConnection().get(i).getCodigo());
			System.out.println("Cpf: " + EmprestarMI.getConnection().get(i).getPessoa().getCpf());
			System.out.println("Nome: " + EmprestarMI.getConnection().get(i).getPessoa().getNome());
			System.out.println("Item: " + EmprestarMI.getConnection().get(i).getItem().getNome());
			System.out.println("Codigo item" + EmprestarMI.getConnection().get(i).getItem().getCodigo());
			System.out.println("Data: " + EmprestarMI.getConnection().get(i).getData());
		}
		request.setAttribute("emprestarLista", EmprestarMI.getConnection());
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmprestar.jsp");
		rd.forward(request, response);
	}

}
