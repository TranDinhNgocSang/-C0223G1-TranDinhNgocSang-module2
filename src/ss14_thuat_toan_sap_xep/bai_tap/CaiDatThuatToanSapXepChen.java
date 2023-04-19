package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class CaiDatThuatToanSapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("nhập phần tử thứ " + i);
            list[i] = scanner.nextInt();
        }
        System.out.print("mảng vừa nhập là: ");
        System.out.println(Arrays.toString(list));
        System.out.println("\n---------------");
        insertionSort(list);
        System.out.println("mảng sau khi sắp xếp");
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
}

