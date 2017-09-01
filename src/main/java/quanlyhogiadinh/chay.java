package quanlyhogiadinh;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ketnnoi.ConnectionUntil;

public class chay {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionUntil.getMyConnection();
		Statement statm = conn.createStatement();
		String sql = "SELECT HO_TEN , TO_CHAR(TO_DATE(CN.NGAY_SINH,'yyyymmdd'), 'dd/mm/yyyy') as NGAY_SINH, GT.TEN AS GIOI_TINH, "
				+ "TT_DIA_CHI_CHI_TIET AS DIA_CHI, Tinh.TEN AS TINH, Quan.TEN AS QUAN_HUYEN, Xa.TEN AS XA, Thon.TEN AS THON "
				+ "FROM TT_CA_NHAN CN, DM_GIOI_TINH GT, DM_TINH_TP Tinh, DM_QUAN_HUYEN Quan, DM_XA_PHUONG Xa, DM_THON_XOM Thon "
				+ "WHERE CN.GIOI_TINH_ID = GT.ID and CN.TT_XA_ID = Xa.ID and CN.TT_TINH_ID = Tinh.ID and CN.TT_HUYEN_ID = Quan.ID "
				+ "and CN.TT_THON_XOM_ID = Thon.ID and GT.ID = 2 and CN.HO_TEN = 'Nguyễn Quỳnh Như' and Tinh.ID = 1 and Quan.ID = 8 "
				+ "and Xa.ID = 105 and CN.TT_THON_XOM_ID = 14350584";
		ResultSet rs = statm.executeQuery(sql);
		while(rs.next()){
			String hoTen = rs.getString("HO_TEN");
			String ngSinh = rs.getString("NGAY_SINH");
			String gTinh = rs.getString("GIOI_TINH");
			String dChiChiTiet = rs.getString("DIA_CHI");
			String tinh = rs.getString("TINH");
			String qHuyen = rs.getString("QUAN_HUYEN");
			String xa = rs.getString("XA");
			String thon = rs.getString("THON");

			System.out.println("Ho Ten: " + hoTen);
			System.out.println("Ngay Sinh: " + ngSinh);
			System.out.println("Gioi Tinh: " + gTinh);
			System.out.println("Dia chi: " + dChiChiTiet);

			System.out.println("Tinh: " + tinh);
			System.out.println("Quan Huyen: " + qHuyen);
			System.out.println("Xa: " + xa);
			System.out.println("Thon: " + thon);
			String diachi = dChiChiTiet + " - " + thon + " - " + xa  + " - " + qHuyen + " - " + tinh;
			System.out.println(diachi);
	    }

	}

}
