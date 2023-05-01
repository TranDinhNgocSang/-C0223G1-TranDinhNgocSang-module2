package FuramaResort.model;

import FuramaResort.utils.RentalType;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String idService, String nameService, String area, String price, String maximumPeople,
                RentalType rentalType, String freeService) {
        super(idService, nameService, area, price, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "| freeService='" + freeService + '\'' +
                '}';
    }

    public String getInToCsv() {
        return super.getIdService() + "," + super.getNameService() + "," + super.getArea() + "," + super.getPrice() + "," +
                super.getMaximumPeople() + "," + super.getRentalType() + "," + this.freeService;
    }
}
