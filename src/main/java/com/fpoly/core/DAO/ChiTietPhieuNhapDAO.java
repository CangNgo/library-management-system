/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.DAO;

import com.fpoly.core.models.ChiTietPhieuNhap;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author acer
 */
public class ChiTietPhieuNhapDAO extends AbstractDAO<ChiTietPhieuNhap, String> {

    @Override
    public void insert(ChiTietPhieuNhap entity) {

    }

    @Override
    public void update(ChiTietPhieuNhap entity) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<ChiTietPhieuNhap> selectAll() throws SQLException {
        return List.of();
    }

    @Override
    ChiTietPhieuNhap selectById(String key) {
        return null;
    }

    @Override
    protected List<ChiTietPhieuNhap> selectsql(String sql, Object... object) throws SQLException {
        return List.of();
    }
}
