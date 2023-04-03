package ss3_loop.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("in hình chữ nhật");
        String stringHinhChuNhat = "";
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 10; j++) {
                stringHinhChuNhat += "*";

            }
            stringHinhChuNhat +="\n";
        }
        System.out.println(stringHinhChuNhat);
        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left");
        String stringHinhTamGiac = "";
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <= i; j++) {
                stringHinhTamGiac += "*";

            }
            stringHinhTamGiac +="\n";
        }
        System.out.println(stringHinhTamGiac);
        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left");
        String stringHinhTamGiac2 = "";
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                stringHinhTamGiac2 += "*";

            }
            stringHinhTamGiac2 +="\n";
        }
        System.out.println(stringHinhTamGiac2);
        System.out.println("In hình tam giác cân");
        String stringHinhTamGiacCan = "";
        int a =3;
        for (int i = 3; i > 0; i++) {
            for (int j = 0; j < 3*2-1; j++) {
                if (j<i-1){
                    stringHinhTamGiac2 += " ";
                }else {
                    stringHinhTamGiac2 += "*";
                }
            }
            stringHinhTamGiac2 +="\n";
        }
        System.out.println(stringHinhTamGiac2);
    }
}
