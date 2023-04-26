package FuramaResort.model;

import FuramaResort.utils.RentalType;

public abstract class Facility {
    private String idService;
    private String nameService;
    private double area;
    private double maximumPeople;
    public RentalType rentalType;

    public Facility() {
    }

    public Facility(String idService, String nameService, double area, double maximumPeople, RentalType rentalType) {
        this.idService = idService;
        this.nameService = nameService;
        this.area = area;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(double maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", maximumPeople=" + maximumPeople +
                ", rentalType=" + rentalType +
                '}';
    }
}
