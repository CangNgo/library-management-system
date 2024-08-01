package com.fpoly.core.DAO;

import com.fpoly.core.models.PhieuMuon;
import com.fpoly.core.utils.JDBCHelper;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhieuMuonDAO extends AbstractDAO<PhieuMuon, String> {

    @Override
    public void insert(PhieuMuon entity) {
        String sql = "INSERT INTO PhieuMuon (MaPM, NgayMuon, NgayHenTra, TinhTrang, ThanhToan, MaDG, MaNV) VALUES (?, ?, ?, ?, ?, ?, ?)";
        JDBCHelper.update(sql, 
                entity.getMaPM(), 
                entity.getNgayMuon(), 
                entity.getNgayHenTra(), 
                entity.getTinhTrang(), 
                entity.getThanhToan(),
                entity.getMaDG(), 
                entity.getMaNV());
    }

    @Override
    public void update(PhieuMuon entity) {
        String sql = "UPDATE PhieuMuon SET NgayMuon=?, NgayHenTra=?, TinhTrang=?, ThanhToan=?, MaDG=?, MaNV=? WHERE MaPM=?";
        JDBCHelper.update(sql, 
                entity.getNgayMuon(), 
                entity.getNgayHenTra(), 
                entity.getTinhTrang(), 
                entity.getThanhToan(),
                entity.getMaDG(), 
                entity.getMaNV(), 
                entity.getMaPM());
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM PhieuMuon WHERE MaPM=?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public List<PhieuMuon> selectAll() throws SQLException {
        String sql = "SELECT * FROM PhieuMuon";
        return selectsql(sql);
    }

    @Override
    public PhieuMuon selectById(String key) {
        String sql = "SELECT * FROM PhieuMuon WHERE MaPM=?";
        List<PhieuMuon> list = null;
        try {
            list = selectsql(sql, key);
        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list != null && !list.isEmpty() ? list.get(0) : null;
    }

    @Override
    protected List<PhieuMuon> selectsql(String sql, Object... args) throws SQLException {
        List<PhieuMuon> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                PhieuMuon entity = new PhieuMuon();
                entity.setMaPM(rs.getString("MaPM"));
                entity.setNgayMuon(rs.getDate("NgayMuon"));
                entity.setNgayHenTra(rs.getDate("NgayHenTra"));
                entity.setTinhTrang(rs.getString("TinhTrang"));
                entity.setThanhToan(rs.getString("ThanhToan"));
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

    public List<PhieuMuon> searchByKeyword(String keyword) throws SQLException {
        String sql = "SELECT * FROM PhieuMuon WHERE MaPM LIKE ? OR TinhTrang LIKE ? OR MaDG LIKE ? OR MaNV LIKE ?";
        return selectsql(sql, "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%");
    }

    public void xuatPhieuMuon(String maPM) throws SQLException {
        String sql = "{call XuatPhieuMuon(?)}";
        try (CallableStatement stmt = (CallableStatement) JDBCHelper.getstmt(sql, maPM)) {
            stmt.execute();
        }
    }

    public void xuatPhieuTra(String maPM) throws SQLException {
        String sql = "{call XuatPhieuTra(?)}";
        try (CallableStatement stmt = (CallableStatement) JDBCHelper.getstmt(sql, maPM)) {
            stmt.execute();
        }
    }
}
