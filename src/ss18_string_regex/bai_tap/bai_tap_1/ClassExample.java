package ss18_string_regex.bai_tap.bai_tap_1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ClassExample {
    public static void main(String[] args) {
        final String CLASS_REGEX= "^[CAP]\\d{4}[GHIK]$";
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.println("nhập 0 để kết thúc");
            System.out.println("nhập tên lớp kiểm tra");
            str = sc.nextLine();
            System.out.println(Pattern.matches(CLASS_REGEX,str));
        }while (!str.equals("0"));
    }
}
