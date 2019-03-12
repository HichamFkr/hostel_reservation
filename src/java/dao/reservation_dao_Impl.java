/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Beans.chambre;
import Beans.client;
import Beans.reservation;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hicham
 */
public class reservation_dao_Impl implements reservation_dao {

    @Override
    public reservation ajouter(reservation r) {
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("INSERT INTO `reservation`(dateD_reserv, dateF_reserv, id_client, id_chambre) VALUES (?,?,?,?) " );
            PreparedStatement ps2 = (PreparedStatement) connection.prepareStatement
                ("UPDATE `chambre` SET disponible = FALSE  WHERE id = ?");
                       
            
            
            ps.setDate(1,  r.getDateD_reserv());
            ps.setDate(2,  r.getDateF_reserv());
            ps.setInt(3, r.getId_client());
            ps.setInt(4, r.getId_chambre());
            ps2.setInt(1, r.getId_chambre());
            
            
            ps.executeUpdate();
            ps2.executeUpdate();
        
        
        
    }   catch (SQLException ex) {
            Logger.getLogger(reservation_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
    return r;
    }

    
    
    @Override
    public List<reservation> search(int id_client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    public List<reservation> lister() {
        List res = new ArrayList<reservation>();
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("SELECT * FROM reservation");
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            reservation r = new reservation();
            r.setDateD_reserv(rs.getDate("dateD_reserv"));
            r.setDateF_reserv(rs.getDate("dateF_reserv"));
            r.setId_client(rs.getInt("id_client"));
            r.setId_chambre(rs.getInt("id_chambre"));
            
            res.add(r);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(reservation_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    return res;
    }

    
    
    @Override
    public chambre getChambre(int id) {
        chambre c = null;
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("SELECT * FROM CHAMBRE WHERE ID = ? ");
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                c = new chambre();
                c.setId(rs.getInt("ID"));
                c.setNum(rs.getInt("NUM"));
                c.setEtage(rs.getInt("ETAGE"));
                c.setNumLit(rs.getInt("NUMLIT"));
                c.setPrix(rs.getDouble("PRIX"));
                c.setDisponible(rs.getBoolean("DISPONIBLE"));
                c.setDuree(rs.getInt("DUREE"));
              
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(chambre_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    
    
    
    public client getClient(int id) {
        client c = null;
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("SELECT * FROM client WHERE ID = ? ");
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                c = new client();
                c.setId(rs.getInt("ID"));
                c.setNom(rs.getString("NOM"));
                c.setPrenom(rs.getString("PRENOM"));
                c.setAdresse(rs.getString("ADRESSE"));
                c.setNationalite(rs.getString("NATIONALITE"));
                c.setTel(rs.getString("TEL"));
                c.setIdCard(rs.getString("idCard"));
              
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(client_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    
    
    
    @Override
    public reservation update(reservation r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    @Override
    public void delete(int id) {
       
    Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("DELETE FROM `reservation` WHERE ID = ?");
              ps.setInt(1,id);          
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(reservation_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    }
    
}
