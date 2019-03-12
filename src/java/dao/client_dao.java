/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Beans.client;
import java.util.List;

/**
 *
 * @author Hicham
 */
public interface client_dao {
    
    public client ajouter (client c);
    public client search (String idCard); //chercher un client par son carte id
    public List<client> lister();
    public client getClient (int id); //return un client
    public client update (client c); //modifier un client
    public void delete (int id); 
    
}
