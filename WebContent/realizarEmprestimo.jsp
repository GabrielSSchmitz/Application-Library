<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Estilo.css">
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

		<h1>Emprestimo</h1>

		<form method="post" action="Emprestimo">

			<input type="hidden" name="acao" id="acao" value="emprestimo">

			<table>

				<tr>
					<td align="right" style="width: 150px;">Nome:</td>
					<td><input type="text" name="nome" id="nome"
						value="${pessoa.nome}" readonly="true"></td>
				</tr>

				<tr>
					<td align="right">CPF:</td>
					<td><input type="text" name="cpf" id="cpf"
						value="${pessoa.cpf}" readonly="true"></td>
				</tr>

				<tr>
					<td align="right">Telefone:</td>
					<td><input type="text" name="telefone" id="telefone"
						value="${pessoa.telefone}" readonly="true"></td>
				</tr>

				<tr>
					<td><br></td>
				</tr>

				<tr>
					<td align="right">Tipo de material:</td>

					<td><select id="mySelect" onchange="opcoes()"
						style="width: 100%;">
							<option value="tipo">Tipo
							<option value="periodico">Periodico
							<option value="livro">Livro
							<option value="material">Material Especial
					</select></td>

				</tr>

				<tr>
					<td><br></td>
				</tr>


				<tr id="listaLivro" style="display: none">
					<td>Livro:</td>
					<td>
						<select id="livro" name="livro">
							<c:forEach items="${livro}" var="lista">
								<option value="${lista.codigo}">${lista.nome}</option>
							</c:forEach>
						</select>
					</td>
				</tr>


				<tr id="listaMaterial" style="display: none">
					<td>Material:</td>
					<td>
						<select id="material" name="material">
							<c:forEach items="${material}" var="lista">
								<option value="${lista.codigo}">${lista.nome}</option>
							</c:forEach>
						</select>
					</td>
				</tr>

				<tr id="listaPeriodico" style="display: none">
					<td>Periodico:</td>
					<td>
						<select id="periodico" name="periodico">
							<c:forEach items="${periodico}" var="lista">
								<option value="${lista.codigo}">${lista.nome}</option>
							</c:forEach>
						</select>
					</td>
				</tr>

				<tr>
					<td><br></td>
				</tr>

				<tr>
					<td><input type="submit" Value="Próximo"> </td>
				</tr>

			</table>
		</form>

	</article>

	<script type="text/javascript">
		function opcoes() {
			var x = document.getElementById("mySelect").value;

			if (x == "tipo") {
				document.getElementById('listaLivro').style.display = 'none';
				document.getElementById('listaPeriodico').style.display = 'none';
				document.getElementById('listaMaterial').style.display = 'none';

			}

			if (x == "livro") {
				document.getElementById('listaLivro').style.display = 'block';
				document.getElementById('listaPeriodico').style.display = 'none';
				document.getElementById('listaMaterial').style.display = 'none';

			}
			if (x == "periodico") {
				document.getElementById('listaLivro').style.display = 'none';
				document.getElementById('listaPeriodico').style.display = 'block';
				document.getElementById('listaMaterial').style.display = 'none';

			}
			if (x == "material") {
				document.getElementById('listaLivro').style.display = 'none';
				document.getElementById('listaPeriodico').style.display = 'none';
				document.getElementById('listaMaterial').style.display = 'block';

			}
		}
	</script>
	</ body>
</html>