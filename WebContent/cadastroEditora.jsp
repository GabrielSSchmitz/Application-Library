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

		<h1>Cadastro editora</h1>

		<form method="post" action="CadastroEditora">

			<table>

				<tr>
					<td align="right">Nome :</td>
					<td align="right"><input type="text" name="nome" id="nome"></td>
				</tr>

				<tr>
					<td align="right">Nacional :</td>
					<td align="left"><input type="checkbox" name="nacional"
						id="nacional"></td>
				</tr>

				<tr>
					<td><br></td>
				</tr>

				<tr>
					<td colspan="2" align="right"><input type="submit" class="list" value="Cadastrar"></td>
				</tr>

			</table>

		</form>
	</article>

</body>
</html>