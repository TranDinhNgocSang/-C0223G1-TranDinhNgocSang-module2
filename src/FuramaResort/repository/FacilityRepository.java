package FuramaResort.repository;

import FuramaResort.model.Facility;
import FuramaResort.model.House;
import FuramaResort.model.Room;
import FuramaResort.model.Villa;
import FuramaResort.utils.RentalType;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    static {
        Villa villa = new Villa("SVVL-0001", "Ten sv", "30", "1500", "20",
                RentalType.Day, "aaaaa", "10", "2");
        House house = new House("SVHO-0001", "Ten sv", "30", "1000", "20",
                RentalType.Day, "aaaaa", "10");
        House house1 = new House("SVHO-0002", "Ten sv", "30", "1000", "20",
                RentalType.Day, "aaaaa", "10");
        Room room = new Room("SVRO-0001", "Ten sv", "30", "500", "20",
                RentalType.Day, "aaaaa");
        facilityMap.put(villa, 0);
        facilityMap.put(house, 0);
        facilityMap.put(house1, 6);
        facilityMap.put(room, 5);
    }

    public Map<Facility, Integer> getFacilityMap() {
        return facilityMap;
    }


    @Override
    public void addNewFacility(Facility facility) {
        facilityMap.put(facility, 0);

    }

    public boolean checkIdService(String id) {
        Set<Facility> facilitySet = facilityMap.keySet();
        for (Facility r : facilitySet) {
            if (r.getIdService().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Facility> displayListFacilityMaintenance() {
        List<Facility> facilityMaintenanceList = new ArrayList<>();
        Set<Facility> facilitySet = facilityMap.keySet();
        for (Facility f : facilitySet) {
            if (facilityMap.get(f) >= 5) {
                facilityMaintenanceList.add(f);
            }
        }
        return facilityMaintenanceList;
    }
}
