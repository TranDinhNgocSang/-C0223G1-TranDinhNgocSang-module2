package ss7_ke_thua.bai_tap.bai_tap_2;

public class Test {
    public static void main(String[] args) {
        System.out.println("test Cicle");
        Circle circle = new Circle();
        System.out.println("Area is: " + circle.getArea());
        System.out.println(circle);
        circle = new Circle(2, "blue");
        System.out.println("Area is: " + circle.getArea());
        System.out.println(circle);
        circle.setRadius(-2);
        System.out.println("Area is: " + circle.getArea());
        System.out.println(circle);

        System.out.println("--------------------------");

        System.out.println("test Cylinder ");
        Cylinder cylinder = new Cylinder(2, "red", 3);
        System.out.println("Volume is: " + cylinder.getVolume());
        System.out.println(cylinder);
    }
}
