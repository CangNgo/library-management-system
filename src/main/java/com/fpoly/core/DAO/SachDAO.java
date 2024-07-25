package com.fpoly.core.DAO;

import com.fpoly.core.models.Sach;
import com.fpoly.core.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SachDAO extends AbstractDAO<Sach, String> {

    @Override
    public void insert(Sach entity) {
        String sql = "INSERT INTO Sach (MaSach, TenSach, LanTaiBan, NamXB, TenTG, NhaXB, SoLuong, HinhAnh, GiaSach, LoaiSach) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        JDBCHelper.update(sql, 
                entity.getMaSach(), 
                entity.getTenSach(), 
                entity.getLanTaiBan(), 
                entity.getNamXB(), 
                entity.getTenTG(), 
                entity.getNhaXB(), 
                entity.getSoLuong(), 
                entity.getHinh(), 
                entity.getGiaSach(), 
                entity.getLoaiSach());
    }

    @Override
    public void update(Sach entity) {
        String sql = "UPDATE Sach SET TenSach=?, LanTaiBan=?, NamXB=?, TenTG=?, NhaXB=?, SoLuong=?, HinhAnh=?, GiaSach=?, LoaiSach=? WHERE MaSach=?";
        JDBCHelper.update(sql, 
                entity.getTenSach(), 
                entity.getLanTaiBan(), 
                entity.getNamXB(), 
                entity.getTenTG(), 
                entity.getNhaXB(), 
                entity.getSoLuong(), 
                entity.getHinh(), 
                entity.getGiaSach(), 
                entity.getLoaiSach(), 
                entity.getMaSach());
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM Sach WHERE MaSach=?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public List<Sach> selectAll() throws SQLException {
        String sql = "SELECT * FROM Sach";
        return selectsql(sql);
    }

    @Override
    public Sach selectById(String key) {
        String sql = "SELECT * FROM Sach WHERE MaSach=?";
        List<Sach> list = null;
        try {
            list = selectsql(sql, key);
        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<Sach> selectsql(String sql, Object... args) throws SQLException {
        List<Sach> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                Sach entity = new Sach();
                entity.setMaSach(rs.getString("MaSach"));
                entity.setTenSach(rs.getString("TenSach"));
                entity.setLanTaiBan(rs.getString("LanTaiBan"));
                entity.setNamXB(rs.getInt("NamXB"));
                entity.setTenTG(rs.getString("TenTG"));
                entity.setNhaXB(rs.getString("NhaXB"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setHinh(rs.getString("HinhAnh"));
                entity.setGiaSach(rs.getDouble("GiaSach"));
                entity.setLoaiSach(rs.getString("LoaiSach"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    public List<Sach> searchByKeyword(String keyword) throws SQLException {
    String sql = "SELECT * FROM Sach WHERE MaSach LIKE ? OR TenSach LIKE ?"; // Có thể điều chỉnh tùy theo các trường cần tìm kiếm
    return selectsql(sql, "%" + keyword + "%", "%" + keyword + "%");
}

}
