package ss19_thuat_toan.bai_tap13.model;

public class Computer {
    private String id;
    private String name;
    private double price;
    private String date;

    public Computer() {
    }

    public Computer(String id, String name, double price, String date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }

    public String getToCsv() {
        return this.id + "," + this.name + "," + this.price + "," + this.date;
    }
}
