package ss7_ke_thua.bai_tap.bai_tap_1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("kiểm tra Point2D");
        Point2D point2D = new Point2D(2, 3);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D);
        point2D.setXY(5, 5);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D);

        System.out.println("------------------------------------------");

        System.out.println("kiểm tra Point3D");
        Point3D point3D = new Point3D(1,1,1);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
        point3D.setXY(2,2);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
        point3D.setXYZ(5,5,5);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
    }
}
