package ss19_thuat_toan.bai_tap9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 1, 4, 7, 9, 2, 0, 4, 9, 5, 7};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < arr[arr.length - 1]) {
                System.out.println("số lớn thứ 2 trong mảng là: " + arr[i]);
                break;
            }
        }
    }
}
