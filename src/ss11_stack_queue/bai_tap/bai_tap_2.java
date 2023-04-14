package ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class bai_tap_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("có hệ nhị phân là: " + Arrays.toString(binaryNumber(number)));
    }

    public static int[] binaryNumber(int number) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int i;
        while (number > 0) {
            i = number % 2;
            number = (number - i) / 2;
            count++;
            stack.push(i);
        }
        int[] arr = new int[count];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = stack.pop();
        }
        return arr;
    }
}
