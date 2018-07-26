package biblioteca.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.entidade.Emprestar;
import biblioteca.entidade.Item;
import biblioteca.entidade.Livro;
import biblioteca.entidade.Material;
import biblioteca.entidade.Periodico;
import biblioteca.entidade.Pessoa;
import bliblioteca.daoMI.EmprestarMI;
import bliblioteca.daoMI.LivroMI;
import bliblioteca.daoMI.MaterialMI;
import bliblioteca.daoMI.PeriodicoMI;
import bliblioteca.daoMI.PessoaMI;

@WebServlet("/Emprestimo")
public class Emprestimo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Emprestimo() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");

//	----------------------------

		PessoaMI pessoaMI = new PessoaMI();
		pessoaMI.setList(PessoaMI.getConnection());

//		----------------------------

		if (acao.equals("verifica")) {

			String cpf = request.getParameter("cpf");
			if (pessoaMI.cpfIsCadastrado(cpf)) {

				request.setAttribute("pessoa", pessoaMI.procuraPessoa(cpf));
				request.setAttribute("livro", LivroMI.getConnection());
				request.setAttribute("material", MaterialMI.getConnection());
				request.setAttribute("emprestimo", MaterialMI.getConnection());
				request.setAttribute("periodico", PeriodicoMI.getConnection());

//				----------------------------

				RequestDispatcher rd = request.getRequestDispatcher("/realizarEmprestimo.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("/cadastroPessoa.jsp");
				rd.forward(request, response);
			}
		}

//		----------------------------

		if (acao.equals("emprestimo")) {
			
			Item item = null;
			
			String data = request.getParameter("data");
			System.out.println(data);

			String cpf = request.getParameter("cpf");
			@SuppressWarnings("unused")
			Pessoa pessoa = pessoaMI.procuraPessoa(cpf);

//			----------------------------

			int size = EmprestarMI.getConnection().size();

			int codigoId;
			if (size == 0) {
				codigoId = 0;
			} else {
				codigoId = EmprestarMI.getConnection().get(size - 1).getCodigo();
				codigoId++;
			}

//			----------------------------

			if (request.getParameter("livro") != null) {
				LivroMI livroMI = new LivroMI();
				livroMI.setList(LivroMI.getConnection());

				int codigo = Integer.parseInt(request.getParameter("livro"));

				LivroMI.emprestimo(codigo);

				item = livroMI.procuraLivro(codigo);
			}

//			----------------------------

			if (request.getParameter("material") != null) {
				MaterialMI materialMI = new MaterialMI();
				materialMI.setList(MaterialMI.getConnection());

				int codigo = Integer.parseInt(request.getParameter("material"));

				MaterialMI.emprestimo(codigo);

				item = materialMI.procuraMaterial(codigo);
			}

//			----------------------------

			if (request.getParameter("periodico") != null) {
				PeriodicoMI periodicoMI = new PeriodicoMI();
				periodicoMI.setList(PeriodicoMI.getConnection());

				int codigo = Integer.parseInt(request.getParameter("periodico"));

				
				Periodico periodico = periodicoMI.procuraPeriodicol(codigo);
				item = periodico;
		
				PeriodicoMI.devolucao(codigo);
			}

//			----------------------------

			Emprestar emprestar = new Emprestar(codigoId, item, data, pessoa);
			EmprestarMI.getConnection().add(emprestar);

//			----------------------------

			RequestDispatcher rd = request.getRequestDispatcher("ListaEmprestimo");
			rd.forward(request, response);
		}

	}

}
