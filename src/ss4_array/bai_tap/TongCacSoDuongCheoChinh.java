package ss4_array.bai_tap;

public class TongCacSoDuongCheoChinh {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4, 5, 1},
                {5, 3, 4, 2, 1},
                {9, 8, 7, 2, 1},
                {9, 8, 7, 2, 1},
                {9, 8, 7, 2, 1},

        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    total += arr[i][i];
                }
                if (j == (arr.length - 1 - i)) {
                    total += arr[i][j];
                }
            }
        }
        if (arr.length % 2 != 0) {
            total = total - arr[(arr.length - 1) / 2][(arr.length - 1) / 2];
        }
        System.out.println("tổng các số ở 2 đường chéo của hình vuông là: " + total);
    }
}
