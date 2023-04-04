package ss4_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập phần tử số nguyên cần thêm vào mảng");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vị trí thêm vào ( < 8 )");
        int index = Integer.parseInt(sc.nextLine());
        if (index < 0 || index >= arr.length - 1) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            for (int i = arr.length - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = num;
            System.out.println(Arrays.toString(arr));
        }
    }
}
