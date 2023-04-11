package ss8_abstract_interface.bai_tap.bai_tap_1;

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        System.out.println(shape1.color);
        shape1.test();

        System.out.println("test Circle");
        Circle circle = new Circle(1);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        circle.Resizeable(100);
//        circle.Resizeable(Math.random()*100);
        System.out.println(circle.getRadius());
        circle.getRadius();
        System.out.println(circle.getArea());

        System.out.println("-------------");

        System.out.println("test Rectanggle");
        Rectangle rectangle = new Rectangle(5, 2);
        System.out.println(rectangle.getArea());
        rectangle.Resizeable(100);
        System.out.println(rectangle.getArea());
        Shape[] arr = new Shape[]{circle, rectangle};

        System.out.println("----------------------------------------");

        for (Shape a : arr) {
            if (a instanceof Circle) {
                Circle c = (Circle) a;
                System.out.println("đường kính hình tròn: " + c.getRadius());
                System.out.println("diện tích hình tròn" + c.getArea());
            } else if (a instanceof Rectangle) {
                Rectangle r = (Rectangle) a;
                System.out.println("chiều rộng hcn: " + r.getWidth());
                System.out.println("chiều dài hcn: " + r.getLength());
                System.out.println("diện tích hcnL " + r.getArea());
            }
        }
    }
}
