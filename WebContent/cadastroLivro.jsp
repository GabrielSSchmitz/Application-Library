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

		<h1>Cadastro livro</h1>

		<form method="post" action="CadastroLivro">

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
					<td align="left"><input type="number" id="edicao"
						name="edicao" min="1" max="99" style="width: 100%;" style="width: 100%" required></td>
				</tr>
				<tr>
					<td align="right">Volume :</td>
					<td align="left"><input type="number" id="volume"
						name="volume" min="1" max="99" style="width: 100%;" style="width: 100%" required></td>
				</tr>
				<tr>
					<td align="right">Editora :</td>
					<td align="left"><select name="editora" style="width: 100%;">
							<option>Selecione a editora</option>
							<c:forEach items="${editoraLista}" var="lista">
								<option value=${lista.codigo}>${lista.nome}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td align="right">Autores :</td>
					<td align="left"><select name="autor" style="width: 100%;">
							<option>Selecione o autor</option>
							<c:forEach items="${autorLista}" var="lista">
								<option value=${lista.codigo}>${lista.nome}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td align="right">Quantidade :</td>
					<td align="left"><input type="number" id ="quantidade" name="quantidade" min="1" max="99" style="width: 100%;" style="width: 100%" required></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" class="list" value="Cadastrar" style="width: 100%"></td>
				</tr>
			</table>
		</form>

	</article>

</body>
</html>