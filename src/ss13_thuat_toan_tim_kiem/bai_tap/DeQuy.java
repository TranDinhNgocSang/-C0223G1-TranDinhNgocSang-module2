package ss13_thuat_toan_tim_kiem.bai_tap;
import java.util.Arrays;

public class DeQuy {
    public static void main(String[] args) {
        int[] list = {1,3,6,5,2,4,9,7,8};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int size = list.length - 1;
        System.out.println(binarySearch(list, 0, size, 7));

    }

    static int binarySearch(int[] list, int left, int right, int key) {
        int mid = (left + right) / 2;
        if (key < list[mid]) {
            right = mid - 1;
        } else if (key == list[mid]) {
            return mid;
        } else if (key > list[mid]) {
            left = mid + 1;
        }
        if (left > right) {
            return -1;
        }
        return binarySearch(list, left, right, key);
    }
}


