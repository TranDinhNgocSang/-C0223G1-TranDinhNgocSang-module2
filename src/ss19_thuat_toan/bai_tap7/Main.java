package ss19_thuat_toan.bai_tap7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Lambda Expressions were added in Java 8";
        System.out.println(str);
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));
        Arrays.sort(charArray);
        String newString = new String(charArray);
        System.out.println(newString);
    }
}
