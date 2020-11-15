<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>TIW Vinted</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="eCommerce HTML Template Free Download" name="keywords">
<meta content="eCommerce HTML Template Free Download" name="description">

<!-- Favicon -->
<link href="img/favicon.ico" rel="icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400|Source+Code+Pro:700,900&display=swap"
	rel="stylesheet">

<!-- CSS Libraries -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link href="lib/slick/slick.css" rel="stylesheet">
<link href="lib/slick/slick-theme.css" rel="stylesheet">

<!-- Template Stylesheet -->
<link href="css/style.css" rel="stylesheet">
</head>

<body>
	<!-- Top bar Start -->
	<div class="top-bar">
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-6">
					<i class="fa fa-envelope"></i> xxxx@tiwvinted.com
				</div>
				<div class="col-sm-6">
					<i class="fa fa-phone-alt"></i> +xxx xxx xxxx
				</div>
			</div>
		</div>
	</div>
	<!-- Top bar End -->

	<!-- Nav Bar Start -->
	<div class="nav">
		<div class="container-fluid">
			<nav class="navbar navbar-expand-md bg-dark navbar-dark">
				<a href="#" class="navbar-brand">MENU</a>
				<button type="button" class="navbar-toggler" data-toggle="collapse"
					data-target="#navbarCollapse">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse justify-content-between"
					id="navbarCollapse">
					<div class="navbar-nav mr-auto">
						<a href="index.jsp" class="nav-item nav-link">Home</a> 
						<a href="productos.jsp" class="nav-item nav-link">Productos</a>
						<a href="mensajes.jsp" class="nav-item nav-link">Mensajes</a>
					</div>
					
				</div>
			</nav>
		</div>
	</div>
	<!-- Nav Bar End -->

	<!-- Bottom Bar Start -->
	<div class="bottom-bar">
		<div class="container-fluid">
			<div class="row align-items-center">
				<div class="col-md-3">
					<div class="logo">
						<a href="index.jsp"> <img src="img/logo.png" alt="Logo">
						</a>
					</div>
				</div>

			</div>
		</div>
	</div>
	<!-- Bottom Bar End -->

	<!-- Breadcrumb Start -->
	<div class="breadcrumb-wrap">
		<div class="container-fluid">
			<ul class="breadcrumb">
				<li class="breadcrumb-item"><a href="#">Administrador</a></li>
				<li class="breadcrumb-item active"><a href="usuarios.jsp">Usuarios</a></li>

			</ul>
		</div>
	</div>
	<!-- Breadcrumb End -->

	<!-- My Account Start -->
	<div class="my-account">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-9 text-center">
					<h3>Usuarios</h3>
					<p>Estos son los usuarios registrados.</p>
				</div>
				<div class="row row-bottom-padded-md">
					<%@ page import="model.User"%>
					<%@ page import="java.util.List"%>
					<%
						@SuppressWarnings("unchecked")
								List<User> list = (List<User>) request.getAttribute("listaUsuarios");
								for (User usuario : list) {
					%>
					<div class="col-md-4 col-sm-6 fh5co-tours animate-box"
						data-animate-effect="fadeIn">
						<div href="#">
							<img src="images/place-1.jpg"
								alt="Free HTML5 Website Template by FreeHTML5.co"
								class="img-responsive">
							<div class="desc">
								<span></span>
								<h3><%=usuario.getNombre()%></h3>
								<span><%=usuario.getEmail()%></span> <a id="Cambios"
									class="btn btn-primary btn-outline" href="#">Mas Info <i
									class="icon-arrow-right22"></i></a> <a
									class="btn btn-primary btn-outline" href="#">Eliminar <i
									class="icon-arrow-right22"></i></a>


							</div>
						</div>
					</div>
					<%
						}
					%>





				</div>
			</div>
		</div>
	</div>
	
	 <!-- Change Modal -->
        <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
          <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">

              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
                <h1 class="h3 mb-3 font-weight-normal">Modificar usuario</h1>
              </div>
              <div class="modal-body">
                  <form class="form-signin">
              <div class="col-xxs-12 col-xs-12 mt">
		
				<div class="row">
					<div class="col-md-12 animate-box">
						<h2 class="heading-title">Nombre Usuario</h2>
					</div>
					<div class="col-md-6 animate-box">
                        <span class="description">
						<p>DescripciÃ³n del Usuario</p> 
                        </span>
                        <table class="table">
                            <tbody>
                                <tr>                                
                                    <th scope="row">Username:</th>
                                    <td><span class="host"><input type="text" name = "user" ></span></td>
                                </tr>
                                
                                <tr>                                
                                        <th scope="row">E-mail:</th>
                                    <td><span class="price"><input type="email" name = "mail" ></span></td>
                                </tr>
                                <tr>
                                        <th scope="row">ValoraciÃ³n</th>
                                        <td><span class="beds"><input type="text" name = "valoracion" ></span></td>
                                </tr>                               
                            </tbody>
                        </table>
                        <div class="col-xxs-12 col-xs-6 mt">
                            <input type="book" class="btn btn-primary btn-block" value="Guardar">
                        </div>
                        <div class="col-xxs-12 col-xs-6 mt">
                            <input type="contact" class="btn btn-primary btn-block" value="Eliminar">
                        </div>
                                                                        
                    </div>
					
				</div>
			</div>
            </form>

              </div>

              <div class="modal-footer">
                <p class="text-center"><a href="usuarios.jsp"> Atras </a></p>
              </div>

            </div>
          </div>
        </div>
	<!-- My Account End -->

	<!-- Footer Start -->
	<div class="footer">
		<div class="container-fluid">
			<div class="row"></div>
		</div>
	</div>
	<!-- Footer End -->

	<!-- Footer Bottom Start -->
	<div class="footer-bottom">
		<div class="container">
			<div class="row">
				<div class="col-md-6 copyright">
					<p>
						Copyright &copy; <a href="https://htmlcodex.com">HTML Codex</a>.
						All Rights Reserved
					</p>
				</div>

				<div class="col-md-6 template-by">
					<p>
						Template By <a href="https://htmlcodex.com">HTML Codex</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	<!-- Footer Bottom End -->

	<!-- Back to Top -->
	<a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

	<!-- JavaScript Libraries -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
	<script src="lib/easing/easing.min.js"></script>
	<script src="lib/slick/slick.min.js"></script>

	<!-- Template Javascript -->
	<script src="js/main.js"></script>
</body>
</html>
