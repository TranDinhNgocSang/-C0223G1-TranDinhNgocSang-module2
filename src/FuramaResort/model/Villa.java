package FuramaResort.model;

import FuramaResort.utils.RentalType;

import java.util.Objects;

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

    public String getInToCsv(){
        return super.getIdService()+","+super.getNameService()+","+super.getArea()+","+super.getPrice()+","+
                super.getMaximumPeople()+","+super.getRentalType()+","+this.standard+","+this.getPoolArea()+","+
                this.numberOfFloors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villa villa = (Villa) o;
        return this.getIdService().equals(villa.getIdService());
    }

    @Override
    public int hashCode() {
        return Objects.hash(standard, poolArea, numberOfFloors);
    }
}
