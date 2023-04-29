package FuramaResort.model;

import FuramaResort.utils.RentalType;

public class Villa extends Facility{
    private String standard;
    private String poolArea;
    private String numberOfFloors;

    public Villa() {
    }

    public Villa(String idService, String nameService, String area, String price, String maximumPeople,
                 RentalType rentalType, String standard, String poolArea, String numberOfFloors) {
        super(idService, nameService, area, price, maximumPeople, rentalType);
        this.standard = standard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
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

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                "| standard='" + standard + '\'' +
                "| poolArea='" + poolArea + '\'' +
                "| numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
}
