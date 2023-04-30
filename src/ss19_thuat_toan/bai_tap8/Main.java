package ss19_thuat_toan.bai_tap8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số nguyên: ");
        int number = Integer.parseInt(sc.nextLine());
        int reverseNumber = 0;
        while (number > 0) {
            int n = number % 10;
            reverseNumber = reverseNumber * 10 + n;
            number = number / 10;
        }
        System.out.println("số sau khi đảo là: " + reverseNumber);
    }
}
