/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.DAO;

import com.fpoly.core.models.DocGia;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author acer
 */
public class DocGiaDAO extends AbstractDAO<DocGia,String > {


    @Override
    public void insert(DocGia entity) {

    }

    @Override
    public void update(DocGia entity) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<DocGia> selectAll() throws SQLException {
        return List.of();
    }

    @Override
    DocGia selectById(String key) {
        return null;
    }

    @Override
    protected List<DocGia> selectsql(String sql, Object... object) throws SQLException {
        return List.of();
    }
}