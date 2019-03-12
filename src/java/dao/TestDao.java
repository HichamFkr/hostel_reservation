/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Beans.chambre;
import Beans.client;
import Beans.reservation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Hicham
 */ 
public class TestDao  {
    
    public static void main(String[] args) {
    /*    chambre_dao_Impl dao = new chambre_dao_Impl();
          chambre c1 = new chambre( 10, 2, 1, 155, true, 10);
        chambre c2 = new chambre( 11, 1, 4, 133, true, 5);
        dao.ajouter(c1);
        dao.ajouter(c2); 
       // System.out.println(c1.toString());
        //System.out.println(c2.toString());*/
        
        
     /*  client_dao_Impl cdao = new client_dao_Impl();
      // client cl1 = new client("Sarah","Djebali","Bir khadem","DZ","0659784244","x130268");
       client cl2 = new client("islem","fekhar","Alger","DZ","0550153436","x140266");
       cl2.setId(12);
       cdao.update(cl2);
       System.out.print("client"+cdao.getClient(cl2.getId()).toString());
       
       /* List<client> clients = new ArrayList<client>();
       // cdao.ajouter(cl1);
       //cdao.ajouter(cl2);
        clients = cdao.lister();
        for (client c:clients){
            System.out.println(" "+c);
        }
        
        
       /*   chambre_dao_Impl chdao = new chambre_dao_Impl();
        List<chambre> chambres = new ArrayList<chambre>();
        //cdao.ajouter(cl1);
       //cdao.ajouter(cl2);
        chambres = chdao.lister();
        for (chambre c:chambres){
            System.out.println(" "+c);
        }
        chdao.delete(13);*/
       /*  client c = new client();
        c = cdao.search("x140266");
        System.out.println("nom "+c.getNom());
       // System.out.println("lool "+cl2.toString());
        //System.out.println("lool "+c3.toString()); */
      
        
        
       Date datee = new Date(Calendar.getInstance().getTime().getTime());
        System.out.println("DATE : "+datee);
        reservation r = new reservation(15,15,datee, Date.valueOf("2018-04-25"));
        reservation_dao_Impl daor = new reservation_dao_Impl();
        r = daor.ajouter(r);
        System.out.println("client "+r.getId_client());
    }
}
