package ss11_stack_queue.bai_tap;

import java.util.Objects;
import java.util.Stack;

public class bai_tap_4 {
    public static void main(String[] args) {
        Stack<String> symOpen = new Stack<>();
        Stack<String> symClose = new Stack<>();
        String input = "a*(b-c(s+b))";
        String str[] = input.split("");
        boolean flag = true;
        for (int i = 0; i < str.length; i++) {
            if (Objects.equals(str[i], "(")) {
                symOpen.push(str[i]);
            }
            if (Objects.equals(str[i], ")")) {
                symClose.push(str[i]);
            }
            if (symOpen.size() < symClose.size()) {
                flag = false;
                break;
            }
        }
        if (flag && symOpen.size() == symClose.size()) {
            System.out.println("ok");
        } else System.out.println("no");
    }
}
