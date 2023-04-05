package ss4_array.bai_tap_method;

import java.util.Arrays;
import java.util.Scanner;

public class UocChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số để hiển thị ước");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("các ước của "+number+" là: "+Arrays.toString(timUoc(number)));
    }

    public static int[] timUoc(int number) {
        int cout = 0;
        int [] arr = new int[number];
        int j =0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                cout++;
                arr[j]=i;
                j++;
            }
        }
        int[] uoc = new int[cout];
        for (int i = 0; i < uoc.length; i++) {
            uoc[i]=arr[i];
        }
        return uoc;
    }
}
