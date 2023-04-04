package ss4_array.bai_tap;

import java.util.Scanner;

public class TimPhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i <arr.length; i++) {
            System.out.println("nhập phần tử thứ "+i+" của mảng");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int min = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("giá trị nhỏ nhất của mảng là: "+min);
    }
}
