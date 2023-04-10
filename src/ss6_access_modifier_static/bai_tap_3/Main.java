package ss6_access_modifier_static.bai_tap_3;

public class Main {
    public static void main(String[] args) {
        Ngay ngaySanXuat1 = new Ngay(01,02,2020);
        Ngay ngayHetHan1 = new Ngay(01,02,2021);
        Ngay ngaySanXuat2 = new Ngay(11,2,2019);
        Ngay ngayHetHan2 = new Ngay(11,12,2023);
        ThucPham thucPham1 = new ThucPham("R01","rau ma",5000,ngaySanXuat1,ngayHetHan1);
        ThucPham thucPham2 = new ThucPham("B01","thit bo",150000,ngaySanXuat2,ngayHetHan2);
    }
}
