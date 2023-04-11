package ss8_abstract_interface.bai_tap.bai_tap_1;

public class Circle extends Shape implements IResizeable{
    private double radius = 1.0;
    public String color = "red";
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void test() {
        System.out.println("circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(radius * radius * Math.PI*100)/100.0;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void Resizeable(double percent) {
        this.radius = this.radius*(1+percent/100);
    }
}
