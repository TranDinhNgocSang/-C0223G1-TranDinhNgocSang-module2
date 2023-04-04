package ss3_loop.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        System.out.println("in hình chữ nhật");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("In hình tam giác cân");
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num * 2 - 1; j++) {
                if (j <= num - i || j >= num + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
