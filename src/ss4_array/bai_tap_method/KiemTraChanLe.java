package ss4_array.bai_tap_method;

import java.util.Scanner;

public class KiemTraChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số kiểm tra là chẳn hay lẻ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(isOdd(number));
    }

    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

}
