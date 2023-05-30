package ss19_thuat_toan.bai_tap10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số kiểm tra chẳn lẻ");
        int num = 0;
        boolean flag;
        do {
            flag = false;
            try {
                num = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("nhập không đúng, mời nhập lại");
                flag = true;
            }
        } while (flag);
        isOdd(num);
    }

    public static void isOdd(int num) {
        if (num % 2 == 0) {
            System.out.println( num + " là số chẳn");
        } else {
            System.out.println( num + " là số lẻ");
        }
    }
}
