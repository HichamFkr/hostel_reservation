/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Beans.chambre;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hicham
 */
public class ChambreModel {
    private int etage;
    private List<chambre> chambres = new ArrayList<chambre>();

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public List<chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<chambre> chambres) {
        this.chambres = chambres;
    }
    
}
