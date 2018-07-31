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


	<article class="abaLista">e>

		<h1>Lista emprestar</h1>

		<form method="post" action="ListaLivro">
			<table  class="lista">
				<tr  class="lista">

					<th align="left"><b> Código </b></th>
					<th align="left"><b> CPF </b></th>
					<th align="left"><b> Nome </b></th>
					<th align="left"><b> Item </b></th>
					<th align="left"><b> Item código </b></th>
					<th align="left"><b> Item tipo </b></th>
					<th align="left"><b> Data </b></th>
					<th align="left"><b> Situação emprestimo </b></th>

				</tr>

				<c:forEach items="${emprestarLista}" var="lista">

					<tr class="listaSeleçao">
						<td>${lista.codigo}</td>
						<td>${lista.pessoa.cpf}</td>
						<td>${lista.pessoa.nome}</td>
						<td>${lista.item.nome}</td>						
						<td>${lista.item.codigo}</td>						
						<td>${lista.item.tipo}</td>						
						<td>${lista.data}</td>						
						<td>${lista.emprestimo}</td>						
					</tr>

				</c:forEach>

			</table>
			</br> <a href="lista.jsp" class="list"> Voltar </a>
		</form>

	</article>

</body>
</html>