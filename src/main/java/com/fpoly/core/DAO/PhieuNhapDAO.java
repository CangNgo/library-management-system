package com.fpoly.core.DAO;

import com.fpoly.core.models.PhieuNhap;
import com.fpoly.core.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhieuNhapDAO extends AbstractDAO<PhieuNhap, String> {

    @Override
    public void insert(PhieuNhap entity) {
        String sql = "INSERT INTO PhieuNhap (MaPN, NgayNhap, MaNCC, MaNV) VALUES (?, ?, ?, ?)";
        JDBCHelper.update(sql, 
                entity.getMaPN(), 
                entity.getNgayNhap(), 
                entity.getMaNCC(), 
                entity.getMaNV());
    }

    @Override
    public void update(PhieuNhap entity) {
        String sql = "UPDATE PhieuNhap SET NgayNhap=?, MaNCC=?, MaNV=? WHERE MaPN=?";
        JDBCHelper.update(sql, 
                entity.getNgayNhap(), 
                entity.getMaNCC(), 
                entity.getMaNV(), 
                entity.getMaPN());
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM PhieuNhap WHERE MaPN=?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public List<PhieuNhap> selectAll() throws SQLException {
        String sql = "SELECT * FROM PhieuNhap";
        return selectsql(sql);
    }

    @Override
    public PhieuNhap selectById(String key) {
        String sql = "SELECT * FROM PhieuNhap WHERE MaPN=?";
        List<PhieuNhap> list = null;
        try {
            list = selectsql(sql, key);
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<PhieuNhap> selectsql(String sql, Object... args) throws SQLException {
        List<PhieuNhap> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                PhieuNhap entity = new PhieuNhap();
                entity.setMaPN(rs.getString("MaPN"));
                entity.setNgayNhap(rs.getDate("NgayNhap"));
                entity.setMaNCC(rs.getString("MaNCC"));
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
