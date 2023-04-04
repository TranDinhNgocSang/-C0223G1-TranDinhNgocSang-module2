package ss3_loop.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println("nhập số lượng số nguyên tố cần in ra");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 2; i > 1; i++) {
            boolean isPrime = true;
            for (int j = 2; j <i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                count++;
            }
            if (count == number) {
                break;
            }
        }
    }
}
