<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="estilo.css">
<script type="text/javascript" src="JavaScript.js"></script>

<title>Biblioteca Tech</title>
</head>
<body>

	<header>
		<h1>Biblioteca Tech</h1>
	</header>

	<hr>

	<nav>
			<a href="index.jsp"><button>Index</button></a>
			<a href="lista.jsp"><button>Lista</button></a>
			<a href="cadastro.jsp"><button>Cadastro</button></a>
			<div class="dropdown">
			
				<a href="emprestimo.jsp"><button class="dropdown">Emprestimo</button></a>
				
				<div class="dropdown-content">
				
					<a href="cancelamento.jsp"><button>Cancelamento</button></a> 
					<a href="devolucao.jsp"><button>Devolução</button></a>
					
				</div>
			</div>
	</nav>

	<article>

		<h1>Lista livro</h1>

		<form method="post" action="ListaLivro">
			<table class="lista">
				<tr class="lista">

					<th align="center"><b> Identificador </b></th>
					<th align="center"><b> Titulo </b></th>
					<th align="center"><b> Data </b></th>
					<th align="center"><b> Edição </b></th>
					<th align="center"><b> Volume </b></th>
					<th align="center"><b> Editora </b></th>
					<th align="center"><b> Autor </b></th>
					<th align="center"><b> Quantidade </b></th>
					<th align="center"><b> Quantidade disponivel </b></th>

				</tr>

				<c:forEach items="${livrollista}" var="lista">

					<tr>
						<td>${lista.codigo}</td>
						<td>${lista.nome}</td>
						<td>${lista.data}</td>
						<td>${lista.edicao}</td>
						<td>${lista.volume}</td>
						<td>${lista.editora.nome}</td>
						<td>${lista.autor.nome}</td>
						<td>${lista.quantidade}</td>
						<td>${lista.quantidadeEmprestimo}</td>
					</tr>

				</c:forEach>

			</table>
			</br> <a href="lista.jsp" class="list"> Voltar </a>
		</form>

	</article>

</body>
</html>