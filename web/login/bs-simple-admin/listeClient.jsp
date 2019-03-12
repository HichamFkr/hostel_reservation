<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Liste clients</title>
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
                     <h2>Liste des Clients </h2>   
                    </div>
                </div>              
                 <!-- /. ROW  -->
                  <hr />
  
               <div class="container col-md-10 col-md-offset-1">
            <table class="table">
             
             
                <thead>
                  <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nom</th>
                    <th scope="col">Prenom</th>
                    <th scope="col">Adresse</th>
                    <th scope="col">Nationalite</th>
                    <th scope="col">Telephone</th>
                    <th scope="col">ID Card</th>
                    <th scope="col">Action</th>
                  </tr>
                </thead>
               <tbody>
                    <c:forEach items="${ClModel.clients}" var="c">
                        <tr>
                                <th scope="row"> ${c.id} </th>
                                <td> ${c.nom} </td>
                                <td> ${c.prenom} </td>
                                <td> ${c.adresse} </td>
                                <td> ${c.nationalite} </td>
                                <td> ${c.tel} </td>
                                <td> ${c.idCard} </td>
                                <td> <a href="EditClient.do?id=${c.id}" ><i class="fa fa-edit "></i> 
                                 Editer</td> </a>
                           <td> <a onclick="return confirm('Etes vous sure ?')" href="SuppClient.do?id=${c.id}" ><i class="fa fa-trash-o "></i> 
                                 Supprimer</td> </a>
                            </tr>
                            </tr>
                    </c:forEach>
                     
                </tbody> 
                        
                    </table>   
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

</body>
</html>