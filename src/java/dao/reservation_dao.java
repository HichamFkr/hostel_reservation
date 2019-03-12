/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Beans.chambre;
import Beans.client;
import Beans.reservation;
import java.util.List;

/**
 *
 * @author Hicham
 */
public interface reservation_dao {
    
     public reservation ajouter (reservation r);
    public List<reservation> search (int id_client); //chercher les reservation d'un client
    public List<reservation> lister (); //lister les reservation
    public chambre getChambre (int id); //return une chambre
    public client getClient (int id);
    public reservation update (reservation r); //modifier une chambre
    public void delete (int id); 
    
    
}
