package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinhHoaThuatToanSapXepChen {
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
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            boolean flag = true;
            System.out.println(Arrays.toString(array));
            System.out.println("xét vị trí thứ "+i+" về trước");
            System.out.println("gán " + array[i] + " ở vị trí thứ " + i + " vào x");
            x = array[i];
            System.out.println("x = " + x);
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println("vì "+x+" bé hơn "+array[pos - 1]+ " (ở vị trí thứ " + (pos - 1) +") nên gán " +
                        array[pos - 1] + " đè lên " + array[pos] + " (ở vị trí thứ " + pos+")");
                array[pos] = array[pos - 1];
                System.out.println(Arrays.toString(array));
                pos--;
                flag = false;
            }
            if (flag) {
                System.out.println("các phần tử ở trước đã xếp đúng");
            }
            System.out.println("gán lại x = " + x + " vào vị trí " + pos);
            array[pos] = x;
            System.out.println(Arrays.toString(array));
            System.out.println("-----------------------------");
        }
    }
}
