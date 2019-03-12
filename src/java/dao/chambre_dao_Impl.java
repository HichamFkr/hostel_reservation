/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Beans.chambre;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
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
public class chambre_dao_Impl implements chambre_dao {

    @Override
    public chambre ajouter(chambre c) {
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("INSERT INTO `chambre`(num, etage, numLit, prix, disponible, duree) VALUES (?,?,?,?,?,?)");
            
            
            ps.setInt(1,c.getNum());
            ps.setInt(2, c.getEtage());
            ps.setInt(3, c.getNumLit());
            ps.setDouble(4, c.getPrix());
            ps.setBoolean(5, true);
            ps.setInt(6, c.getDuree());
            
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(chambre_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;   
    }

    @Override
    public List<chambre> search(int etage) {
        
        List<chambre> chambres = new ArrayList<chambre>();
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("SELECT * FROM CHAMBRE WHERE etage LIKE ? ");
            
            ps.setInt(1, etage);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                chambre c = new chambre();
                c.setId(rs.getInt("ID"));
                c.setNum(rs.getInt("NUM"));
                c.setEtage(rs.getInt("ETAGE"));
                c.setNumLit(rs.getInt("NUMLIT"));
                c.setPrix(rs.getDouble("PRIX"));
                c.setDisponible(rs.getBoolean("DISPONIBLE"));
                c.setDuree(rs.getInt("DUREE"));
                
                chambres.add(c);
                
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(chambre_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chambres;
    }

    
     @Override
    public List<chambre> lister() {
        
        List<chambre> chambres = new ArrayList<chambre>();
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("SELECT * FROM chambre ");
            
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                chambre c = new chambre();
                c.setId(rs.getInt("ID"));
                c.setNum(rs.getInt("NUM"));
                c.setEtage(rs.getInt("ETAGE"));
                c.setNumLit(rs.getInt("NUMLIT"));
                c.setPrix(rs.getDouble("PRIX"));
                c.setDisponible(rs.getBoolean("DISPONIBLE"));
                c.setDuree(rs.getInt("DUREE"));
                
                chambres.add(c);
                
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(chambre_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chambres;
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

    @Override
    public chambre update(chambre c) {
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("UPDATE `chambre` SET num = ?, etage = ?, numLit = ?, prix = ?, disponible = ?, duree = ? WHERE id = ?");
            
            
            ps.setInt(1,c.getNum());
            ps.setInt(2, c.getEtage());
            ps.setInt(3, c.getNumLit());
            ps.setDouble(4, c.getPrix());
            ps.setBoolean(5, true);
            ps.setInt(6, c.getDuree());
            ps.setInt(7, c.getId());
            
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(chambre_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }

    @Override
    public void delete(int id) {
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("DELETE FROM `chambre` WHERE ID = ?");
            
            
            ps.setInt(1,id);          
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(chambre_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
    }

   
    
}
