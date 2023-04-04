package ss4_array.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        double[][] arr = new double[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhập phần tử thứ "+"["+i+"]["+j+"]"+ " của mảng");
                arr[i][i] = Double.parseDouble(sc.nextLine());
            }
        }
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("giá trị lớn nhất của mảng là: "+max);
    }
}

