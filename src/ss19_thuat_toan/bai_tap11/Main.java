package ss19_thuat_toan.bai_tap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên");
        int num = 0;
        boolean flag;
        do {
            flag = false;
            try {
                num = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("nhập sai mời nhập lại");
                flag = true;
            }
        } while (flag);
        System.out.println(divisonCommon(num));
    }

    public static List<Integer> divisonCommon(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

}
