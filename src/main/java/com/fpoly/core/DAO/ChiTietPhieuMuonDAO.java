package com.fpoly.core.DAO;

import com.fpoly.core.models.ChiTietPhieuMuon;
import com.fpoly.core.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChiTietPhieuMuonDAO extends AbstractDAO<ChiTietPhieuMuon, String> {

    @Override
    public void insert(ChiTietPhieuMuon entity) {
        String sql = "INSERT INTO ChiTietPhieuMuon (MaPhieuMuon, MaSach) VALUES (?, ?)";
        JDBCHelper.update(sql, 
                entity.getMaPM(), 
                entity.getMaSach());
    }

    @Override
    public void update(ChiTietPhieuMuon entity) {
        // Không có cột SoLuong, chỉ cập nhật dữ liệu khác nếu cần
        String sql = "UPDATE ChiTietPhieuMuon SET MaSach=? WHERE MaPhieuMuon=?";
        JDBCHelper.update(sql, 
                entity.getMaSach(), 
                entity.getMaPM());
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM ChiTietPhieuMuon WHERE MaPhieuMuon=?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public List<ChiTietPhieuMuon> selectAll() throws SQLException {
        String sql = "SELECT * FROM ChiTietPhieuMuon";
        return selectsql(sql);
    }

    @Override
    public ChiTietPhieuMuon selectById(String key) {
        try {
            String sql = "SELECT * FROM ChiTietPhieuMuon WHERE MaPhieuMuon=?";
            List<ChiTietPhieuMuon> list = selectsql(sql, key);
            return list.size() > 0 ? list.get(0) : null;
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietPhieuMuonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected List<ChiTietPhieuMuon> selectsql(String sql, Object... args) throws SQLException {
        List<ChiTietPhieuMuon> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                ChiTietPhieuMuon entity = new ChiTietPhieuMuon();
                entity.setMaPM(rs.getString("MaPhieuMuon"));
                entity.setMaSach(rs.getString("MaSach"));
                // Không cần ánh xạ cột SoLuong nữa
                list.add(entity);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
}
