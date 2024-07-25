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
public class DocGia {

    private String MaDG;
    private String TenDG;
    private Date NgaySinh;
    private String SDT;
    private String Email;
    private String DiaChi;
    private String taikhoan;
    private String matkhau;

    public DocGia(String MaDG, String taikhoan, String matkhau) {
        this.MaDG = MaDG;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
    }
    

    public DocGia(String MaDG, String TenDG, Date NgaySinh, String SDT, String Email, String DiaChi) {
        this.MaDG = MaDG;
        this.TenDG = TenDG;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
    }

    public DocGia(String MaDG, String TenDG, Date NgaySinh, String SDT, String Email, String DiaChi, String taikhoan, String matkhau) {
        this.MaDG = MaDG;
        this.TenDG = TenDG;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public DocGia() {
    }

    public String getMaDG() {
        return MaDG;
    }

    public void setMaDG(String MaDG) {
        this.MaDG = MaDG;
    }

    public String getTenDG() {
        return TenDG;
    }

    public void setTenDG(String TenDG) {
        this.TenDG = TenDG;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
}
