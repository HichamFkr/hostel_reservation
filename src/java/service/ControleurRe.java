/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import Beans.chambre;
import Beans.client;
import Beans.reservation;
import dao.reservation_dao_Impl;
import dao.chambre_dao_Impl;
import dao.client_dao_Impl;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hicham
 */
public class ControleurRe extends HttpServlet{
    
private  reservation_dao_Impl Re_metier;
private  chambre_dao_Impl Ch_metier;
private  client_dao_Impl Cl_metier;

    public  void init () throws ServletException{
            
        Re_metier = new reservation_dao_Impl();
        Ch_metier = new chambre_dao_Impl();
        Cl_metier = new client_dao_Impl();
        
    }
    
    
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        String path = request.getServletPath();
        
       // ***************   LISTER LES CLIENT ET LES CHAMBRE ******** 
        if(path.equals("/reservation/ListeClients.re") ){
            ClientModel ClModel = new ClientModel();
            List<client> clients = new ArrayList<client>();
            clients = Cl_metier.lister();
            ClModel.setClients(clients);
            request.setAttribute("ClModel", ClModel);
         
        
           ChambreModel model = new ChambreModel();
           List<chambre> chambres = new ArrayList<chambre>();
           chambres =  Ch_metier.lister();
           model.setChambres(chambres);     
           request.setAttribute("model", model);
           
           request.getRequestDispatcher("/reservation/AjouterReserv.jsp").forward(request,responce);
        }
        // ********* AJOUTER UNE RESERVATION ***************
        else if(path.equals("/reservation/saveReserv.re")){
              
           int id_client = Integer.parseInt(request.getParameter("selectClient"));
           int id_chambre = Integer.parseInt(request.getParameter("selectChambre"));
           String dated = request.getParameter("dated");
           String datef = request.getParameter("datef");
           Date dateD = Date.valueOf(dated);
           Date dateF = Date.valueOf(datef);
           
           reservation re = Re_metier.ajouter(new reservation( id_client, id_chambre, dateD, dateF));
           client cl = Re_metier.getClient(id_client); // récupérer l'entité  client par son id
           chambre ch = Re_metier.getChambre(id_chambre); 
           
           String nomClient = cl.getNom();
           String prenomClient = cl.getPrenom();
           int numChambre = ch.getNum();
           
           
                   
           ReservModel reM = new ReservModel();
           reM.setNomClient(nomClient);
           reM.setPrenomClient(prenomClient);
           reM.setNumChambre(numChambre);
           reM.setDateD(dateD);
           reM.setDateF(dateF);
           request.setAttribute("reM", reM);
           request.getRequestDispatcher("/reservation/ConfirmationRe.jsp").forward(request, responce);
           
           
        }
        
        //********** LISTER LES RESERVATION ***********
        else if(path.equals("/reservation/ListReserv.re")){
            ReservModel reM = new ReservModel();
            List<reservation> reservations = new ArrayList<reservation>();
            reservations = Re_metier.lister();
            
                      
            for(reservation re:reservations){
               client cl = Re_metier.getClient(re.getId_client()); // récupérer l'entité  client par son id
               chambre ch = Re_metier.getChambre(re.getId_chambre());
               String nomClient = cl.getNom();
           String prenomClient = cl.getPrenom();
           int numChambre = ch.getNum();
            
            reM.setReservations(reservations);
            reM.setNomClient(nomClient);
            reM.setPrenomClient(prenomClient);
            reM.setNumChambre(numChambre);
            request.setAttribute("reM", reM);
            request.getRequestDispatcher("/reservation/listeReserv.jsp").forward(request,responce);
           }
        
           
     
           
        
        }
    }
    
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
    
       doGet(request, responce);
    }


}
