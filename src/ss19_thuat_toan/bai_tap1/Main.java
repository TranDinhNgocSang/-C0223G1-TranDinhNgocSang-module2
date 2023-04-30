package ss19_thuat_toan.bai_tap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số lượng số nguyên tố cần tính tổng: ");
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int number = 2;
        int sum = 0;
        while (count < n) {
            if (checkPrime(number)) {
                sum += number;
                count++;
                list.add(number);
            }
            number++;
        }
        System.out.println(list);
        System.out.println("tổng các số nguyên số là: " + sum);
    }

    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
