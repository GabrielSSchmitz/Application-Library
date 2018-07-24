package biblioteca.servlet.cadastro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.entidade.Pessoa;
import bliblioteca.daoMI.PessoaMI;



@WebServlet("/CadastroPessoa")
public class CadastroPessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CadastroPessoa() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpf = request.getParameter("cpf");
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");

//		----------------------------

		Pessoa pessoa = new Pessoa(nome, telefone, cpf);
		PessoaMI.getConnection().add(pessoa);

//		----------------------------

		RequestDispatcher rd = request.getRequestDispatcher("/cadastro.jsp");
		rd.forward(request, response);
	}

}
