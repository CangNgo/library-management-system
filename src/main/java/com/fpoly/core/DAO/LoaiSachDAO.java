/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.DAO;

import com.fpoly.core.models.LoaiSach;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author acer
 */
public class LoaiSachDAO extends AbstractDAO<LoaiSach,String>  {


    @Override
    public void insert(LoaiSach entity) {

    }

    @Override
    public void update(LoaiSach entity) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<LoaiSach> selectAll() throws SQLException {
        return List.of();
    }

    @Override
    LoaiSach selectById(String key) {
        return null;
    }

    @Override
    protected List<LoaiSach> selectsql(String sql, Object... object) throws SQLException {
        return List.of();
    }
}
