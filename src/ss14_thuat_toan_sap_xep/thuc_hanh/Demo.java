package ss14_thuat_toan_sap_xep.thuc_hanh;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String s = "CodegymDaNang";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z' && i > 0) {
                str += " ";
            }
            str += s.toLowerCase().charAt(i);

        }
        System.out.println(str);
    }
}