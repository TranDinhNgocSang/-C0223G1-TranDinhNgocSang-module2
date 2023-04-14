package ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class bai_tap_1 {
    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3, 4, 5};
        System.out.println("mảng trước khi đảo" + Arrays.toString(arrInt));
        int[] ints = swapString(arrInt);
        System.out.println("mảng sau khi đảo" + Arrays.toString(ints));

        System.out.println("-------------------------");

        String str = "Trần Đình Ngọc Sang";
        System.out.println("chuỗi trước khi đảo: " + str);
        swapString(str);
        System.out.println("chuỗi sau khi đảo: " + swapString(str));
    }

    public static int[] swapString(int[] arrInt) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arrInt.length; i++) {
            stack.push(arrInt[i]);
        }
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = stack.pop();
        }
        return arrInt;
    }

    public static String swapString(String str) {
        Stack<String> wStack = new Stack<>();
        String[] arrString = str.split(" ");
        for (int i = 0; i < arrString.length; i++) {
            wStack.push(arrString[i]);
        }
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = wStack.pop();
        }
        return String.join(" ", arrString);
    }
}
