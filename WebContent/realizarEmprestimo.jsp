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
		<a href="index.jsp"><button>Index</button></a> <a href="lista.jsp"><button>Lista</button></a>
		<a href="cadastro.jsp"><button>Cadastro</button></a>
		<div class="dropdown">

			<a href="emprestimo.jsp"><button class="dropdown">Emprestimo</button></a>

			<div class="dropdown-content">

				<a href="cancelamento.jsp"><button>Cancelamento</button></a> <a
					href="devolucao.jsp"><button>Devolução</button></a>

			</div>
		</div>
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
					<td align="right" style="width: 200px;">Tipo de material:</td>

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


				<!-- ========================================================== -->

				<tr id="tipo" style="display: block">
					<td><br></td>
				</tr>

				<tr id="listaLivro" style="display: none">
					<c:choose>
						<c:when test="${livro.size() > 0}">
							<td>Livro:</td>
							<td><select id="livro" name="livro">
									<c:forEach items="${livro}" var="lista">
										<c:if test="${lista.quantidadeEmprestimo > 0}">
											<option value="${lista.codigo}">${lista.nome}</option>
										</c:if>
									</c:forEach>
							</select></td>
						</c:when>
						<c:otherwise>
							<td> Nada cadastrado</td>
						</c:otherwise>
					</c:choose>

				</tr>

				<tr id="listaMaterial" style="display: none">
					<c:choose>
						<c:when test="${material.size() > 0}">
							<td>Material:</td>
							<td><select id="material" name="material">
									<c:forEach items="${material}" var="lista">
										<c:if test="${lista.quantidadeEmprestimo > 0}">
											<option value="${lista.codigo}">${lista.nome}</option>
										</c:if>
									</c:forEach>
							</select></td>
						</c:when>
						<c:otherwise>
							<td> Nada cadastrado</td>
						</c:otherwise>
					</c:choose>

				</tr>

				<tr id="listaPeriodico" style="display: none">
					<c:choose>
						<c:when test="${periodico.size() > 0}">
							<td>Periodico:</td>
							<td><select id="periodico" name="periodico">
									<c:forEach items="${periodico}" var="lista">
										<c:if test="${lista.quantidadeEmprestimo > 0}">
											<option value="${lista.codigo}">${lista.nome}</option>
										</c:if>
									</c:forEach>
							</select></td>
						</c:when>
						<c:otherwise>
							<td> Nada cadastrado</td>
						</c:otherwise>
					</c:choose>

				</tr>


				<!-- ========================================================== -->


				<tr>
					<td><br></td>
				</tr>

				<tr>
					<td align="right">Data:</td>
					<td><input type="text" name="data" id="data" readonly="true"></td>
				</tr>

				<tr>
					<td><br></td>
				</tr>

				<tr>
					<td colspan="2" align="right"><input type="submit"
						class="list" value="Cadastrar"></td>
				</tr>

			</table>
		</form>

	</article>

	<script type="text/javascript">
		var d = new Date();
		document.getElementById("data").value = d.toDateString();

		function opcoes() {
			var x = document.getElementById("mySelect").value;

			if (x == "tipo") {
				document.getElementById('listaLivro').style.display = 'none';
				document.getElementById('listaPeriodico').style.display = 'none';
				document.getElementById('listaMaterial').style.display = 'none';
				document.getElementById('tipo').style.display = 'block';

			}

			if (x == "livro") {
				document.getElementById('listaLivro').style.display = 'block';
				document.getElementById('listaPeriodico').style.display = 'none';
				document.getElementById('listaMaterial').style.display = 'none';
				document.getElementById('tipo').style.display = 'none';


				document.getElementById('periodico').value = '0';
				document.getElementById('material').value = '0';

			}
			if (x == "periodico") {
				document.getElementById('listaLivro').style.display = 'none';
				document.getElementById('listaPeriodico').style.display = 'block';
				document.getElementById('listaMaterial').style.display = 'none';
				document.getElementById('tipo').style.display = 'none';

				document.getElementById('livro').value = '0';
				document.getElementById('material').value = '0';

			}
			if (x == "material") {
				document.getElementById('listaLivro').style.display = 'none';
				document.getElementById('listaPeriodico').style.display = 'none';
				document.getElementById('listaMaterial').style.display = 'block';
				document.getElementById('tipo').style.display = 'none';

				document.getElementById('periodico').value = '0';
				document.getElementById('livro').value = '0';

			}

		}
	</script>
	</ body>
</html>