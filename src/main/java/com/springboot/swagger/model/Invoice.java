/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author alvel
 */
@Entity
   public class Invoice {

        @Id
        private String asd;

        
        
        
        private String username;
        
        private String token;
        
        private String extTid;
        
        private String pin;
        
        private String dealerUser;
        
         private String dealerLocation;

    public Invoice(String asd, String username, String token, String extTid, String pin, String dealerUser, String dealerLocation) {
        this.asd = asd;
       
        this.username = username;
        this.token = token;
        this.extTid = extTid;
        this.pin = pin;
        this.dealerUser = dealerUser;
        this.dealerLocation = dealerLocation;
    }

    public String getInput() {
        return asd;
    }

    public void setInput(String input) {
        this.asd = input;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExtTid() {
        return extTid;
    }

    public void setExtTid(String extTid) {
        this.extTid = extTid;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getDealerUser() {
        return dealerUser;
    }

    public void setDealerUser(String dealerUser) {
        this.dealerUser = dealerUser;
    }

    public String getDealerLocation() {
        return dealerLocation;
    }

    public void setDealerLocation(String dealerLocation) {
        this.dealerLocation = dealerLocation;
    }

         
    }
