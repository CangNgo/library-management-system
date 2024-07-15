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
public class PhieuTra {

    private String MaPT;
    private Date NgayMuon  ;
    private Date NgayTra  ;
    private String TinhTrang;
    private double TienPhat;
    private String MaDG;
    private String MaNV;

    public PhieuTra(String MaPT, Date NgayMuon, Date NgayTra, String TinhTrang, double TienPhat, String MaDG, String MaNV) {
        this.MaPT = MaPT;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
        this.TinhTrang = TinhTrang;
        this.TienPhat = TienPhat;
        this.MaDG = MaDG;
        this.MaNV = MaNV;
    }

    public PhieuTra() {
    }

    public String getMaPT() {
        return MaPT;
    }

    public void setMaPT(String MaPT) {
        this.MaPT = MaPT;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public double getTienPhat() {
        return TienPhat;
    }

    public void setTienPhat(double TienPhat) {
        this.TienPhat = TienPhat;
    }

    public String getMaDG() {
        return MaDG;
    }

    public void setMaDG(String MaDG) {
        this.MaDG = MaDG;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
}
