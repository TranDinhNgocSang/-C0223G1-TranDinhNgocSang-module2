package ss5_lop_va_doi_tuong.bai_tap.bai_tap_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("phương trình bậc 2 có dạng ax^2 +bx +c =0");
        System.out.print("nhập a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("nhập b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("nhập c: ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation calculator = new QuadraticEquation(a,b,c);
        if (calculator.getDiscriminant()>0){
            System.out.println("phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = "+calculator.getRoot1()+"  và x2 = "+calculator.getRoot2());
        }else if (calculator.getDiscriminant() ==0){
            System.out.println("phương trình có nghiệm kép:");System.out.println("phương trình có nghiệm kép:");
            System.out.println("x1 = x2 = "+calculator.getRoot1());
        }else {
            System.out.println("phương trình vô nghiệm");
        }
        if (a ==0){
            System.out.println("bạn vừa nhập phương trình bậc 1, vui lòng nhập a # 0");
        }
    }
}
