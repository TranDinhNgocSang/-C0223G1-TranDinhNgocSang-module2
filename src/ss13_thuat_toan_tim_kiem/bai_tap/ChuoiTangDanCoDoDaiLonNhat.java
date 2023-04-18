package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuoiTangDanCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        ArrayList<Character> arrayListMax = new ArrayList<>();
        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            arrayList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > arrayList.get(arrayList.size() - 1)) {
                    arrayList.add(string.charAt(j));
                }
            }
            if (arrayList.size() > arrayListMax.size()) {
                arrayListMax.clear();
                arrayListMax.addAll(arrayList);
            }
            arrayList.clear();
        }
        for (Character c : arrayListMax) {
            System.out.print(c);
        }
    }
}
