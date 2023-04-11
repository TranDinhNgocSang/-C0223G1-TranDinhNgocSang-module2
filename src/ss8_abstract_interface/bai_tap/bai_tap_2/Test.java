package ss8_abstract_interface.bai_tap.bai_tap_2;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(4, 2);
        Square square = new Square(5);
//        Rectangle rectangle1 = square;
        Shape[] arr = {circle, rectangle, square};
        for (Shape a : arr) {
            if (a instanceof Square) {
                Rectangle b = (Rectangle) a;
                Square s = (Square) b;
                s.howToColor();
            } else if (a instanceof Circle) {
                System.out.println(((Circle) a).getArea());
            } else if (a instanceof Rectangle) {
                System.out.println(((Rectangle) a).getArea());
            }
        }

    }
}
