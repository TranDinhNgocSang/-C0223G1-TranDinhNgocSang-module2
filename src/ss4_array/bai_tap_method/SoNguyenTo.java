package ss4_array.bai_tap_method;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số kiểm tra có phải số nguyên tố không");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(kiemTraSoNguyenTo(number));
    }
    public static boolean kiemTraSoNguyenTo(int number){
        if (number<2){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
