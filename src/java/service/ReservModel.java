/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Beans.chambre;
import Beans.client;
import Beans.reservation;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hicham
 */
public class ReservModel {
   private String nomClient;
   private String prenomClient;
   private int numChambre;
   private Date dateD;
   private Date dateF;
   private reservation reservation;
   private List<reservation> reservations ;

    public reservation getReservation() {
        return reservation;
    }

    public void setReservation(reservation reservation) {
        this.reservation = reservation;
    }

    public List<reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<reservation> reservations) {
        this.reservations = reservations;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }
   

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public int getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }
   
   
}
