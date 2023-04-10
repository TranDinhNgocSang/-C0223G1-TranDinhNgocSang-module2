package ss7_ke_thua.thuc_hanh;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(Math.PI * this.radius * this.radius * 100) / 100.0;
    }

    public double getPerimeter() {
        return Math.round(Math.PI * this.radius * 2 * 100) / 100.0;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }
}
