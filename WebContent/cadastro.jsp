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

		<h1>Cadastro </h1>

		<a href="cadastroPessoa.jsp" 		class = "list">	<button style="width: 100%;">Pessoa		</button></a> <br>
		<a href="CadastroLivro?acao=lista"  class = "list">	<button style="width: 100%;">Livro		</button></a> <br>

		<a href="cadastroAutor.jsp"  		class = "list">	<button style="width: 100%;">Autor		</button></a> <br>
		<a href="cadastroEditora.jsp"		class = "list">	<button style="width: 100%;">Editora	</button></a> <br>

		<a href="cadastroPeriodico.jsp" 	class = "list">	<button style="width: 100%;">Periodico	</button></a> <br>
		<a href="cadastroMaterial.jsp"		class = "list">	<button style="width: 100%;">Material	</button></a> <br>
	</article>

</body>
</html>