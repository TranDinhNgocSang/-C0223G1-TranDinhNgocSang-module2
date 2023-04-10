package ss6_access_modifier_static.thuc_hanh.nhap;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setFilled("black");
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        System.out.println();
    }
}
