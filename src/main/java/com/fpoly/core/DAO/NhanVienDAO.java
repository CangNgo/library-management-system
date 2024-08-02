package com.fpoly.core.DAO;

import com.fpoly.core.models.NhanVien;
import com.fpoly.core.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVienDAO extends AbstractDAO<NhanVien, String> {

    @Override
    public void insert(NhanVien entity) {
        String sql = "INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?)";
        JDBCHelper.update(sql,
                entity.getMaNV(),
                entity.getMatKhau(),
                entity.getHoTen(),
                entity.getVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        String sql = "UPDATE NhanVien SET MatKhau=?, HoTen=?, VaiTro=? WHERE MaNV=?";
        JDBCHelper.update(sql,
                entity.getMatKhau(),
                entity.getHoTen(),
                entity.getVaiTro(),
                entity.getMaNV());
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM NhanVien WHERE MaNV=?";
        JDBCHelper.update(sql, key);
    }

    @Override
    public List<NhanVien> selectAll() throws SQLException {
        String sql = "SELECT * FROM V_NHANVIEN";
        return selectsql(sql);
    }

    @Override
    public NhanVien selectById(String key) {
        String sql = "SELECT * FROM V_NHANVIEN WHERE Ma=?";
        List<NhanVien> list = null;
        try {
            list = selectsql(sql, key);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<NhanVien> selectsql(String sql, Object... args) throws SQLException {
        List<NhanVien> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("Ma"));
                entity.setMatKhau(rs.getString("MK"));
                entity.setHoTen(rs.getString("HO_TEN"));
                entity.setVaiTro(rs.getString("VAITRO"));
                entity.setEmail(rs.getString("EMAIL"));
                entity.setDiaChi(rs.getString("DIA_CHI"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<NhanVien> searchByKeyword(String keyword) throws SQLException {
        String sql = "SELECT * FROM NhanVien WHERE MaNV LIKE ? OR HoTen LIKE ?";
        return selectsql(sql, "%" + keyword + "%", "%" + keyword + "%");
    }

    public NhanVien loginNV(Object... args) throws SQLException {
        String sql = "select manv, taikhoan, matkhau, vaitro from nhanvien where taikhoan = ?";
        NhanVien nhanvien = null;
        try (ResultSet rs = JDBCHelper.query(sql, args)) {
            while (rs.next()) {
                nhanvien = new NhanVien();
                nhanvien.setMaNV(rs.getString("MaNV"));
                nhanvien.setTaiKhoan(rs.getString("taikhoan"));
                nhanvien.setMatKhau(rs.getString("matkhau"));
                nhanvien.setVaiTro(rs.getString("vaitro"));
                return nhanvien;
            }
        } catch (SQLException ex) {
            return null;
        }
        return null;
    }
    
        public void updatePassword(NhanVien entity) {
        String sql = "UPDATE NhanVien SET MatKhau=? WHERE MaNV=?";
        JDBCHelper.update(sql,
                entity.getMatKhau(),
                entity.getMaNV());
    }

}
