package ss4_array.bai_tap_method;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm để kiểm tra có phải năm nhuận không");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(kiemTraNamNhuan(number));
    }

    public static boolean kiemTraNamNhuan(int number) {
        if (number % 4 != 0 || number % 100 == 0 && number % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
