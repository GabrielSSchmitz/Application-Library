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


	<article class="abaLista">

		<h1>Lista material</h1>
		<form method="get" action="listaMaterial">
			<table class="lista">
				<tr class="lista">

					<th align="center"><b> Código </b></th>
					<th align="center"><b> Nome </b></th>
					<th align="center"><b> Descrição </b></th>
					<th align="center"><b> Tipo </b></th>
					<th align="center"><b> Quantidade </b></th>
					<th align="center"><b> Quantidade disponivel</b></th>
					<th align="center"><b> Estante</b></th>

				</tr>

				<c:forEach items="${materialLista}" var="lista">

					<tr class="listaSeleçao">
						<td>${lista.codigo}</td>
						<td>${lista.nome}</td>
						<td>${lista.descricao}</td>
						<td>${lista.material}</td>
						<td>${lista.quantidade}</td>
						<td>${lista.quantidadeEmprestimo}</td>
						<td>${lista.estante}</td>
					</tr>

				</c:forEach>

			</table>
			</br> <a href="lista.jsp" class="list"> Voltar </a>
		</form>
	</article>

</body>
</html>