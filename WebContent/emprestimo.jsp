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
				<li><a href="devolucao.jsp"> Devolu��o</a></li>
			</ul>

		</ul>
	</nav>

	<article>

		<h1>Emprestimo</h1>

		<form method="post" action="Emprestimo">
			<input type="hidden" name="acao" id="acao" value="verifica">

			<table>

				<tr>
					<td align="right">Informe o seu CPF:</td>
					<td><input type="text" name="cpf" id="cpf"></td>
				</tr>

				<tr>
					<td><br></td>
				</tr>

				<tr>
					<td><br></td>
					<td align="left"><button type="submit">Pr�ximo</button></td>
				</tr>

			</table>

		</form>
	</article>

</body>
</html>