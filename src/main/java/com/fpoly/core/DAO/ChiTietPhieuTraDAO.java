/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.DAO;

import com.fpoly.core.models.ChiTietPhieuTra;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author acer
 */
public class ChiTietPhieuTraDAO extends AbstractDAO<ChiTietPhieuTra, String> {

    @Override
    public void insert(ChiTietPhieuTra entity) {

    }

    @Override
    public void update(ChiTietPhieuTra entity) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<ChiTietPhieuTra> selectAll() throws SQLException {
        return List.of();
    }

    @Override
    ChiTietPhieuTra selectById(String key) {
        return null;
    }

    @Override
    protected List<ChiTietPhieuTra> selectsql(String sql, Object... object) throws SQLException {
        return List.of();
    }
}
