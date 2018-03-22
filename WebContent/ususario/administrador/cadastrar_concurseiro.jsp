<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Vintage Concursos</title>

		<!--link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Open+Sans:600' type="text/css" rel="stylesheet" /-->
		<link rel="stylesheet" href="../../ressources/css/style.css" type="text/css" rel="stylesheet"/>
</head>

<body>
<body>
 
  <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Entrar</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Cadastre-se</label>
		<div class="login-form">
			
			<!-- ================================================== Cadastro ================================================== -->
			<div class="sign-up-htm">
				<div class="group">
					<label for="user" class="label">Nome do Usuário</label>
					<input id="user" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Senha</label>
					<input id="pass" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<label for="pass" class="label">Repita a senha</label>
					<input id="pass" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<label for="pass" class="label">Email</label>
					<input id="pass" type="text" class="input">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Cadastrar">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<label for="tab-1">Já é membro?</a>
				</div>
			</div>
			
			
			<!-- ================================================== Login ================================================== -->
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Nome do Usuário</label>
					<input id="user" required="" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Senha</label>
					<input id="pass" required="" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check" checked>
					<label for="check"><span class="icon"></span> Mantenha-me conectado</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Entrar">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#forgot">Esqueceu a senha?</a>
				</div>
			</div>
			
		
			
		</div>
	</div>
</div>
 
</body>
<!-- script src="js/index.js"></script-->
</body>

</html>