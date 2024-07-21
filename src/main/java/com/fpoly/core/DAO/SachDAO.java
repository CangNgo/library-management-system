/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.DAO;

import com.fpoly.core.models.Sach;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author acer
 */
public class SachDAO extends AbstractDAO<Sach,String> {

    @Override
    public void insert(Sach entity) {

    }

    @Override
    public void update(Sach entity) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<Sach> selectAll() throws SQLException {
        return List.of();
    }

    @Override
    Sach selectById(String key) {
        return null;
    }

    @Override
    protected List<Sach> selectsql(String sql, Object... object) throws SQLException {
        return List.of();
    }
}
