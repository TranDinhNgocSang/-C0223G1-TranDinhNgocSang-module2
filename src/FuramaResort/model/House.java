package FuramaResort.model;

import FuramaResort.utils.RentalType;

public class House extends  Facility{
    private String standard;
    private String poolArea;

    public House() {
    }

    public House(String idService, String nameService, String area, String maximumPeople, RentalType rentalType,
                 String standard, String poolArea) {
        super(idService, nameService, area, maximumPeople, rentalType);
        this.standard = standard;
        this.poolArea = poolArea;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return " House {" + super.toString()+
                "standard='" + standard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                '}';
    }
}
