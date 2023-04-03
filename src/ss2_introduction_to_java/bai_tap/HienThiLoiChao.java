package ss2_introduction_to_java.bai_tap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name: ");
        name = scanner.nextLine();
        System.out.println("hello: " + name);
    }
}

