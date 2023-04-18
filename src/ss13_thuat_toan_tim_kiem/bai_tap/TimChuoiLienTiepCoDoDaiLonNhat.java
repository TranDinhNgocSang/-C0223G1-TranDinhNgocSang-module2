package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class TimChuoiLienTiepCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> arrayListMax = new ArrayList<>();
        ArrayList<Character> arrayList = new ArrayList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (arrayList.size() > 1 && string.charAt(i) <= arrayList.get(arrayList.size() - 1)) {
                arrayList.clear();
            }
            arrayList.add(string.charAt(i));
            if (arrayList.size() > arrayListMax.size()) {
                arrayListMax.clear();
                arrayListMax.addAll(arrayList);
            }
        }
        for (Character c : arrayListMax) {
            System.out.print(c);
        }
    }
}
