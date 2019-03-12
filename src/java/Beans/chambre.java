/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;

/**
 *
 * @author Hicham
 */
public class chambre implements Serializable{ 

    @Override
    public String toString() {
        return "chambre{" + "id=" + id + ", num=" + num + ", etage=" + etage + ", numLit=" + numLit + ", prix=" + prix + ", disponible=" + disponible + ", duree=" + duree + '}';
    }

    public chambre() {
        super();
    }
    
    

    public chambre(int num, int etage, int numLit, double prix,  int duree) {
        
        this.num = num;
        this.etage = etage;
        this.numLit = numLit;
        this.prix = prix;
        this.duree = duree;
    }
    private int id;
    private int num;
    private int etage;
    private int numLit;
    private double prix;
    private boolean disponible;
    private int duree;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public int getNumLit() {
        return numLit;
    }

    public void setNumLit(int numLit) {
        this.numLit = numLit;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    
    
    
    
}
