<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Ajouter une reservation</title>
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
                        <a href="index.jsp" ><i class="fa fa-desktop "></i>Dashboard </a>
                    </li>
                   

                    <li>
                        <a href="clients.jsp"><i class="fa fa-user"></i>Clients  </a>
                    </li>
                    <li>
                        <a href="chambres.jsp"><i class="fa fa-home "></i>Chambres</a>
                    </li>
                    <li>
                        <a href="reservation.jsp"><i class="fa fa-check-square "></i>Reservations</a>
                    </li> 

                </ul>
                            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <h2>Gestion des reservations </h2>   
                    </div>
                </div>              
                 <!-- /. ROW  -->
                  <hr />
                <div class="container col-md-8 col-md-offset-2">
      <div class="row main">
        <div class="main-login main-center">
        
          <form class="" method="post" action="saveReserv.do">
            
            <div class="form-group">
              <label for="name" class="cols-sm-2 control-label">Nom du Client</label>
              <div class="cols-sm-10">
                <div class="input-group">
                  <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                  <input type="text" class="form-control" name="NomClient"  placeholder="Entrer le Nom du client"/>
                </div>
              </div>
            </div>

            <div class="form-group">
              <label for="email" class="cols-sm-2 control-label">Numero de la chambre</label>
              <div class="cols-sm-10">
                <div class="input-group">
                  <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                  <input type="text" class="form-control" name="NumChambre"   placeholder="Entrer le numéro de la chambre"/>
                </div>
              </div>
            </div>

            <div class="form-group">
              <label for="email" class="cols-sm-2 control-label">Date début de reservation</label>
              <div class="cols-sm-10">
                <div class="input-group">
                  <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                  <input type="text" class="form-control" name="datedReserv" id="email"  placeholder="Entrer début de reservation"/>
                </div>
              </div>
            </div>

            
            <div class="form-group">
              <label for="email" class="cols-sm-2 control-label">Date début de reservation</label>
              <div class="cols-sm-10">
                <div class="input-group">
                  <span class="input-group-addon"><i class="fa fa-home" aria-hidden="true"></i></span>
                  <input type="text" class="form-control" name="datefReserv"   placeholder="Entrer fin de reservation"/>
                </div>
              </div>
            </div>
              
              <div class="form-group">
              <label for="email" class="cols-sm-2 control-label">Sélectionner le client</label>
              <div class="cols-sm-10">
                <div class="input-group">
                    
                       <select name="selectClient">
                           <option>---</option>
                            <c:forEach items="${ClModel.clients}" var="c">
                                
                                <option>${c.nom} ${c.prenom}</option>

                             </c:forEach>
                        </select>
                    
                </div>
              </div>
            </div>
              
               <div class="form-group">
              <label for="email" class="cols-sm-2 control-label">Sélectionner la chambre</label>
              <div class="cols-sm-10">
                <div class="input-group">
                    
                       
                        <select class="custom-select">
                            <option>---</option>
                            <c:forEach items="${model.chambres}" var="ch">
                                
                                <option>${ch.num} ${ch.prix}</option>

                             </c:forEach>
                        </select>
                    
                </div>
              </div>
            </div>
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
