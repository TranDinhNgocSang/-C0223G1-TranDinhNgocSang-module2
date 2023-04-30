package ss19_thuat_toan.bai_tap3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listFibonacci = new ArrayList<>();
        listFibonacci.add(0);
        listFibonacci.add(1);
        for (int i = 2; i >0 ; i++) {
            int fibonacci = listFibonacci.get(i-1)+listFibonacci.get(i-2);
            if (fibonacci>=100){
                break;
            }
            listFibonacci.add(fibonacci);
        }
        System.out.println(listFibonacci);
    }
}
