/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.models;

/**
 *
 * @author acer
 */
public class Sach {

    private String maSach;
    private String tenSach;
    private String lanTaiBan;
    private int namXB;
    private String tenTG;
    private String nhaXB;
    private int SoLuong;
    private String Hinh;
    double GiaSach;
    private String LoaiSach;

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getLanTaiBan() {
        return lanTaiBan;
    }

    public void setLanTaiBan(String lanTaiBan) {
        this.lanTaiBan = lanTaiBan;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public double getGiaSach() {
        return GiaSach;
    }

    public void setGiaSach(double GiaSach) {
        this.GiaSach = GiaSach;
    }

    public String getLoaiSach() {
        return LoaiSach;
    }

    public void setLoaiSach(String LoaiSach) {
        this.LoaiSach = LoaiSach;
    }

    public Sach(String maSach, String tenSach, String lanTaiBan, int namXB, String tenTG, String nhaXB, int SoLuong, String Hinh, double GiaSach, String LoaiSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.lanTaiBan = lanTaiBan;
        this.namXB = namXB;
        this.tenTG = tenTG;
        this.nhaXB = nhaXB;
        this.SoLuong = SoLuong;
        this.Hinh = Hinh;
        this.GiaSach = GiaSach;
        this.LoaiSach = LoaiSach;
    }

    public Sach() {
    }
}
