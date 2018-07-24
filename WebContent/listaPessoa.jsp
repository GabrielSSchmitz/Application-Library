<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

		<h1>Lista pessoa</h1>

		<form method="post" action="ListaPessoa">
			<table border="1">
				<tr>
					<th align="left"><b> CPF </b></th>
					<th align="left"><b> Nome </b></th>
					<th align="left"><b> Telefone </b></th>
				</tr>

				<c:forEach items="${listaPessoa}" var="lista">

					<tr>
						<td>${lista.cpf}</td>
						<td>${lista.nome}</td>
						<td>${lista.telefone}</td>
					</tr>

				</c:forEach>

			</table>
			<br> <a href="lista.jsp"> Voltar </a>
		</form>
	</article>

</body>
</html>