package ss2_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        double height;
        double weight;
        double bmi;
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều cao (m): ");
        height = scanner.nextDouble();
        System.out.print("nhập cân nặng (kg): ");
        weight = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("chỉ số bmi của bạn là: " + bmi);
        if (bmi < 18)
            System.out.println("Underweight");
        else if (bmi < 25.0)
            System.out.println("Normal");
        else if (bmi < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
