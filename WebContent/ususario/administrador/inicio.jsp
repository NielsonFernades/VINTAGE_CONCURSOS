<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

<title>Inicio Vintage Concursos</title>
<!-- meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <!--carrossel-->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
  <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>
  
		<link rel="stylesheet" href="../../ressources/css/stylecarousel.css">
		<link rel="stylesheet" href="../../ressources/css/stylemenu.css">
		<link rel="stylesheet" href="../../ressources/css/stylefoot.css">
		
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js'></script>
		
		<script src="../../ressources/js/indexcarousel.js"></script>
  
		
		<!--Modelo de link rel="stylesheet" href="../../ressources/css/style.css" type="text/css" rel="stylesheet"/-->
	
</head>

<body>

<nav id="topNav" class="navbar navbar-inverse navbar-fixed-top">
<!--nav class="navbar navbar-inverse" id="menu"-->
  <div class="container-fluid">
    <div class="navbar-header">
		<img src="../../ressources/assets/logo_caneta.png" class="img-responsive" alt="Logo Vintage Concursos" height="120px" width="120px">
      <!--a class="navbar-brand" href="#">WebSiteOfficial</a-->
    </div>
	  
	
    <ul class="nav navbar-nav">
	
	<div class="navbar-collapse collapse" id="bs-navbar">
                <ul class="nav navbar-nav">
                    <!--li><a class="navbar-brand page-scroll" href="#topo"><i class="ion-ios-analytics-outline"></i>Home</a></li-->
					<li><a class="page-scroll" href="#mycarousel">Home</a></li>
					<li><a>|</a></li>
					<li><a class="page-scroll" href="#one">Notícias</a></li>
					<li><a>|</a></li>
                    <li><a class="page-scroll" href="#two">Provas</a></li>
					<li><a>|</a></li>
                    <li><a class="page-scroll" href="#three">Sites</a></li>
					<li><a>|</a></li>
					<li><a class="page-scroll" href="#four">Questões</a></li>
					<li><a>|</a></li>
					<li><a class="page-scroll" href="#REDACAO">Redação</a></li>
					<li><a>|</a></li>
					<li><a class="page-scroll" href="#six">Cusrsos e Aulas</a></li>
	
      <!--li class="active"><a href="#">Home</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
	  <li><a href="#">Page 3</a></li>
      <li><a href="#">Page 4</a></li>
	  <li><a href="#">Page 5</a></li>
      <li><a href="#">Page 6</a></li-->
    </ul>
	
	<ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	  <li class="last leaf depth-1"><a href="http class="popup"><i class="fa fa-comments">
		</i>Chat On-line</a></li>
    </ul>
	
	
	
    <form class="navbar-form navbar-left">
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Busca"> <!-- Search -->
        <div class="input-group-btn">
          <button class="btn btn-default" type="submit">
            <i class="glyphicon glyphicon-search"></i>
          </button>
        </div>
      </div>
    </form>
  </div>
  
  
</nav>

<!-- =================================================================================== PÁGINA INICIAL CARROSSEL =================================================================================== -->
	<div id="mycarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#mycarousel" data-slide-to="0" class="active"></li>
    <li data-target="#mycarousel" data-slide-to="1"></li>
    <li data-target="#mycarousel" data-slide-to="2"></li>
    <li data-target="#mycarousel" data-slide-to="3"></li>
    <li data-target="#mycarousel" data-slide-to="4"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item">
        <img src="https://unsplash.it/2000/1250?image=397" data-color="lightblue" alt="Primeira Imagem">
        <div class="carousel-caption">
            <h3>First Image</h3>
        </div>
    </div>
    <div class="item">
        <img src="https://unsplash.it/2000/1250?image=689" data-color="firebrick" alt="Second Image">
        <div class="carousel-caption">
            <h3>Second Image</h3>
        </div>
    </div>
    <div class="item">
        <img src="https://unsplash.it/2000/1250?image=675" data-color="violet" alt="Third Image">
        <div class="carousel-caption">
            <h3>Third Image</h3>
        </div>
    </div>
    <div class="item">
        <img src="https://unsplash.it/2000/1250?image=658" data-color="lightgreen" alt="Fourth Image">
        <div class="carousel-caption">
            <h3>Fourth Image</h3>
        </div>
    </div>
    <div class="item">
        <img src="https://unsplash.it/2000/1250?image=638" data-color="tomato" alt="Fifth Image">
        <div class="carousel-caption">
            <h3>Fifth Image</h3>
        </div>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#mycarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#mycarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

<!-- =================================================================================== FIM PÁGINA INICIAL CARROSSEL =================================================================================== -->

<div class="container">
  <h3>Navbar Forms</h3>
  <p>Use the .navbar-form class to vertically align form elements (same padding as links) inside the navbar.</p>
  <p>The .input-group class is a container to enhance an input by adding an icon, text or a button in front or behind it as a "help text".</p>
  <p>The .input-group-btn class attaches a button next to an input field. This is often used as a search bar:</p>
</div>


<!-- =================================================================================== REDAÇÃO =================================================================================== -->
    <section id="REDACAO">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="margin-top-0 wow fadeIn">Envie Sua Redação</h2>
                    <hr class="primary">
                    <p>Preencha o formulário abaixo e entraremos em contato o mais breve possível.</p>
                </div>
                <div class="col-lg-10 col-lg-offset-1 text-center">
                    <form class="contact-form row">
                        <div class="col-md-4">
                            <label></label>
                            <input type="text" class="form-control" placeholder="Name">
                        </div>
                        <div class="col-md-4">
                            <label></label>
                            <input type="text" class="form-control" placeholder="Email">
                        </div>
                        <div class="col-md-4">
                            <label></label>
                            <input type="text" class="form-control" placeholder="Fone">
                        </div>
                        <div class="col-md-12">
                            <label></label>
                            <textarea class="form-control" rows="9" placeholder="Sua mensagem aqui..."></textarea>
                        </div>
									<div class="form-group">
									<!--label for="exampleInputFile">Escolha seu Arquivo</label-->
										<input type="file" id="exampleInputFile">
									<!--h2 class="margin-top-0 wow fadeIn">Baixe Sua Redação aqui</h2-->
									</div>
									
                        <div class="col-md-4 col-md-offset-4">
                            <label></label>
							
							<!-- parte do botão class="btn btn-primary btn-block btn-lg"-->
						<button type="button" data-toggle="modal" data-target="#alertModal" >Enviar <i class="ion-android-arrow-forward"></i></button>
                        </div>
                    </form>
					
					<p class="help-block">Clique no botão para escolher e baixar sua Redação</p>
					<a href="https://www.google.com.br/" target="ext" class="btn btn-default btn-lg wow flipInX">Download</a>
                </div>
            </div>
        </div>
    </section>
	<!-- =================================================================================== FIM REDAÇÃO =================================================================================== -->
	
	<!-- =================================================================================== RODAPÉ =================================================================================== -->
    <footer id="footer">
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-6 col-sm-3 column">
                    <h4>Informações</h4>
                    <ul class="list-unstyled">
                        <li><a href="">Produtos</a></li>
                        <li><a href="">Serviços</a></li>
                        <li><a href="">Benefícios</a></li>
                        <li><a href="">Desenvolvedores</a></li>
                    </ul>
                </div>
                <div class="col-xs-6 col-sm-3 column">
                    <h4>Sobre</h4>
                    <ul class="list-unstyled">
                        <li><a href="#">Contate-Nos</a></li>
                        <li><a href="#">Informação de entrega</a></li>
                        <li><a href="#">Política de Privacidade</a></li>
                        <li><a href="#">Termos e Condições</a></li>
                    </ul>
                </div>
                <div class="col-xs-12 col-sm-3 column">
                    <h4>Fique Postado</h4>
                    <form>
                        <div class="form-group">
                          <input type="text" class="form-control" title="No spam, we promise!" placeholder="Diga-nos o seu email">
                        </div>
                        <div class="form-group">
                          <button class="btn btn-primary" data-toggle="modal" data-target="#alertModal" type="button">Inscrever-se para atualizações</button>
                        </div>
                    </form>
                </div>
                <div class="col-xs-12 col-sm-3 text-right">
                    <h4>Segue</h4>
                    <ul class="list-inline">
                      <li><a rel="nofollow" href="https://twitter.com/login" title="Twitter"><i class="icon-lg ion-social-twitter-outline"></i></a>&nbsp;</li>
                      <li><a rel="nofollow" href="https://www.facebook.com/fernandesnil" title="Facebook"><i class="icon-lg ion-social-facebook-outline"></i></a>&nbsp;</li>
                      <li><a rel="nofollow" href="https://www.instagram.com/accounts/login/?hl=pt-br" title="Instagram"><i class="icon-lg ion-social-instagram-outline"></i></a></li>
                    </ul>
                </div>
            </div>
            <br/>
            <span class="pull-right text-muted small"><a href="http://www.google.com.br">Vintage Concursos</a> ©2017 Company</span>
        </div>
    </footer>
	
	
    <!--div id="galleryModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog modal-lg">
        <div class="modal-content">
        	<div class="modal-body">
        		<img src="" id="galleryImage" class="img-responsive" />
        		<p>
        		    <br/>
        		    <button class="btn btn-primary btn-lg center-block" data-dismiss="modal" aria-hidden="true">Close <i class="ion-android-close"></i></button>
        		</p>
        	</div>
        </div>
        </div>
    </div>
	<!-- =================================================================================== FIM RODAPÉ =================================================================================== -->

</body>


</html>