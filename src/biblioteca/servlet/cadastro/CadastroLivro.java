package biblioteca.servlet.cadastro;

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
import bliblioteca.daoMI.AutorMI;
import bliblioteca.daoMI.EditoraMI;
import bliblioteca.daoMI.LivroMI;

@WebServlet("/CadastroLivro")
public class CadastroLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroLivro() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cadastrar = request.getParameter("acao");

//		----------------------------

		if (cadastrar.equals("lista")) {

			request.setAttribute("editoraLista", EditoraMI.getConnection());
			request.setAttribute("autorLista", AutorMI.getConnection());
			RequestDispatcher rd = request.getRequestDispatcher("/cadastroLivro.jsp");
			rd.forward(request, response);

		}

//		----------------------------

		if (cadastrar.equals("cadastrar")) {
			String codigoString = request.getParameter("identificador");
			int codigo = Integer.parseInt(codigoString);

			String nome = request.getParameter("titulo");
			
			String ano = request.getParameter("ano");

			String edicaoString = request.getParameter("edicao");
			int edicao = Integer.parseInt(edicaoString);

			String volumeString = request.getParameter("volume");
			int volume = Integer.parseInt(volumeString);

			String quantidadeString = request.getParameter("quantidade");
			int quantidade = Integer.parseInt(quantidadeString);

//			----------------------------

			String editoraString = request.getParameter("editora");
			int editoraCodigo = Integer.parseInt(editoraString);
			
			EditoraMI editoraMI = new EditoraMI();	
			editoraMI.setList(EditoraMI.getConnection());

			Editora editora = editoraMI.procuraEditora(editoraCodigo);
			
//			----------------------------

			String autorString = request.getParameter("autor");
			int autorCodigo = Integer.parseInt(autorString);
			
			AutorMI autorMI = new AutorMI();
			autorMI.setList(AutorMI.getConnection());
			
			Autor autor = autorMI.procuraAutor(autorCodigo);
			
//			----------------------------

			Livro livro = new Livro(codigo, 1, nome, ano, edicao, volume, editora, autor, quantidade);
			
			LivroMI.getConnection().add(livro);

//			----------------------------

			RequestDispatcher rd = request.getRequestDispatcher("ListaLivro");
			rd.forward(request, response);
		}

	}

}
