package biblioteca.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.entidade.Emprestar;
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");

//	----------------------------

		PessoaMI pessoaMI = new PessoaMI();
		pessoaMI.setList(PessoaMI.getConnection());

		LivroMI livroMI = new LivroMI();
		livroMI.setList(LivroMI.getConnection());

		MaterialMI materialMI = new MaterialMI();
		materialMI.setList(MaterialMI.getConnection());

		PeriodicoMI periodicoMI = new PeriodicoMI();
		periodicoMI.setList(PeriodicoMI.getConnection());

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
			String data = request.getParameter("data");
			System.out.println(data);

			String cpf = request.getParameter("cpf");
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
				String codigoString = request.getParameter("livro");
				int codigo = Integer.parseInt(codigoString);

				Livro livro = livroMI.procuraLivro(codigo);
				
				LivroMI.emprestimo(livro.getCodigo());
				
				Emprestar emprestar = new Emprestar(codigoId, pessoa, livro, data);
								
				EmprestarMI.getConnection().add(emprestar);

				RequestDispatcher rd = request.getRequestDispatcher("ListaEmprestimo");
				rd.forward(request, response);
			}

//			----------------------------

			if (request.getParameter("material") != null) {
				String codigoString = request.getParameter("material");
				int codigo = Integer.parseInt(codigoString);

				Material material = materialMI.procuraMaterial(codigo);
				MaterialMI.emprestimo(material.getCodigo());
				
				Emprestar emprestar = new Emprestar(codigoId, pessoa, material, data);

				EmprestarMI.getConnection().add(emprestar);

				RequestDispatcher rd = request.getRequestDispatcher("ListaEmprestimo");
				rd.forward(request, response);
			}

//			----------------------------

			if (request.getParameter("periodico") != null) {
				String codigoString = request.getParameter("periodico");
				int codigo = Integer.parseInt(codigoString);

				Periodico periodico = periodicoMI.procuraPeriodicol(codigo);
				PeriodicoMI.emprestimo(periodico.getCodigo());
				
				Emprestar emprestar = new Emprestar(codigoId, pessoa, periodico, data);

				EmprestarMI.getConnection().add(emprestar);

				RequestDispatcher rd = request.getRequestDispatcher("ListaEmprestimo");
				rd.forward(request, response);
			}
		}

	}

}
