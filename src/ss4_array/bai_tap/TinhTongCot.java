package ss4_array.bai_tap;

import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4, 5, 2},
                {5, 3, 4, 2, 2},
                {9, 8, 7, 2, 2},
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vị trí cột cần tính tổng: ");
        int sumColum = Integer.parseInt(sc.nextLine());
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == sumColum) {
                    total += arr[i][j];
                }
            }
        }
        System.out.println("tổng cột thứ " + sumColum + " là: " + total);
    }
}
