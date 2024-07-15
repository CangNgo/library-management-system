/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.models;

/**
 *
 * @author acer
 */
public class NhaCungCap {
    private String MaNCC ; 
    private String TenNCC; 
    private String SDT; 
    private String DiaChi;

    public NhaCungCap(String MaNCC, String TenNCC, String SDT, String DiaChi) {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
    }

    public NhaCungCap() {
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
}
