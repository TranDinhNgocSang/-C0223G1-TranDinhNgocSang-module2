package ss18_string_regex.bai_tap.bai_tap_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberPhoneExample {
    public static void main(String[] args) {
        final String CLASS_REGEX = "^[(](84)[)]-[(][0]\\d{9}[)]$";
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.println("nhập 0 để kết thúc");
            System.out.println("nhập sdt kiểm tra");
            str = sc.nextLine();
            System.out.println(Pattern.matches(CLASS_REGEX, str));
        } while (!str.equals("0"));
    }
}
