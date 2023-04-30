package ss19_thuat_toan.bai_tap5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println("mảng cho trước");
        System.out.println(numbers);
        System.out.println("nhập một số nguyên bất kỳ");
        int input = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numbers.size(); i++) {
            int index = numbers.indexOf(input-numbers.get(i));
            if (index!=-1){
                System.out.println(i+" và "+index+" là vị trí 2 số trong mảng ("
                        +numbers.get(i)+","+numbers.get(index)+") có tổng bằng "+input);
                numbers.remove(index);
            }
        }
    }
}
