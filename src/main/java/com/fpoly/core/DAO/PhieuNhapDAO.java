/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.DAO;

import com.fpoly.core.models.PhieuNhap;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author acer
 */
public class PhieuNhapDAO extends AbstractDAO<PhieuNhap,String> {

    @Override
    public void insert(PhieuNhap entity) {

    }

    @Override
    public void update(PhieuNhap entity) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<PhieuNhap> selectAll() throws SQLException {
        return List.of();
    }

    @Override
    PhieuNhap selectById(String key) {
        return null;
    }

    @Override
    protected List<PhieuNhap> selectsql(String sql, Object... object) throws SQLException {
        return List.of();
    }
}
