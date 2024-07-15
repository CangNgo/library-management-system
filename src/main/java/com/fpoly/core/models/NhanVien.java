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
public class NhanVien {

    private String maNV;
    private String HoTen;
    private String TaiKhoan;
    private String MatKhau;
    private String VaiTro;
    private String Email;
    private Date NgayVaoLam;
    private String DiaChi;

    public NhanVien(String maNV, String HoTen, String TaiKhoan, String MatKhau, String VaiTro, String Email, Date NgayVaoLam, String DiaChi) {
        this.maNV = maNV;
        this.HoTen = HoTen;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
        this.Email = Email;
        this.NgayVaoLam = NgayVaoLam;
        this.DiaChi = DiaChi;
    }

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(Date NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    //can trien khai lai
    public boolean isVaiTro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
