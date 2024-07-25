package com.fpoly.core.DAO;

import com.fpoly.core.models.ChiTietPhieuTra;
import com.fpoly.core.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChiTietPhieuTraDAO extends AbstractDAO<ChiTietPhieuTra, String> {

    @Override
    public void insert(ChiTietPhieuTra entity) {
        String sql = "INSERT INTO ChiTietPhieuTra (MaPhieuTra, MaSach) VALUES (?, ?)";
        JDBCHelper.update(sql, 
                entity.getMaPT(), 
                entity.getMaSach());
    }

    @Override
    public void update(ChiTietPhieuTra entity) {
       
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM ChiTietPhieuTra WHERE MaPhieuTra=?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public List<ChiTietPhieuTra> selectAll() throws SQLException {
        String sql = "SELECT * FROM ChiTietPhieuTra";
        return selectsql(sql);
    }

    @Override
    public ChiTietPhieuTra selectById(String key) {
        String sql = "SELECT * FROM ChiTietPhieuTra WHERE MaPhieuTra=?";
        List<ChiTietPhieuTra> list = null;
        try {
            list = selectsql(sql, key);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietPhieuTraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<ChiTietPhieuTra> selectsql(String sql, Object... args) throws SQLException {
        List<ChiTietPhieuTra> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                ChiTietPhieuTra entity = new ChiTietPhieuTra();
                entity.setMaPT(rs.getString("MaPhieuTra"));
                entity.setMaSach(rs.getString("MaSach"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
}
