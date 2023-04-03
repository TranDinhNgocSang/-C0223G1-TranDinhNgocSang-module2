package ss2_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhNamNhuan {

    public static void main(String[] args) {
        System.out.println("nhập năm để kiểm tra có phải là năm nhuận không: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " không là năm nhuận");
        } else {
            System.out.println(year + " là năm nhuận");
        }
    }
}

