package biblioteca.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bliblioteca.daoMI.EmprestarMI;
import bliblioteca.daoMI.LivroMI;
import bliblioteca.daoMI.MaterialMI;
import bliblioteca.daoMI.PeriodicoMI;

@WebServlet("/Cancelamento")
public class Cancelamento extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Cancelamento() {
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

		EmprestarMI emprestarMI = new EmprestarMI();
		emprestarMI.setList(EmprestarMI.getConnection());

		String cpf = request.getParameter("cpf");

		String codigo = request.getParameter("codigo");

		for (int i = 0; i < emprestarMI.getList().size(); i++) {
			if (emprestarMI.getList().get(i).getPessoa().getCpf().equals(cpf)) {
				for (int j = 0; j < emprestarMI.getList().size(); j++) {
					if (emprestarMI.getList().get(i).getItem().getCodigo() == codigo && emprestarMI.getList().get(i).isEmprestimo() == true) {

						System.out.println("Tipo: " + emprestarMI.getList().get(i).getItem().getTipo());

						if (emprestarMI.getList().get(i).getItem().getTipo() == 1) {
							LivroMI.devolucao(codigo);
						}
						if (emprestarMI.getList().get(i).getItem().getTipo() == 2) {
							MaterialMI.devolucao(codigo);
						}
						if (emprestarMI.getList().get(i).getItem().getTipo() == 3) {
							PeriodicoMI.devolucao(codigo);
						}
						for (int j2 = 0; j2 < EmprestarMI.getConnection().size(); j2++) {
							if (emprestarMI.getList().get(i) == EmprestarMI.getConnection().get(j2)) {
								EmprestarMI.getConnection().remove(j2);
							}
						}
						break;
					}
				}

			}
		}

		RequestDispatcher rd = request.getRequestDispatcher("ListaEmprestimo");
		rd.forward(request, response);
	}

}
