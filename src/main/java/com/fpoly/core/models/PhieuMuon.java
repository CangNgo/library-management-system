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
public class PhieuMuon {

    private String MaPM;
    private Date NgayMuon;
    private Date NgayHenTra;
    private String TinhTrang;
    private String ThanhToan;
    private String MaDG;
    private String MaNV;

    public PhieuMuon(String MaPM, Date NgayMuon, Date NgayHenTra, String TinhTrang, String ThanhToan, String MaDG, String MaNV) {
        this.MaPM = MaPM;
        this.NgayMuon = NgayMuon;
        this.NgayHenTra = NgayHenTra;
        this.TinhTrang = TinhTrang;
        this.ThanhToan = ThanhToan;
        this.MaDG = MaDG;
        this.MaNV = MaNV;
    }

    public PhieuMuon() {
    }

    public String getMaPM() {
        return MaPM;
    }

    public void setMaPM(String MaPM) {
        this.MaPM = MaPM;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public Date getNgayHenTra() {
        return NgayHenTra;
    }

    public void setNgayHenTra(Date NgayHenTra) {
        this.NgayHenTra = NgayHenTra;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getThanhToan() {
        return ThanhToan;
    }

    public void setThanhToan(String ThanhToan) {
        this.ThanhToan = ThanhToan;
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
