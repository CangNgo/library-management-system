package com.fpoly.core.DAO;

import com.fpoly.core.models.LoaiSach;
import com.fpoly.core.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoaiSachDAO extends AbstractDAO<LoaiSach, String> {

    @Override
    public void insert(LoaiSach entity) {
        String sql = "INSERT INTO LoaiSach (MaLoaiSach, TenLoaiSach) VALUES (?, ?)";
        JDBCHelper.update(sql, 
                entity.getMaLoaiSach(), 
                entity.getTenLoaiSach());
    }

    @Override
    public void update(LoaiSach entity) {
        String sql = "UPDATE LoaiSach SET TenLoaiSach=? WHERE MaLoaiSach=?";
        JDBCHelper.update(sql, 
                entity.getTenLoaiSach(), 
                entity.getMaLoaiSach());
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM LoaiSach WHERE MaLoaiSach=?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public List<LoaiSach> selectAll() throws SQLException {
        String sql = "SELECT * FROM LoaiSach";
        return selectsql(sql);
    }

    @Override
    public LoaiSach selectById(String key) {
        String sql = "SELECT * FROM LoaiSach WHERE MaLoaiSach=?";
        List<LoaiSach> list = null;
        try {
            list = selectsql(sql, key);
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<LoaiSach> selectsql(String sql, Object... args) throws SQLException {
        List<LoaiSach> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                LoaiSach entity = new LoaiSach();
                entity.setMaLoaiSach(rs.getString("MaLoaiSach"));
                entity.setTenLoaiSach(rs.getString("TenLoaiSach"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
}
