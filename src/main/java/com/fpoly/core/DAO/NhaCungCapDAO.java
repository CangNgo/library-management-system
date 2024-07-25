package com.fpoly.core.DAO;

import com.fpoly.core.models.NhaCungCap;
import com.fpoly.core.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhaCungCapDAO extends AbstractDAO<NhaCungCap, String> {

    @Override
    public void insert(NhaCungCap entity) {
        String sql = "INSERT INTO NhaCungCap (MaNCC, TenNCC, DiaChi, SDT) VALUES (?, ?, ?, ?)";
        JDBCHelper.update(sql, 
                entity.getMaNCC(), 
                entity.getTenNCC(), 
                entity.getDiaChi(), 
                entity.getSDT());
    }

    @Override
    public void update(NhaCungCap entity) {
        String sql = "UPDATE NhaCungCap SET TenNCC=?, DiaChi=?, SDT=? WHERE MaNCC=?";
        JDBCHelper.update(sql, 
                entity.getTenNCC(), 
                entity.getDiaChi(), 
                entity.getSDT(), 
                entity.getMaNCC());
                
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM NhaCungCap WHERE MaNCC=?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public List<NhaCungCap> selectAll() throws SQLException {
        String sql = "SELECT * FROM NhaCungCap";
        return selectsql(sql);
    }

    @Override
    public NhaCungCap selectById(String key) {
        String sql = "SELECT * FROM NhaCungCap WHERE MaNCC=?";
        List<NhaCungCap> list = null;
        try {
            list = selectsql(sql, key);
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<NhaCungCap> selectsql(String sql, Object... args) throws SQLException {
        List<NhaCungCap> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                NhaCungCap entity = new NhaCungCap();
                entity.setMaNCC(rs.getString("MaNCC"));
                entity.setTenNCC(rs.getString("TenNCC"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setSDT(rs.getString("SDT"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
 public List<NhaCungCap> searchByKeyword(String keyword) throws SQLException {
    String sql = "SELECT * FROM NhaCungCap WHERE MaNCC LIKE ? OR TenNCC LIKE ? OR DiaChi LIKE ? OR SDT LIKE ?";
    return selectsql(sql, "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%");
}


}
