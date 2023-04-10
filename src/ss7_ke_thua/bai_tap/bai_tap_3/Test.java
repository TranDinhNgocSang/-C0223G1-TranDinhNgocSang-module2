package ss7_ke_thua.bai_tap.bai_tap_3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("test Poin");
        Point point = new Point(4, 4);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point);
        point.setXY(2, 2);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point);

        System.out.println("----------------------------------");

        System.out.println("test MoveablePoint ");
        MoveablePoint moveablePoint = new MoveablePoint(2, 2, 2, 2);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
