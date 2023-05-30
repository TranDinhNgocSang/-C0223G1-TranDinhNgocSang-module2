package quan_ly_trai_cay.model;

public class Fruit {
    private String id;
    private String name;
    private String price;
    private String date;
    private String quality;

    public Fruit() {
    }

    public Fruit(String id, String name, String price, String date, String quality) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
        this.quality = quality;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", date='" + date + '\'' +
                ", quality='" + quality + '\'' +
                '}';
    }

    public String getInToCsv(){
        return this.id+","+this.name+","+ this.price+","+this.date+","+this.quality;
    }
}
