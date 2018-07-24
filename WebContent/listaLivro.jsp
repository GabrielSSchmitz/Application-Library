<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Estilo.css">
<script type="text/javascript" src="JavaScript.js"></script>
<title>Biblioteca Tech</title>
</head>
<body>

	<header>
		<h1>Biblioteca Tech</h1>
	</header>

	<nav>
		<ul>
			<li><a href="index.jsp">Index</a></li>
			<li><a href="cadastro.jsp">Cadastro</a></li>
			<li><a href="lista.jsp">Lista</a></li>
			<li><a href="emprestimo.jsp">Emprestimo</a></li>

			<ul>
				<li><a href="cancelamento.jsp"> Cancelamento</a></li>
				<li><a href="devolucao.jsp"> Devolução</a></li>
			</ul>

		</ul>
	</nav>

	<article>

		<h1>Lista livro</h1>

		<form method="post" action="ListaLivro">
			<table border="1">
				<tr>

					<th align="left"><b> Identificador </b></th>
					<th align="left"><b> Titulo </b></th>
					<th align="left"><b> Data </b></th>
					<th align="left"><b> Edição </b></th>
					<th align="left"><b> Volume </b></th>
					<th align="left"><b> Editora </b></th>
					<th align="left"><b> Autor </b></th>

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
					</tr>

				</c:forEach>

			</table>
			</br> <a href="lista.jsp" align="center"> Voltar </a>
		</form>

	</article>

</body>
</html>