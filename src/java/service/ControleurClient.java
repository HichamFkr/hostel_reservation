 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Beans.chambre;
import Beans.client;
import Beans.reservation;
import dao.chambre_dao_Impl;
import dao.client_dao_Impl;
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
public class ControleurClient  extends HttpServlet{
   
    private client_dao_Impl C_metier;
    
    
    public  void init () throws ServletException{
        
        C_metier = new client_dao_Impl(); 
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        PrintWriter out = responce.getWriter();
        String path = request.getServletPath();
        

        // ********************** AJOUTER UN CLIENT ************************
        if(path.equals("/client/saveClient.cl") && request.getMethod().equalsIgnoreCase("post")){
            
            
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String adresse = request.getParameter("adresse");
            String nationalite = request.getParameter("nationalite");
            String tel = request.getParameter("tel");
            String idCard = request.getParameter("idCard");
            
            client client = C_metier.ajouter(new client( nom, prenom, adresse, nationalite, tel, idCard));
            request.setAttribute("client", client);
            request.getRequestDispatcher("/client/confirmation.jsp").forward(request,responce);
        }

        // ******************* LISTE DES CLIENT *****************
        else if(path.equals("/client/ListeClients.cl")){
            ClientModel ClModel = new ClientModel();
            List<client> clients = new ArrayList<client>();
            clients = C_metier.lister();
            ClModel.setClients(clients);
            request.setAttribute("ClModel", ClModel);
            request.getRequestDispatcher("/client/listeClient.jsp").forward(request,responce);
            request.getRequestDispatcher("/reservation/AjouterReserv.jsp").forward(request,responce);
                                          
            
            }


        //*********************** EDITER UN CLIENT ******
            //recupérer l'id d'un client     et redériger vers la page de l'edition
          else if(path.equals("/client/EditClient.cl")){
            int id = Integer.parseInt(request.getParameter("id"));
            client client = C_metier.getClient(id);
            request.setAttribute("client", client);
            request.getRequestDispatcher("/client/EditClient.jsp").forward(request,responce);
        }
          //percister les donnée sur la BDD
          else if(path.equals("/client/UpdateClient.cl") && request.getMethod().equalsIgnoreCase("post")){
           
            int id = Integer.parseInt(request.getParameter("id"));
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String adresse = request.getParameter("adresse");
            String nationalite = request.getParameter("nationalite");
            String tel = request.getParameter("tel");
            String idCard = request.getParameter("idCard");
            
            
            client client = new client(nom, prenom, adresse, nationalite, tel, idCard);
            client.setId(id);
            client = C_metier.update(client);
            request.setAttribute("client", client);
            request.getRequestDispatcher("confModCl.jsp").forward(request,responce);
          }


           // ****** SUPPRIMER UN CLIENT *****
        else if(path.equals("/client/SuppClient.cl")){
            int id = Integer.parseInt(request.getParameter("id"));
            C_metier.delete(id);
            responce.sendRedirect("ListeClients.cl");


}

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
    
       doGet(request, responce);
    }
}

