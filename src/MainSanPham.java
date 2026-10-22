public class MainSanPham {
    public static void main(String[] args) {
        // Tạo Bàn phím cơ và Chuột không dây bằng constructor đủ tham số
        SanPham banPhim = new SanPham("SP01", "Bàn phím cơ", 450000, 20);
        SanPham chuot = new SanPham("SP02", "Chuột không dây", 200000, 50);

        // Tạo Tai nghe bằng constructor 2 tham số, rồi dùng setter đặt giá và tồn kho
        SanPham taiNghe = new SanPham("SP03", "Tai nghe");
        taiNghe.setDonGia(350000);
        taiNghe.setSoLuongTon(10);

        // Lập 3 đơn hàng (Chi nhập nhầm số lượng 0 -> tự sửa thành 1)
        donHang don1 = new donHang("An", banPhim, 2);
        donHang don2 = new donHang("Bình", chuot, 5);
        donHang don3 = new donHang("Chi", taiNghe, 0);

        // In danh sách sản phẩm và 3 đơn hàng
        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        banPhim.hienThi();
        chuot.hienThi();
        taiNghe.hienThi();

        System.out.println();
        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");
        donHang.inTieuDe();
        don1.inDonHang();
        don2.inDonHang();
        don3.inDonHang();
    }
}
