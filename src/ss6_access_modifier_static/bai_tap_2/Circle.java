package ss6_access_modifier_static.bai_tap_2;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        //làm tròn 2 chữ số
        return Math.round(Math.PI * Math.pow(this.radius, 2) * 100) / 100.0;

    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return "Circle" + "radius=" + this.radius + ", color='" + this.color + "' , area= " + getArea();
    }
}
