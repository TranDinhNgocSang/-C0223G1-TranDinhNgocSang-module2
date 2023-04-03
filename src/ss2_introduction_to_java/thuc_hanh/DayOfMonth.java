package ss2_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {

    public static void main(String[] args) {
        System.out.println("nhập tháng kiểm tra có bao nhiều ngày: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("tháng 2 có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng " + month + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng " + month + " có 30 ngày");
            default:
                System.out.println("nhập sai tháng rồi!");
        }
    }
}
