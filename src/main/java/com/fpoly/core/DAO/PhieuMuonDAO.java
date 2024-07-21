/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.DAO;

import com.fpoly.core.models.PhieuMuon;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author acer
 */
public class PhieuMuonDAO extends AbstractDAO<PhieuMuon,String> {


    @Override
    public void insert(PhieuMuon entity) {

    }

    @Override
    public void update(PhieuMuon entity) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<PhieuMuon> selectAll() throws SQLException {
        return List.of();
    }

    @Override
    PhieuMuon selectById(String key) {
        return null;
    }

    @Override
    protected List<PhieuMuon> selectsql(String sql, Object... object) throws SQLException {
        return List.of();
    }
}
