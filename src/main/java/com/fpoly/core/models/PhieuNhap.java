/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.models;

import java.util.Date;

/**
 *
 * @author acer
 */
public class PhieuNhap {

    private String MaPN;
    private int SoLuong;
    Date NgayNhap;
    private String MaNCC;
    private String MaNV;

    public PhieuNhap(String MaPN, int SoLuong, Date NgayNhap, String MaNCC, String MaNV) {
        this.MaPN = MaPN;
        this.SoLuong = SoLuong;
        this.NgayNhap = NgayNhap;
        this.MaNCC = MaNCC;
        this.MaNV = MaNV;
    }

    public PhieuNhap() {
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String MaPN) {
        this.MaPN = MaPN;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
}
