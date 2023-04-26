package ss18_string_regex.bai_tap.bai_tap_1;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        TreeSet<Integer> list = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                list.add(a[i]);
            }
        }
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=-1){
                a[i] = list.pollFirst();
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
