/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Beans.chambre;
import java.util.List;

/**
 *
 * @author Hicham
 */
public interface chambre_dao {
    
    public chambre ajouter (chambre c);
    public List<chambre> search (int num); //chercher les chambre dans un etage
    public List<chambre> lister (); //lister les chambre
    public chambre getChambre (int id); //return une chambre
    public chambre update (chambre c); //modifier une chambre
    public void delete (int id); 
    
}
