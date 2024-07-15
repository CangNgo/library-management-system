/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.models;

/**
 *
 * @author acer
 */
public class LoaiSach {
    private String MaLoaiSach; 
    private String TenLoaiSach;

    public LoaiSach(String MaLoaiSach, String TenLoaiSach) {
        this.MaLoaiSach = MaLoaiSach;
        this.TenLoaiSach = TenLoaiSach;
    }

    public LoaiSach() {
    }

    public String getMaLoaiSach() {
        return MaLoaiSach;
    }

    public void setMaLoaiSach(String MaLoaiSach) {
        this.MaLoaiSach = MaLoaiSach;
    }

    public String getTenLoaiSach() {
        return TenLoaiSach;
    }

    public void setTenLoaiSach(String TenLoaiSach) {
        this.TenLoaiSach = TenLoaiSach;
    }
    
}
