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
                     <h2>Ajouter une réservation </h2>   
                    </div>
                </div>              
                 <!-- /. ROW  -->
                  <hr />
                <div class="container col-md-8 col-md-offset-2">
      <div class="row main">
        <div class="main-login main-center">
        
          <form class="" method="post" action="saveReserv.re">
            
            <div class="form-group">
              <label for="email" class="cols-sm-2 control-label">Sélectionner le client</label>
              <div class="cols-sm-10">
                    
                       <select name="selectClient" class="form-control">
                           <option>---</option>
                            <c:forEach items="${ClModel.clients}" var="c">
                                
                                <option value="${c.id}">${c.nom} ${c.prenom}</option>

                             </c:forEach>
                        </select>
                    
           
              </div>
            </div>
              
              <div class="form-group">
              <label for="email" class="cols-sm-2 control-label">Sélectionner la chambre</label>
              <div class="cols-sm-10">
                    
                       <select name="selectChambre" class="form-control">
                           <option>---</option>
                            <c:forEach items="${model.chambres}" var="c">
                                
                                <option value="${c.id}">${c.num} </option>

                             </c:forEach>
                        </select>
                    
           
              </div>
            </div>

            
        
        
        
            <div class="form-group">
              <label for="date" name="date"class="cols-sm-2 control-label">Date début de reservation</label>
              <div class="cols-sm-10">
                <div class="input-group">
                 <div class="input-group-addon">
                  <i class="fa fa-calendar">
                  </i>
                 </div>
                 <input class="form-control" id="dated" name="dated" type="date"/>
                </div>
              </div>
            </div>
            
             <div class="form-group">
              <label for="date" name="date"class="cols-sm-2 control-label">Date fin de reservation</label>
              <div class="cols-sm-10">
                <div class="input-group">
                 <div class="input-group-addon">
                  <i class="fa fa-calendar">
                  </i>
                 </div>
                 <input class="form-control" id="datef" name="datef" type="date"/>
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
