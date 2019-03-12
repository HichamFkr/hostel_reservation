
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Modifier un Client</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
     
           
          
    <div id="wrapper">
         <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="adjust-nav">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">
                        <img src="assets/img/logo.png" />
                    </a>
                </div>
              
                 <span class="logout-spn" >
                  <a href="#" style="color:#fff;">LOGOUT</a>  

                </span>
            </div>
        </div>
        <!-- /. NAV TOP  -->
         <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                 


                    <li class="active-link">
                        <a href="../index/index.jsp" ><i class="fa fa-desktop "></i>Dashboard </a>
                    </li>
                   

                    <li>
                        <a href="../client/clients.jsp"><i class="fa fa-user"></i>Clients  </a>
                    </li>
                    <li>
                        <a href="../chambre/chambres.jsp"><i class="fa fa-home "></i>Chambres</a>
                    </li>
                    <li>
                        <a href="../reservation/reservation.jsp"><i class="fa fa-check-square "></i>Reservations</a>
                    </li>

                </ul>
                            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <h2>Modifier un client</h2>   
                    </div>
                </div>              
                 <!-- /. ROW  -->
                  <hr />
            		<div class="container col-md-8 col-md-offset-2">
			<div class="row main">
				<div class="main-login main-center">
				
					<form class="" method="post" action="UpdateClient.cl">
						
						
                                                <div class="form-group row">
                                                            <label  class="col-sm-1 col-form-label">ID</label>
                                                            <div class="col-sm-10">
                                                             <input type="hidden" class="form-control" value="${client.id}" name="id" /> ${client.id}
                                                            </div>
                                                </div>
                                           
						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Nom</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="nom" value="${client.nom}" id="email" required="required" placeholder="Entrer le nom du client"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Prenom</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                                        <input type="text" class="form-control" name="prenom" value="${client.prenom}" id="email" required="required" placeholder="Entrer le prenom du client"/>
								</div>
							</div>
						</div>


						
						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Addresse</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-home" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="adresse" id="email" value="${client.adresse}" required="required" placeholder="Entrer l'addresse du client"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Nationalité</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-flag" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="nationalite" id="email" value="${client.nationalite}" required="required" placeholder="Entrer la nationalite du client"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Téléphone</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-phone" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="tel" id="email" value="${client.tel}" required="required" placeholder="Entrer le numero de telephone du client"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Numero de la Carte ID</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="idCard" id="email" value="${client.idCard}" required="required" placeholder="Entrer le numero de la carte ID du client"/>
								</div>
							</div>
						</div>

						

						<div class="form-group ">
							<button type="submit" class="btn btn-primary btn-lg btn-block login-button">
							Enregistrer
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>

                 <!-- /. ROW  -->           
    </div>
             <!-- /. PAGE INNER  -->
             
            </div>
         <!-- /. PAGE WRAPPER  -->
        </div>
    <div class="footer">
      
    
             <div class="row">
                <div class="col-lg-12" >
                    &copy;  Fekhar Hicham | Technologie de l'Information 2018
                </div>
        </div>
        </div>
          

     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
   
</body>
</html>
