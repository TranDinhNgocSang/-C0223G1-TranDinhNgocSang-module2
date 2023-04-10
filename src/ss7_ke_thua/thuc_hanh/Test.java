package ss7_ke_thua.thuc_hanh;

public class Test {
    public static void main(String[] args) {
        System.out.println("kiêm tra Shape");
        Shape shape = new Shape();
        System.out.println(shape.toString());
        shape = new Shape("blue", false);
        System.out.println(shape.toString());

        System.out.println("-----------------------");

        System.out.println("kiểm tra Cỉcle");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);

        System.out.println("--------------------------");

        System.out.println("kiểm tra Retangle");
        Retangle rectangle = new Retangle();
        System.out.println(rectangle);
        rectangle = new Retangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Retangle("orange", true, 5, 3);
        System.out.println(rectangle);

        System.out.println("----------------------------");

        System.out.println("kểm tra Square");
        Square square;
        square = new Square(2);
        System.out.println(square);
        System.out.println("Area is: "+square.getArea());
        square = new Square("yellow", true, 5);
        System.out.println(square);
        System.out.println("Area is: "+square.getArea());
    }
}

