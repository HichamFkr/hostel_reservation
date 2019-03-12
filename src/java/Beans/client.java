/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author Hicham
 */
public class client {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String nationalite;
    private String tel;
    private String idCard;

  
    
    
    public client(String nom, String prenom, String adresse, String nationalite, String tel, String idCard) {
        
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.nationalite = nationalite;
        this.tel = tel;
        this.idCard = idCard;
        
    }

    public  client (){
        super();
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    private int id_num_card;

    public String getAdresse() {
        return adresse;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "client{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", nationalite=" + nationalite + ", tel=" + tel + ", idCard=" + idCard +'}';
    }

     
}
