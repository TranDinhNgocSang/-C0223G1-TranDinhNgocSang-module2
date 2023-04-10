package ss6_access_modifier_static.bai_tap_3;

public class ThucPham {
    private String maHang;
    private String tenHang;
    private int donGia;
    private Ngay ngaySanXuat;
    private Ngay ngayHetHan;

    public ThucPham(String maHang, String tenHang, int donGia, Ngay ngaySanXuat, Ngay ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        if (donGia>0)
        {
        this.donGia = donGia;
        }
    }

    public Ngay getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Ngay ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Ngay getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Ngay ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
}
