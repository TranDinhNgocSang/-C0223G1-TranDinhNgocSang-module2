package ss4_array.bai_tap_method;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printFibonacci()));

    }

    public static int[] printFibonacci() {
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 1;
        while (c < 100) {
            c = a + b;
            a = b;
            b = c;
            count++;
        }
        int[] fibonacci = new int[count];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}
