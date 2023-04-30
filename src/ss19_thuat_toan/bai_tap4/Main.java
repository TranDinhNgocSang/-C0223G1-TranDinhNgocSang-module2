package ss19_thuat_toan.bai_tap4;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 5; i < 100; i+=5) {
            if (checkPrime(i) && i % 3== 0) {
                System.out.print(i+" ");
                count++;
            }
        }
        if (count==0){
            System.out.println("không có số mô hết á");
        }
    }

    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
