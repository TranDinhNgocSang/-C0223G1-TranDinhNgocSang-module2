package ss2_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {

    public static void main(String[] args) {
        System.out.println("phương tình bậc 1 có dạng ax + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("nhập c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("phương trình có nghiệm x = " + answer);
        }
        if (a == 0) {
            if (b == c) {
                System.out.println("phương trình đúng với mọi x");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        }
    }
}