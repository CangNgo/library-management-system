package com.fpoly.core.DAO;

import com.fpoly.core.models.PhieuTra;
import com.fpoly.core.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhieuTraDAO extends AbstractDAO<PhieuTra, String> {

    @Override
    public void insert(PhieuTra entity) {
        String sql = "INSERT INTO PhieuTra (MaPT, NgayTra, MaDG, MaNV) VALUES (?, ?, ?, ?)";
        JDBCHelper.update(sql, 
                entity.getMaPT(), 
                entity.getNgayTra(), 
                entity.getMaDG(), 
                entity.getMaNV());
    }

    @Override
    public void update(PhieuTra entity) {
        String sql = "UPDATE PhieuTra SET NgayTra=?, MaDG=?, MaNV=? WHERE MaPT=?";
        JDBCHelper.update(sql, 
                entity.getNgayTra(), 
                entity.getMaDG(), 
                entity.getMaNV(), 
                entity.getMaPT());
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM PhieuTra WHERE MaPT=?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public List<PhieuTra> selectAll() throws SQLException {
        String sql = "SELECT * FROM PhieuTra";
        return selectsql(sql);
    }

    @Override
    public PhieuTra selectById(String key) {
        String sql = "SELECT * FROM PhieuTra WHERE MaPT=?";
        List<PhieuTra> list = null;
        try {
            list = selectsql(sql, key);
        } catch (SQLException ex) {
            Logger.getLogger(PhieuTraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<PhieuTra> selectsql(String sql, Object... args) throws SQLException {
        List<PhieuTra> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                PhieuTra entity = new PhieuTra();
                entity.setMaPT(rs.getString("MaPT"));
                entity.setNgayTra(rs.getDate("NgayTra"));
                entity.setMaDG(rs.getString("MaDG"));
                entity.setMaNV(rs.getString("MaNV"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
}
