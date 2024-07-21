/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.DAO;

import com.fpoly.core.models.ChiTietPhieuMuon;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author acer
 */
public class ChiTietPhieuMuonDAO extends AbstractDAO<ChiTietPhieuMuon, String>{

    @Override
    public void insert(ChiTietPhieuMuon entity) {

    }

    @Override
    public void update(ChiTietPhieuMuon entity) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<ChiTietPhieuMuon> selectAll() throws SQLException {
        return List.of();
    }

    @Override
    ChiTietPhieuMuon selectById(String key) {
        return null;
    }

    @Override
    protected List<ChiTietPhieuMuon> selectsql(String sql, Object... object) throws SQLException {
        return List.of();
    }
}
