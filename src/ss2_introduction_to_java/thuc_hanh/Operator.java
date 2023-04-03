package ss2_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        float width;
        float height;
        float area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều rộng: ");
        width = scanner.nextFloat();
        System.out.print("nhập chiều cao: ");
        height = scanner.nextFloat();
        area = width * height;
        System.out.println("diện tích hình chữa nhật là: " + area);
    }
}