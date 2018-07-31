<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" type="text/css" href="estilo.css">

<title>Biblioteca Tech</title>
</head>
<body>

	<header>
		<h1>Biblioteca Tech</h1>
	</header>

	<hr>

	<nav>
		<a href="index.jsp"><button>Index</button></a> <a href="lista.jsp"><button>Lista</button></a> <a href="cadastro.jsp"><button>Cadastro</button></a>
		<div class="dropdown">

			<a href="emprestimo.jsp"><button class="dropdown">Emprestimo</button></a>

			<div class="dropdown-content">

				<a href="cancelamento.jsp"><button>Cancelamento</button></a> <a href="devolucao.jsp"><button>Devolução</button></a>

			</div>
		</div>
	</nav>


	<article class="abaLista">

		<h1>Cadastro livro</h1>

		<form method="post" id="form" action="CadastroLivro">

			<input type="hidden" name="acao" id="acao" value="cadastrar">

			<table>
				<tr>
					<td align="right">Identificador (ISBN) :</td>
					<td align="right"><input type="text" id="identificador" name="identificador" style="width: 100%" required></td>
				</tr>
				<tr>
					<td align="right">Titulo :</td>
					<td align="right"><input type="text" id="titulo" name="titulo" style="width: 100%" required></td>
				</tr>
				<tr>
					<td align="right">Ano :</td>
					<td align="right"><input type="text" id="ano" name="ano" style="width: 100%" required></td>
				</tr>
				<tr>
					<td align="right">Edição :</td>
					<td align="left"><input type="number" id="edicao" name="edicao" min="1" max="99" style="width: 100%;" style="width: 100%" required></td>
				</tr>
				<tr>
					<td align="right">Volume :</td>
					<td align="left"><input type="number" id="volume" name="volume" min="1" max="99" style="width: 100%;" style="width: 100%" required></td>
				</tr>

				<!-- ========================================================== -->

				<tr>
					<c:choose>
						<c:when test="${editoraLista.size() > 0}">
							<input type="hidden" id="ideditora" value="se">
							<td align="right">ditora :</td>
							<td align="left"><select name="editora" style="width: 100%;">
									<c:forEach items="${editoraLista}" var="lista">
										<option value=${lista.codigo } style="width: 100%;">${lista.nome}</option>
									</c:forEach>
							</select></td>
						</c:when>
						<c:otherwise>
							<td align="right">Editora :</td>
							<td><input type="text" id="ideditora" value="Nada cadastrado" style="width: 100%" readonly></td>
						</c:otherwise>
					</c:choose>

				</tr>

				<!-- ========================================================== -->

				<tr class="element">
					<c:choose>
						<c:when test="${autorLista.size() > 0}">
							<input type="hidden" id="idautor" value="se">
							<td align="right">Autores :</td>
							<td align="left"><select name="autor" style="width: 100%;">
									<c:forEach items="${autorLista}" var="lista">
									
										<option value=${lista.codigo }>${lista.nome}</option>
									</c:forEach>
							</select></td>
						</c:when>
						<c:otherwise>
							<td align="right">Autores :</td>
							<td><input type="text" id="idautor" value="Nada cadastrado" style="width: 100%;" readonly></td>
						</c:otherwise>
					</c:choose>
				</tr>


				<!-- ========================================================== -->

				<!-- ========================================================== -->

				<tr>
					<td align="right">Quantidade :</td>
					<td align="left"><input type="number" id="quantidade" name="quantidade" min="1" max="99" style="width: 100%;" style="width: 100%" required></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>

				<!-- ========================================================== -->

				<tr>
					<td></td>

					<td id="submit" align="right" style="display: none"><input type="submit" class="list" value="Cadastrar"></td>
					<td id="verifica" align="right" style="display: none"><input type="button" class="list" value="Cadastrar" onclick="verifica()"></td>
				</tr>

				<!-- ===================================================+======= -->

			</table>
		</form>

	</article>
	<script type="text/javascript">
		if (document.getElementById('ideditora').value == 'Nada cadastrado') {
			document.getElementById('verifica').style.display = 'block';
		} else if (document.getElementById('idautor').value == 'Nada cadastrado') {
			document.getElementById('verifica').style.display = 'block';
		} else {
			document.getElementById('submit').style.display = 'block';
		}

		function verifica() {
			if (document.getElementById('ideditora').value == 'Nada cadastrado') {
				alert('Cadastre Editora');
			} else if (document.getElementById('idautor').value == 'Nada cadastrado') {
				alert('Cadastre Autor');
			} else {
				alert('teste');
				document.getElementById("form").submit();
			}
		}
	</script>
</body>
</html>