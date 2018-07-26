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

		Material material = new Material(0, 2, "sdasd", "fsdfsd", "dsf", 2);
		Material material2 = new Material(1, 2, "ssaddd", "fsdfsd", "dsf", 2);
		MaterialMI.getConnection().add(material);
		MaterialMI.getConnection().add(material2);
		
		Periodico periodico = new Periodico(0, 3, "sdssdfsd", 2, 5);
		Periodico periodico2 = new Periodico(1, 1, "jhjkhkhjkh", 2, 5);
		PeriodicoMI.getConnection().add(periodico);
		PeriodicoMI.getConnection().add(periodico2);
		
		Editora editora = new Editora(0, "dsfsd", true);
		Editora editora2 = new Editora(1, "ytryr", false);
		EditoraMI.getConnection().add(editora);
		EditoraMI.getConnection().add(editora2);
		
		Autor autor = new Autor(0, "dfsf", "fsdfsdf");
		Autor autor2 = new Autor(1, "dasdas", "fsdfsdf");
		AutorMI.getConnection().add(autor);
		AutorMI.getConnection().add(autor2);

		Livro livro = new Livro(0, 1, "dfsdf", "533", 2, 1, editora2, autor2, 2);
		Livro livro2 = new Livro(1, 1, "d432f", "789", 2, 1, editora2, autor2, 2);
		LivroMI.getConnection().add(livro);
		LivroMI.getConnection().add(livro2);
		
		Pessoa pessoa = new Pessoa("Gabriel", "42343", "123");
		Pessoa pessoa2 = new Pessoa("Teste", "wewqewq", "1");
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
