/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.DAO;

import com.fpoly.core.models.NhanVien;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author acer
 */
public class NhanVienDAO extends AbstractDAO<NhanVien, String> {

    @Override
    public void insert(NhanVien entity) {

    }

    @Override
    public void update(NhanVien entity) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<NhanVien> selectAll() throws SQLException {
        return List.of();
    }

    @Override
    NhanVien selectById(String key) {
        return null;
    }

    @Override
    protected List<NhanVien> selectsql(String sql, Object... object) throws SQLException {
        return List.of();
    }
}
