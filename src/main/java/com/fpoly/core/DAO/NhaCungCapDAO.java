/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.DAO;

import com.fpoly.core.forms.NhaCungCap;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author acer
 */
public class NhaCungCapDAO extends AbstractDAO<NhaCungCap,String> {

    @Override
    public void insert(NhaCungCap entity) {

    }

    @Override
    public void update(NhaCungCap entity) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<NhaCungCap> selectAll() throws SQLException {
        return List.of();
    }

    @Override
    NhaCungCap selectById(String key) {
        return null;
    }

    @Override
    protected List<NhaCungCap> selectsql(String sql, Object... object) throws SQLException {
        return List.of();
    }
}
