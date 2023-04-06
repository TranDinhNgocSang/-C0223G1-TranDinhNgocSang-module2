package ss5_lop_va_doi_tuong.bai_tap.bai_tap_1;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return 0;
        }
    }
}
