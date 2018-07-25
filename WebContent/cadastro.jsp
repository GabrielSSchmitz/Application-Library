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

		<h1>Cadastro</h1>

		<ul>
			<li><a href="cadastroPessoa.jsp"> Pessoa</a></li>
			<li><a href="CadastroLivro?acao=lista">Livro</a></li>
			<ul>
				<li><a href="cadastroAutor.jsp">Autor</a></li>
				<li><a href="cadastroEditora.jsp">Editora</a></li>
			</ul>
			<li><a href="cadastroPeriodico.jsp">Periodico</a></li>
			<li><a href="cadastroMaterial.jsp">Material</a></li>
		</ul>
	</article>

</body>
</html>