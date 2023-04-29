package FuramaResort.model;

import FuramaResort.utils.RentalType;

public abstract class Facility {
    private String idService;
    private String nameService;
    private String area;
    private String maximumPeople;
    public RentalType rentalType;

    public Facility() {
    }

    public Facility(String idService, String nameService, String area, String maximumPeople, RentalType rentalType) {
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(String maximumPeople) {
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
        return "idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", maximumPeople=" + maximumPeople +
                ", rentalType=" + rentalType;
    }
}
