package ss3_loop.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số kiểm tra có phải là số nguyên tố hay không: ");
        number = Integer.parseInt(sc.nextLine());
        boolean isPrime = true;
        if (number<2){
            System.out.println(number+" không là số nguyên tố");
        }else {
            for (int i = 2; i <Math.sqrt(number); i++) {
               if (number%i==0){
                   isPrime = false;
                   break;
               }
            }
        }
        if (isPrime){
            System.out.println(number+" là số nguyên tố");
        }else {
            System.out.println(number+ " không là số nguyên tố");
        }
    }
}
