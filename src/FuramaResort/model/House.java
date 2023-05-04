package FuramaResort.model;

import FuramaResort.utils.RentalType;

import java.util.Objects;

public class House extends Facility {
    private String standard;
    private String numberOfFloors;

    public House() {
    }

    public House(String idService, String nameService, String area, String price, String maximumPeople,
                 RentalType rentalType, String standard, String numberOfFloors) {
        super(idService, nameService, area, price, maximumPeople, rentalType);
        this.standard = standard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String numberOfFloors() {
        return numberOfFloors;
    }

    public void setPoolArea(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "| standard='" + standard + '\'' +
                "| poolArea='" + numberOfFloors + '\'' +
                '}';
    }

    public String getInToCsv() {
        return super.getIdService() + "," + super.getNameService() + "," + super.getArea() + "," + super.getPrice() + "," +
                super.getMaximumPeople() + "," + super.getRentalType() + "," + this.standard + "," + this.numberOfFloors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return this.getIdService().equals(house.getIdService());
    }

    @Override
    public int hashCode() {
        return Objects.hash(standard, numberOfFloors);
    }

}
