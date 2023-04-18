package ss13_thuat_toan_tim_kiem.bai_tap;

public class DeQuy {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int size = list.length - 1;
        System.out.println(binarySearch(list, 0, size, 70));

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


