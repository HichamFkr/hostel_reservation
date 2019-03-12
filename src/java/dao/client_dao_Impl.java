/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Beans.client;
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
public class client_dao_Impl implements client_dao {

    @Override
    public client ajouter(client c) {
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("INSERT INTO `client`(id, nom, prenom, adresse, nationalite, tel, idCard) VALUES (?,?,?,?,?,?,?)");
            
            ps.setInt(1, c.getId());
            ps.setString(2,c.getNom());
            ps.setString(3, c.getPrenom());
            ps.setString(4, c.getAdresse());
            ps.setString(5, c.getNationalite());
            ps.setString(6, c.getTel());
            ps.setString(7, c.getIdCard());
            
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(client_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;   
    }

    /**
     *
     * @param idCard
     * @return
     */
    @Override
    public client search(String idCard) {
        
        client c = new client();
        Connection connection = SingletonConnection.getConnection();
        
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("SELECT * FROM CLIENT WHERE idCard LIKE ? ");
            
            ps.setString(1, idCard);
            ResultSet rs = ps.executeQuery();
            
               if(rs.next()){
               
                   c.setId(rs.getInt("id"));
                c.setNom(rs.getString("nom"));
                c.setPrenom(rs.getString("prenom"));
                c.setAdresse(rs.getString("adresse"));
                c.setNationalite(rs.getString("nationalite"));
                c.setTel(rs.getString("tel"));
                c.setIdCard(rs.getString("idCard"));
               } 
                
                
                
        } catch (SQLException ex) {
            Logger.getLogger(client_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    @Override
     public List<client> lister() {
        
        List<client> clients = new ArrayList<client>();
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("SELECT * FROM CLIENT ");
            
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                client c = new client();
                c.setId(rs.getInt("ID"));
                c.setNom(rs.getString("NOM"));
                c.setPrenom(rs.getString("PRENOM"));
                c.setAdresse(rs.getString("ADRESSE"));
                c.setNationalite(rs.getString("NATIONALITE"));
                c.setTel(rs.getString("TEL"));
                c.setIdCard(rs.getString("IdCard"));
                
                clients.add(c);
                
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(client_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clients;
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
    public client update(client c) {
    
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("UPDATE `client` SET nom = ?, prenom = ?, adresse = ?, nationalite = ?, tel = ?, idCard = ? WHERE id = ?");
            
          
            ps.setString(1,c.getNom());
            ps.setString(2,c.getPrenom());
            ps.setString(3,c.getAdresse());
            ps.setString(4,c.getNationalite());
            ps.setString(5, c.getTel());
            ps.setString(6, c.getIdCard());
            ps.setInt(7, c.getId());
            
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(client_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }

    @Override
    public void delete(int id) {
    Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement
                ("DELETE FROM `client` WHERE ID = ?");
            
            
            ps.setInt(1,id);          
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(chambre_dao_Impl.class.getName()).log(Level.SEVERE, null, ex);
        }    
    
    
    }

}
