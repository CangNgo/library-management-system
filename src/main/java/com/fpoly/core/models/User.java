/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.models;

/**
 *
 * @author acer
 */
public class User {

    private String username;
    private String vaitro;
    private String password;
    private boolean manager ;
    private String id; 
    public User(String username, String vaitro, String password) {
        this.username = username;
        this.vaitro = vaitro;
        this.password = password;
    }

    public User(String username, String vaitro, String password, boolean manager,String id) {
        this.username = username;
        this.vaitro = vaitro;
        this.password = password;
        this.manager = manager;
        this.id = id; 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public boolean getManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String maNV) {
        String tenvaitro = maNV.substring(0, 2);
        if (tenvaitro.equalsIgnoreCase("NV")) {
            this.vaitro = "Nhân viên";
        } else {
            this.vaitro = "Đọc giả";
        }
    }

}
