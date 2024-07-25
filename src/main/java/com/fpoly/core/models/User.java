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
    private boolean manager ;

    public User(String username, String vaitro, boolean manager) {
        this.username = username;
        this.vaitro = vaitro;
        this.manager = manager;
    }

    public User(String username, String vaitro) {
        this.username = username;
        this.vaitro = vaitro;
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
