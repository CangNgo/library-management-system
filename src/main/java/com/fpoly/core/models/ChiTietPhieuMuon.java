/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.models;

/**
 *
 * @author acer
 */
public class ChiTietPhieuMuon {
   private String MaPM ; 
   private String MaSach;
     

    public ChiTietPhieuMuon(String MaPM, String MaSach) {
        this.MaPM = MaPM;
        this.MaSach = MaSach;
    }

    public ChiTietPhieuMuon() {
    }

    public String getMaPM() {
        return MaPM;
    }

    public void setMaPM(String MaPM) {
        this.MaPM = MaPM;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }
}
