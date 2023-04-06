package ss5_lop_va_doi_tuong.bai_tap.bai_tap_3;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {

        return this.speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "Fan is on: " + "speed " + this.speed + ", color " + this.color + ", radius " + this.radius;
        } else {
            return "Fan is off: " + "color " + this.color + ", radius " + this.radius;
        }
    }
}
