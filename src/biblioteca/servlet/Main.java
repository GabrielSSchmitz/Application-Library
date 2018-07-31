package biblioteca.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.entidade.Autor;
import biblioteca.entidade.Editora;
import biblioteca.entidade.Livro;
import biblioteca.entidade.Material;
import biblioteca.entidade.Periodico;
import biblioteca.entidade.Pessoa;
import bliblioteca.daoMI.AutorMI;
import bliblioteca.daoMI.EditoraMI;
import bliblioteca.daoMI.LivroMI;
import bliblioteca.daoMI.MaterialMI;
import bliblioteca.daoMI.PeriodicoMI;
import bliblioteca.daoMI.PessoaMI;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();		

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
//		Editora editora = new Editora(0, "dsfsd", true);
//		Editora editora2 = new Editora(1, "ytryr", false);
//		EditoraMI.getConnection().add(editora);
//		EditoraMI.getConnection().add(editora2);
//		
//		Autor autor = new Autor(0, "dfsf", "fsdfsdf");
//		Autor autor2 = new Autor(1, "dasdas", "fsdfsdf");
//		AutorMI.getConnection().add(autor);
//		AutorMI.getConnection().add(autor2);
//
//		Livro livro = new Livro(0, 1, "dfsdf", "533", 2, 1, editora2, autor2, 2);
//		Livro livro2 = new Livro(1, 1, "d432f", "789", 2, 1, editora2, autor2, 2);
//		LivroMI.getConnection().add(livro);
//		LivroMI.getConnection().add(livro2);
		
		Pessoa pessoa = new Pessoa("Teste", "Teste", "123");
		Pessoa pessoa2 = new Pessoa("Teste2", "Teste2", "321");
		PessoaMI.getConnection().add(pessoa);
		PessoaMI.getConnection().add(pessoa2);
		
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
