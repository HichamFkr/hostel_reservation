/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Beans.reservation;
import java.util.List;

/**
 *
 * @author Hicham
 */
public interface hotel_dao {
    
    public reservation ajouter (reservation c,int id_client,int id_chambre);
    public List<reservation> search (int id_client); //chercher les reservation d'un client
    public List<reservation> lister (); //lister les reservation
    public reservation getChambre (int id); //return une chambre
    public reservation update (reservation r); //modifier une chambre
    public reservation delete (int id); 
    
    
}
