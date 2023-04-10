package ss7_ke_thua.thuc_hanh;

public class Retangle extends Shape {
    protected double width;
    protected double heigth;

    public Retangle() {
        this.width = 1.0;
        this.heigth = 1.0;
    }

    public Retangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Retangle(String color, boolean filled, double width, double heigth) {
        super(color, filled);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getArea() {
        return this.width * this.heigth;
    }

    public double getPerimeter() {
        return (this.width + this.heigth) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + getWidth() + " and length=" + getHeigth()
                + ", which is a subclass of "
                + super.toString();
    }
}
