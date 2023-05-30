package ss19_thuat_toan.bai_tap12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm");
        final String REGEX_YEAR = "^[1-9]\\d*$";
        String year;
        do {
            year = sc.nextLine();
            if (!Pattern.matches(REGEX_YEAR, year)) {
                System.out.println("bạn nhập k đúng, mời nhập lại");
            }
        } while (!Pattern.matches(REGEX_YEAR, year));
        System.out.println(isLeap(Integer.parseInt(year)));

        int a = 5;
        int b =0;
        if(a == 5) {

            ++a;

            b = a++*5;

        }

        System.out.println(a);

        System.out.println(b);
    }

    public static boolean isLeap(int year) {
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }


}
