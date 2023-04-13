package ss10_dsa_danh_sach.bai_tap.bai_tap_1;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        System.out.println("mảng đầu vào");
        MyList<Integer> arrList = new MyList<Integer>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.disPlay();
        System.out.println();
        System.out.println("mảng sau khi thêm");
        arrList.addToIndex(2, 8);
        arrList.disPlay();
        System.out.println();
        System.out.println("lấy phần tử của mảng");
        System.out.println(arrList.get(3));
        System.out.println("mảng sau khi xóa");
        arrList.remove(3);
        arrList.disPlay();
    }
}
