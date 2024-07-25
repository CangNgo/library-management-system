package com.fpoly.core.DAO;

import com.fpoly.core.models.DocGia;
import com.fpoly.core.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DocGiaDAO extends AbstractDAO<DocGia, String> {

    @Override
    public void insert(DocGia entity) {
        String sql = "INSERT INTO DocGia (MaDG, TenDG, NgaySinh, DiaChi, SDT) VALUES (?, ?, ?, ?, ?)";
        JDBCHelper.update(sql, 
                entity.getMaDG(), 
                entity.getTenDG(), 
                entity.getNgaySinh(), 
                entity.getDiaChi(), 
                entity.getSDT());
    }

    @Override
    public void update(DocGia entity) {
        String sql = "UPDATE DocGia SET TenDG=?, NgaySinh=?, DiaChi=?, SDT=? WHERE MaDG=?";
        JDBCHelper.update(sql, 
                entity.getTenDG(), 
                entity.getNgaySinh(), 
                entity.getDiaChi(), 
                entity.getSDT(), 
                entity.getMaDG());
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM DocGia WHERE MaDG=?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public List<DocGia> selectAll() throws SQLException {
        String sql = "SELECT * FROM DocGia";
        return selectsql(sql);
    }

    @Override
    public DocGia selectById(String key) {
        String sql = "SELECT * FROM DocGia WHERE MaDG=?";
        List<DocGia> list = null;
        try {
            list = selectsql(sql, key);
        } catch (SQLException ex) {
            Logger.getLogger(DocGiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<DocGia> selectsql(String sql, Object... args) throws SQLException {
        List<DocGia> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                DocGia entity = new DocGia();
                entity.setMaDG(rs.getString("MaDG"));
                entity.setTenDG(rs.getString("TenDG"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
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
    public DocGia loginDG( Object... args) throws SQLException {
        String sql = "select madg, taikhoan, matkhau from docgia where taikhoan = ?";
        DocGia docgia = null;
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                docgia = new DocGia();
                docgia.setMaDG(rs.getString("MaDG"));
                docgia.setTaikhoan(rs.getString("taikhoan"));
                docgia.setMatkhau(rs.getString("matkhau"));
                return docgia;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return null;
    }
    public List<DocGia> searchByKeyword(String keyword) throws SQLException {
    String sql = "SELECT * FROM DocGia WHERE MaDG LIKE ?";
    return selectsql(sql, "%" + keyword + "%");
}

}
