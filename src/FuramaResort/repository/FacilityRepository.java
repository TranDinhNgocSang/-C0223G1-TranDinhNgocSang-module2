package FuramaResort.repository;

import FuramaResort.model.Facility;
import FuramaResort.model.House;
import FuramaResort.model.Room;
import FuramaResort.model.Villa;
import FuramaResort.utils.RentalType;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository{
    private static Map<Facility,Integer> facilityMap = new LinkedHashMap<>();
    static {
        Villa villa = new Villa("SVVL-0001","Ten sv","30","20", RentalType.Day,
                "aaaaa","10","2");
        House house = new House("SVVL-0001","Ten sv","30","20", RentalType.Day,
                "aaaaa","10");
        Room room = new Room("SVVL-0001","Ten sv","30","20", RentalType.Day,
                "aaaaa");
        facilityMap.put(villa,0);
        facilityMap.put(house,0);
        facilityMap.put(room,0);
    }
    public Map<Facility,Integer> getFacilityMap(){
        return  facilityMap;
    }
}
