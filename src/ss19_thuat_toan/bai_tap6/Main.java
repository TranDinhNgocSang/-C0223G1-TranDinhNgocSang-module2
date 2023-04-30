package ss19_thuat_toan.bai_tap6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chuỗi cho trước: ");
        String string = "Choice is more important than effort\n\n";
        System.out.println(string);

        System.out.print("nhập ký tự cần đếm số lần xuất hiện: ");
        Character character = sc.nextLine().charAt(0);
        int cout = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                cout++;
            }
        }
        System.out.println("số lần xuất hiện ký tự " + character + " trong chuỗi là " + cout + " lần");
    }
}

