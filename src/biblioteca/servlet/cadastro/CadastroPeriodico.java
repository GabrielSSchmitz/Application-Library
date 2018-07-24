package biblioteca.servlet.cadastro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.entidade.Periodico;
import bliblioteca.daoMI.MaterialMI;
import bliblioteca.daoMI.PeriodicoMI;

@WebServlet("/CadastroPeriodico")
public class CadastroPeriodico extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CadastroPeriodico() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		
		String volumeString = request.getParameter("volume");
		int volume = Integer.parseInt(volumeString);
		
		String quantidadeString = request.getParameter("quantidade");
		int quantidade = Integer.parseInt(quantidadeString);

//		----------------------------

		int size = PeriodicoMI.getConnection().size();

		int codigo;
		if (size == 0) {
			codigo = 0;
		} else {
			codigo = MaterialMI.getConnection().get(size - 1).getCodigo();
			codigo++;
		}

//		----------------------------
		
		Periodico periodico = new Periodico(codigo, 3, nome, volume, quantidade);
		
		PeriodicoMI.getConnection().add(periodico);

//		----------------------------
		
		RequestDispatcher rd = request.getRequestDispatcher("/cadastro.jsp");
		rd.forward(request, response);
		
	}

}
