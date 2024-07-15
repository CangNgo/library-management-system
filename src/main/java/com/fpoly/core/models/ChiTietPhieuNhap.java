/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.models;

/**
 *
 * @author acer
 */
public class ChiTietPhieuNhap {
    private String MaPN; 
    private String MaSach;

    public ChiTietPhieuNhap(String MaPN, String MaSach) {
        this.MaPN = MaPN;
        this.MaSach = MaSach;
    }

    public ChiTietPhieuNhap() {
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String MaPN) {
        this.MaPN = MaPN;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }
}
