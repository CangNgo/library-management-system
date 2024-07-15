/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.models;

/**
 *
 * @author acer
 */
public class ChiTietPhieuTra {
    private String MaPT ; 
    private String MaSach ;

    public ChiTietPhieuTra(String MaPT, String MaSach) {
        this.MaPT = MaPT;
        this.MaSach = MaSach;
    }

    public ChiTietPhieuTra() {
    }

    public String getMaPT() {
        return MaPT;
    }

    public void setMaPT(String MaPT) {
        this.MaPT = MaPT;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }
}
