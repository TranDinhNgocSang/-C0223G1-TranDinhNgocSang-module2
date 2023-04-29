package FuramaResort.model;

import FuramaResort.utils.RentalType;

public class Room extends Facility {
    private String freeService;

    public Room(String idService, String nameService, String area, String maximumPeople, RentalType rentalType, String freeService) {
        super(idService, nameService, area, maximumPeople, rentalType);
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
        return " Room {" + super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
}
