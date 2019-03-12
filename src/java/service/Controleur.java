/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Beans.chambre;
import Beans.client;
import Beans.reservation;
import dao.chambre_dao_Impl;
import dao.client_dao_Impl;
import dao.reservation_dao_Impl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hicham
 */
public class Controleur  extends HttpServlet{
    private chambre_dao_Impl metier;
    private client_dao_Impl C_metier;
    private  reservation_dao_Impl R_metier;
    
    
    @Override
    public  void init () throws ServletException{
        metier = new chambre_dao_Impl();
        C_metier = new client_dao_Impl(); 
        R_metier = new reservation_dao_Impl();
        
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        PrintWriter out = responce.getWriter();
        String path = request.getServletPath();
        int etage = 0;
        
        
        if (path.equals("/index.do")){
                request.getRequestDispatcher("login.jsp").forward(request,responce);
        }
        // ************************** MARCHE BIEN ******************
        else if(path.equals("/search.do")){
           /* String etageS = request.getParameter("etage");
            etage = Integer.parseInt(etageS);
            model.setEtage(etage);
            */
           
           
           
          /* ChambreModel model = new ChambreModel();
           List<chambre> chambres = metier.search(etage);
           model.setChambres(chambres);
           
           request.setAttribute("model", model);
           request.getRequestDispatcher("ListChambres.jsp").forward(request,responce);*/
        }
        
        
        
        
       
        
        
        // *********************** AJOUTER UNE CHAMBRE ***************
        else if(path.equals("/chambre/saveChambre.do") && request.getMethod().equalsIgnoreCase("post")){
            
            int num = Integer.parseInt(request.getParameter("num"));
            int numEtage = Integer.parseInt(request.getParameter("etage"));
            int numLit = Integer.parseInt(request.getParameter("numLit"));
            double prix = Double.parseDouble(request.getParameter("prix"));
            boolean disp = Boolean.parseBoolean(request.getParameter("disp"));
            int duree = Integer.parseInt(request.getParameter("duree"));
            
            chambre chambre = metier.ajouter(new chambre(num, numEtage, numLit, prix, duree));
            request.setAttribute("chambre", chambre);
            request.getRequestDispatcher("confirmationChambre.jsp").forward(request,responce);
        }
        
        
        
        //*************** LISTE DES CHAMBRES ***************
        else if(path.equals("/chambre/ListeChambres.do")){
        
           ChambreModel model = new ChambreModel();
           List<chambre> chambres = new ArrayList<chambre>();
           chambres =  metier.lister();
           model.setChambres(chambres);
           
           request.setAttribute("model", model);
           request.getRequestDispatcher("listeChambres.jsp").forward(request,responce);
        }
        
        // ****** SUPPRIMER UNE CHAMBRE *****
        else if(path.equals("/chambre/SuppChambre.do")){
            int id = Integer.parseInt(request.getParameter("id"));
            metier.delete(id);
            responce.sendRedirect("ListeChambres.do");
            
        }
        
        
        //*********************** EDITER UNE CHAMBRE ******
            //recupérer l'id d'une chambre et redériger vers la page de l'edition
          else if(path.equals("/chambre/EditChambre.do")){
            int id = Integer.parseInt(request.getParameter("id"));
            chambre chambre = metier.getChambre(id);
            request.setAttribute("chambre", chambre);
            request.getRequestDispatcher("EditChambre.jsp").forward(request,responce);
        }
          //percister les donnée sur la BDD
          else if(path.equals("/chambre/UpdateChambre.do") && request.getMethod().equalsIgnoreCase("post")){
           
            int id = Integer.parseInt(request.getParameter("id"));
            int num = Integer.parseInt(request.getParameter("num"));
            int numEtage = Integer.parseInt(request.getParameter("etage"));
            int numLit = Integer.parseInt(request.getParameter("numLit"));
            double prix = Double.parseDouble(request.getParameter("prix"));
            int duree = Integer.parseInt(request.getParameter("duree"));
            
            
            chambre chambre = new chambre(num, numEtage, numLit, prix, duree);
            chambre.setId(id);
            chambre = metier.update(chambre);
            request.setAttribute("chambre", chambre);
            request.getRequestDispatcher("confModCh.jsp").forward(request,responce);
        }   
          
           
           // ************* AJOUTER UNE RESERVATION *****
           else if(path.equals("/login/bs-simple-admin/saveReserv.do")){
            //récuperer les clients
            ClientModel ClModel = new ClientModel();
            List<client> clients = new ArrayList<client>();
            clients = C_metier.lister();
            ClModel.setClients(clients);
            request.setAttribute("ClModel", ClModel);
            
            
            //récuperer le chambres
           ChambreModel model = new ChambreModel();
           List<chambre> chambres = new ArrayList<chambre>();
           chambres =  metier.lister();
           model.setChambres(chambres);
           
           request.setAttribute("model", model);
           request.getRequestDispatcher("/login/bs-simple-admin/AjouterReserv.jsp").forward(request,responce);
               
               
          /*  String nom = request.getParameter("NomClient");
            String num = request.getParameter("NumChambre");
            Date dateD_reserv = Date.parse(request.getParameter("datedReserv")) ;
            Date dateF_reserv = Date.parse(request.getParameter("datefReserv"));
           
            
            //client client = C_metier.ajouter(new client( nom, prenom, adresse, nationalite, tel, idCard));
            reservation r = new r(dateD_reserv,dateF_reserv);
           
            c.getId();
           r = R_metier.ajouter(r, 1, 1);
            request.setAttribute("client", client);
            request.getRequestDispatcher("confirmation.jsp").forward(request,responce);*/
        }
        else {
            responce.sendError(responce.SC_NOT_FOUND);
        }
            
        }
        
        
        
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
    
       doGet(request, responce);
        
            
           // client c = C_metier.search("x130268");
            
            //ClModel.setClient(c);
           // out.print("client :"+clients.get(0).getNom());
          // String name = clients.get(0).getNom(); 
            
            
    }
          
        
        
        
    }
    
   
    

