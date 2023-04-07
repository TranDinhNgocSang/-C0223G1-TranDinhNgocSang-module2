package ss6_access_modifier_static.bai_tap_1;

public class Studen {
    private String name = "Jojn";
    private String classes = "C02";

    public Studen() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Studen{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
