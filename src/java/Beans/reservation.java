/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.sql.Date;

/**
 *
 * @author Hicham
 */
public class reservation {

    
    private int id;
    private int id_client;
    private int id_chambre;
    private Date dateD_reserv;
    private Date dateF_reserv;
   

    public reservation(int id_client, int id_chambre, Date dateD_reserv, Date dateF_reserv) {
        this.id_client = id_client;
        this.id_chambre = id_chambre;
        this.dateD_reserv = dateD_reserv;
        this.dateF_reserv = dateF_reserv;
    }

    public reservation() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    
    
    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getId_chambre() {
        return id_chambre;
    }

    public void setId_chambre(int id_chambre) {
        this.id_chambre = id_chambre;
    }

    public Date getDateD_reserv() {
        return dateD_reserv;
    }

    public void setDateD_reserv(Date dateD_reserv) {
        this.dateD_reserv = dateD_reserv;
    }

    public Date getDateF_reserv() {
        return dateF_reserv;
    }

    public void setDateF_reserv(Date dateF_reserv) {
        this.dateF_reserv = dateF_reserv;
    }

    
            
}
