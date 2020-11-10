<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>TIW Vinted</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Rokkitt:100,300,400,700"
	rel="stylesheet">

<!-- Animate.css -->
<link rel="stylesheet" href="css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="css/icomoon.css">
<!-- Ion Icon Fonts-->
<link rel="stylesheet" href="css/ionicons.min.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- Magnific Popup -->
<link rel="stylesheet" href="css/magnific-popup.css">

<!-- Flexslider  -->
<link rel="stylesheet" href="css/flexslider.css">

<!-- Owl Carousel -->
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">

<!-- Date Picker -->
<link rel="stylesheet" href="css/bootstrap-datepicker.css">
<!-- Flaticons  -->
<link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">

<!-- Theme style  -->
<link rel="stylesheet" href="css/style.css">

</head>

</head>
<body>

	<div class="colorlib-loader"></div>

	<div id="page">
		<header>
			<nav class="colorlib-nav" role="navigation">
				<div class="top-menu">
					<div class="container">
						<div class="row">
							<div class="col-sm-7 col-md-9">
								<div id="colorlib-logo">
									<a href="admin.jsp">TIW Vinted</a>
								</div>
							</div>

						</div>

						<div class="row">
							<div class="col-sm-12 text-left menu-1">
								<ul>

									<li class="active"><a href="admin.jsp">Admin Page</a></li>
									<li><a href="usuarios.jsp">Usuario</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</nav>
		</header>

		<!-- End Header -->


		<div class="colorlib-intro">
			<div class="container">
				<div class="container">
					<div class="row">
						<h2>Administrador</h2>
					</div>
					<form method="post" action="login">
						<div class="row">
							<input type="text" class="datos" name="admin_mail"
								placeholder="nombre@TIWbnb.com" required>
						</div>
						<div class="row">
							<input type="password" class="datos" name="admin_pass"
								placeholder="Password*" required>
						</div>
						<div class="separator"></div>
						<div class="row">
							<input type="submit" value="Iniciar Sesión">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- Login Modal -->
	<div class="modal fade" id="loginModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h1 class="h3 mb-3 font-weight-normal">Iniciar sesión para
						continuar</h1>
				</div>
				<div class="modal-body">
					<form class="form-signin" action="Controller">
						<input type="email" id="loginEmail" class="form-control"
							placeholder="DirecciÃ³n de correo electrÃ³nico" required
							autofocus> <input type="password" id="loginPassword"
							class="form-control" placeholder="ContraseÃ±a" required>
						<div class="checkbox mb-3">
							<label> <input type="checkbox" value="remember-me">
								Recordarme
							</label>
						</div>
						<button class="btn btn-lg btn-primary btn-block" type="submit"
							id="IniciaSesion">Inicia sesión</button>
					</form>

				</div>

				<div class="modal-footer">
					<p class="text-center">
						¿Aún no tienes cuenta?<a href="index.jsp"> Registrate</a>
					</p>
					<p class="text-center">
						<a href="index.jsp"> Atrás </a>
					</p>
				</div>

			</div>
		</div>
	</div>


	<!-- Registro Modal -->
	<div class="modal fade" id="RegistroModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h1 class="h3 mb-3 font-weight-normal">Introduce tus datos</h1>
				</div>
				<div class="modal-body">
					<form class="form-registro">
						<input type="email" id="inputEmail" class="form-control"
							placeholder="DirecciÃ³n de correo electrÃ³nico" required
							autofocus> <input type="name" id="inputName"
							class="form-control" placeholder="Nombre" required> <input
							type="surname" id="inputSurname" class="form-control"
							placeholder="Apellidos" required> <input type="password"
							id="inputPassword" class="form-control"
							placeholder="Establece una contraseÃ±a" required>
						<button class="btn btn-lg btn-primary btn-block" type="submit"
							id="Registrate">Registrate</button>
					</form>

				</div>

				<div class="modal-footer">
					<p class="text-center">
						Â¿Ya tienes una cuenta TIWbnb?<a href="#" id="goRegistroLogin">
							Inicia sesiÃ³n</a>
					</p>
				</div>

			</div>
		</div>
	</div>


















	<footer id="colorlib-footer" role="contentinfo">
		<div class="container">
			<div class="row row-pb-md">
				<div class="col footer-col colorlib-widget">
					<h4>About TIWVinted</h4>
					<p>lorem impsum</p>

					<ul class="colorlib-social-icons">
						<li><a href="#"><i class="icon-twitter"></i></a></li>
						<li><a href="#"><i class="icon-facebook"></i></a></li>
						<li><a href="#"><i class="icon-linkedin"></i></a></li>
						<li><a href="#"><i class="icon-dribbble"></i></a></li>
					</ul>

				</div>
				<div class="col footer-col colorlib-widget">
					<h4>XXXXXX</h4>


					<ul class="colorlib-footer-links">
						<li><a href="#">XXXXXX</a></li>
						<li><a href="#">XXXXXX/XXXXXX</a></li>
						<li><a href="#">XXXXXX XXXXXX</a></li>
						<li><a href="#">XXXXXX</a></li>
						<li><a href="#">XXXXXX</a></li>
						<li><a href="#">XXXXXX XXXXXX</a></li>
						<li><a href="#">XXXXXX XXXXXX</a></li>
					</ul>

				</div>
				<div class="col footer-col colorlib-widget">
					<h4>XXXXXX</h4>


					<ul class="colorlib-footer-links">
						<li><a href="#">XXXXXX</a></li>
						<li><a href="#">XXXXXX XXXXXX</a></li>
						<li><a href="#">XXXXXX</a></li>
						<li><a href="#">XXXXXX</a></li>
						<li><a href="#">XXXXXX</a></li>
					</ul>

				</div>



				<div class="col footer-col">
					<h4>Contact Information</h4>
					<ul class="colorlib-footer-links">
						<li>lorem impsum, <br> XXXXXX
						</li>
						<li><a href="tel://1234567920">+ XXXXXX</a></li>
						<li><a href="mailto:info@yoursite.com">info@XXXXX.com</a></li>
						<li><a href="#">XXXX</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="copy">
			<div class="row">
				<div class="col-sm-12 text-center">
					<p>
						<span> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							Copyright &copy;<script>
								document.write(new Date().getFullYear());
							</script> All rights reserved | This template is made with <i
							class="icon-heart" aria-hidden="true"></i> by <a
							href="https://colorlib.com" target="_blank">Colorlib</a> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></span>
						<span class="block">Demo Images: <a
							href="http://unsplash.co/" target="_blank">Unsplash</a> , <a
							href="http://pexels.com/" target="_blank">Pexels.com</a></span>
					</p>
				</div>
			</div>
		</div>
	</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="ion-ios-arrow-up"></i></a>
	</div>

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- popper -->
	<script src="js/popper.min.js"></script>
	<!-- bootstrap 4.1 -->
	<script src="js/bootstrap.min.js"></script>
	<!-- jQuery easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Flexslider -->
	<script src="js/jquery.flexslider-min.js"></script>
	<!-- Owl carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<!-- Date Picker -->
	<script src="js/bootstrap-datepicker.js"></script>
	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Main -->
	<script src="js/main.js"></script>

</body>
</html>



