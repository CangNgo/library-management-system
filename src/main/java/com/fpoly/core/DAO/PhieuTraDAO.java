/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.DAO;

import com.fpoly.core.models.PhieuTra;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author acer
 */
public class PhieuTraDAO extends AbstractDAO<PhieuTra, String>{


    @Override
    public void insert(PhieuTra entity) {

    }

    @Override
    public void update(PhieuTra entity) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<PhieuTra> selectAll() throws SQLException {
        return List.of();
    }

    @Override
    PhieuTra selectById(String key) {
        return null;
    }

    @Override
    protected List<PhieuTra> selectsql(String sql, Object... object) throws SQLException {
        return List.of();
    }
}
