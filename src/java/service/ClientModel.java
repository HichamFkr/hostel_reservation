/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Beans.client;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hicham
 */
public class ClientModel {
    private int idCard;
    private client client;
    private List<client> clients = new ArrayList<>();

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public client getClient() {
        return client;
    }

    public void setClient(client client) {
        this.client = client;
    }

    public List<client> getClients() {
        return clients;
    }

    public void setClients(List<client> clients) {
        this.clients = clients;
    }
    
    
    
}
