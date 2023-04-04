package ss3_loop.thuc_hanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double soTienGui;
        int thang;
        double laiSuat;
        double tienLai;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền gửi (triệu đồng)");
        soTienGui = Double.parseDouble(sc.nextLine());
        System.out.println("nhập số tháng");
        thang = Integer.parseInt(sc.nextLine());
        System.out.println("nhập lãi suất/ tháng");
        laiSuat = Double.parseDouble(sc.nextLine());
        tienLai = (soTienGui * Math.pow((1 + laiSuat), thang)) - soTienGui;
        System.out.println("số tiền lãi nhận được là: " + tienLai + "triệu đồng");
    }
}
