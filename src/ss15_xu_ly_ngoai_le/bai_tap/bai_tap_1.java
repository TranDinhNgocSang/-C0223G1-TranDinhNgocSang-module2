package ss15_xu_ly_ngoai_le.bai_tap;

import java.util.Scanner;

public class bai_tap_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhập vào độ dài cạnh thứ nhất: ");
        a = scanner.nextDouble();
        System.out.print("Nhập vào độ dài cạnh thứ hai: ");
        b = scanner.nextDouble();
        System.out.print("Nhập vào độ dài cạnh thứ ba: ");
        c = scanner.nextDouble();

        try {
            validateTriangle(a, b, c);
            System.out.println("Tam giác hợp lệ");
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }

    public static void validateTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Các cạnh tam giác phải là số dương");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại");
        }
    }
}

