package ss5_lop_va_doi_tuong.bai_tap.bai_tap_3;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setOn(false);

        System.out.println("Fan 1 - " +fan1.toString());
        System.out.println("Fan 2 - " +fan2.toString());
    }
}
