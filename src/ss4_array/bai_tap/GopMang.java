package ss4_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = new String[3];
        String[] arr2 = new String[3];
        String[] arr3 = new String[6];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhập phần tử thứ "+i+ " của mảng 1");
            arr1[i] = sc.nextLine();
        }
        System.out.println("mảng 1: "+ Arrays.toString(arr1));
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("nhập phần tử thứ "+i+ " của mảng 2");
            arr2[i] = sc.nextLine();
        }
        System.out.println("mảng 2: "+ Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[i-arr1.length];
        }
        System.out.println("mảng 3: "+ Arrays.toString(arr3));
    }
}

