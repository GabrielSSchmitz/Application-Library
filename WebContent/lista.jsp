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

		<h1>Lista</h1>

		<a href="ListaPessoa" 		class = "list">	<button style="width: 100%;">Pessoa		</button></a> <br>
		<a href="ListaLivro"  		class = "list">	<button style="width: 100%;">Livro		</button></a> <br>

		<a href="ListaAutor"  		class = "list">	<button style="width: 100%;">Autor		</button></a> <br>
		<a href="ListaEditora"		class = "list">	<button style="width: 100%;">Editora	</button></a> <br>

		<a href="ListaPeriodico" 	class = "list">	<button style="width: 100%;">Periodico	</button></a> <br>
		<a href="ListaMaterial"		class = "list">	<button style="width: 100%;">Material	</button></a> <br>
		<a href="ListaEmprestimo"	class = "list">	<button style="width: 100%;">Emprestimo	</button></a> <br>


	</article>

</body>
</html>