package ss11_stack_queue.bai_tap;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class bai_tap_3 {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        if (checkPalindrome(str)) {
            System.out.println("no");
        } else {
            System.out.println("oke");
        }
    }

    public static boolean checkPalindrome(String str) {
        String newString = str.toLowerCase();
        str.toLowerCase();
        String[] arrString = newString.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < arrString.length; i++) {
            stack.push(arrString[i]);
            queue.offer(arrString[i]);
        }
        for (int i = 0; i < arrString.length; i++) {
            if (!stack.pop().equals(queue.remove())) {
                return true;
            }
        }
        return false;
    }
}
