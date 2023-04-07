package ss5_lop_va_doi_tuong.bai_tap.bai_tap_2;

public class Main {
    public static void main(String[] args) {
        StopWatch clock = new StopWatch();
        clock.start();
        System.out.println(clock.getStartTime());
        for (int i = 0; i < 1000000000; i++) {
            for (int j = 0; j < 25; j++) {
                for (int k = 0; k < 5; k++) {

                }

            }

        }
        clock.stop();
        System.out.println(clock.getEndTime());
        System.out.println("thời gian thực hiện thuật toán là: " + clock.getElapsedTime() + " ");
    }
}
