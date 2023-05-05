package FuramaResort.repository;

import FuramaResort.model.Facility;
import FuramaResort.model.House;
import FuramaResort.model.Room;
import FuramaResort.model.Villa;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    Map<Villa, Integer> getVillaMap();

    Map<House, Integer> getHouseMap();

    Map<Room, Integer> getRoomMap();

    void addNewVilla(Villa villa);

    void addNewHouse(House house);

    void addNewRoom(Room room);

    boolean checkIdServiceVilla(String id);

    boolean checkIdServiceHouse(String id);

    boolean checkIdServiceRoom(String id);

    void displayListFacilityMaintenance();

}
