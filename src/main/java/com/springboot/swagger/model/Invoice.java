/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alvel
 */
@Entity
@Table(name = "INVOICE")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ASD")
    private String asd;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "TOKEN")
    private String token;

    @Column(name = "EXTTID")
    private String extTid;

    @Column(name = "PIN")
    private String pin;

    @Column(name = "DEALERUSER")
    private String dealerUser;

    @Column(name = "DEALERLOCATION")
    private String dealerLocation;
    
    public Invoice(){
   
}

    public Invoice(String asd, String username, String token, String extTid, String pin, String dealerUser, String dealerLocation) {
        this.asd = asd;
        this.username = username;
        this.token = token;
        this.extTid = extTid;
        this.pin = pin;
        this.dealerUser = dealerUser;
        this.dealerLocation = dealerLocation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAsd() {
        return asd;
    }

    public void setAsd(String asd) {
        this.asd = asd;
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
