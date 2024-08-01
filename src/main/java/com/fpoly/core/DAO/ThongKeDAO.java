package com.fpoly.core.DAO;

import com.fpoly.core.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ThongKeDAO {

    public int getTongSoSach() throws SQLException {
        String sql = "SELECT COUNT(*) AS TongSoSach FROM Sach";
        try (ResultSet rs = JDBCHelper.query(sql)) {
            if (rs.next()) {
                return rs.getInt("TongSoSach");
            }
        }
        return 0;
    }

    public int getTongSoDocGia() throws SQLException {
        String sql = "SELECT COUNT(*) AS TongSoDocGia FROM DocGia";
        try (ResultSet rs = JDBCHelper.query(sql)) {
            if (rs.next()) {
                return rs.getInt("TongSoDocGia");
            }
        }
        return 0;
    }

    public int getSoSachDangMuon() throws SQLException {
        String sql = "SELECT COUNT(*) AS SoSachDangMuon FROM PhieuMuon WHERE TinhTrang = N'Chưa trả' ";
        try (ResultSet rs = JDBCHelper.query(sql)) {
            if (rs.next()) {
                return rs.getInt("SoSachDangMuon");
            }
        }
        return 0;
    }
}
