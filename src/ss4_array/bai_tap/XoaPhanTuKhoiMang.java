package ss4_array.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 8, 6, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập phần tử cần xóa khỏi mảng");
        int number = Integer.parseInt(sc.nextLine());
        int index = -1;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(index);
            for (int i = index; i < arr.length; i++) {
                if (i < arr.length - 1) {
                    arr[i] = arr[i + 1];
                } else {
                    arr[arr.length - 1] = 0;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ",");
            }
        } else {
            System.out.println("phần tử vừa nhập không có trong mảng");
        }

    }
}
