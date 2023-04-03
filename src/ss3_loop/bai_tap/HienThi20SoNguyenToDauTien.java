package ss3_loop.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println("nhập số lượng số nguyên tố cần in ra");
        Scanner sc= new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int count = 0;
        boolean isPrime = true;
        for (int i = 2; i <100 ; i++) {
            for (int j = 1; j <i; j++) {
                if (i%j==0){
                    isPrime = false;
                }
                if (isPrime){
                    System.out.println(i);
                }

            }
        }
        }
    }
