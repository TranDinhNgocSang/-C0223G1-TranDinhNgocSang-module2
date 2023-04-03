package ss2_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double rate = 24000;
        double usd;
        double vnd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền USD bạn muốn quy đổi sang VND");
        usd = scanner.nextDouble();
        vnd = usd * rate;
        System.out.println("số tiên tương ứng là: " + vnd + " VND");
    }
}
