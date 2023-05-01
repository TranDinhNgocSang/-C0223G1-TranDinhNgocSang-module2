package FuramaResort.repository;

import FuramaResort.model.Facility;
import FuramaResort.model.House;
import FuramaResort.model.Room;
import FuramaResort.model.Villa;
import FuramaResort.utils.ReadAndWriteHouseFile;
import FuramaResort.utils.ReadAndWriteRoomFile;
import FuramaResort.utils.ReadAndWriteVillaFile;
import FuramaResort.utils.RentalType;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static Map<Villa, Integer> villaMap = new LinkedHashMap<>();
    private static Map<House, Integer> houseMap = new LinkedHashMap<>();
    private static Map<Room, Integer> roomMap = new LinkedHashMap<>();
    ReadAndWriteVillaFile readAndWriteVillaFile = new ReadAndWriteVillaFile();
    ReadAndWriteHouseFile readAndWriteHouseFile = new ReadAndWriteHouseFile();
    ReadAndWriteRoomFile readAndWriteRoomFile = new ReadAndWriteRoomFile();
    private final String VILLA_FILE_PATH =
            "E:\\CodeGym\\my-new-project\\-C0223G1-TranDinhNgocSang-module2\\src\\FuramaResort\\data\\villa_data.csv";
    private final String HOUSE_FILE_PATH =
            "E:\\CodeGym\\my-new-project\\-C0223G1-TranDinhNgocSang-module2\\src\\FuramaResort\\data\\house_data.csv";
    private final String ROOM_FILE_PATH =
            "E:\\CodeGym\\my-new-project\\-C0223G1-TranDinhNgocSang-module2\\src\\FuramaResort\\data\\room_data.csv";


    public Map<Villa, Integer> getVillaMap() {
        return villaMap = readAndWriteVillaFile.read(VILLA_FILE_PATH);
    }

    @Override
    public Map<House, Integer> getHouseMap() {
        return houseMap = readAndWriteHouseFile.read(HOUSE_FILE_PATH);
    }

    @Override
    public Map<Room, Integer> getRoomMap() {
        return roomMap = readAndWriteRoomFile.read(ROOM_FILE_PATH);
    }


    @Override
    public void addNewVilla(Villa villa) {
        villaMap = readAndWriteVillaFile.read(VILLA_FILE_PATH);
        villaMap.put(villa, 0);
        readAndWriteVillaFile.write(VILLA_FILE_PATH, villaMap);
    }

    @Override
    public void addNewHouse(House house) {
        houseMap = readAndWriteHouseFile.read(HOUSE_FILE_PATH);
        houseMap.put(house, 0);
        readAndWriteHouseFile.write(HOUSE_FILE_PATH, houseMap);
    }

    @Override
    public void addNewRoom(Room room) {
        roomMap = readAndWriteRoomFile.read(ROOM_FILE_PATH);
        roomMap.put(room, 0);
        readAndWriteRoomFile.write(ROOM_FILE_PATH, roomMap);
    }

    public boolean checkIdServiceVilla(String id) {
        villaMap = readAndWriteVillaFile.read(VILLA_FILE_PATH);
        Set<Villa> villaSet = villaMap.keySet();
        for (Facility r : villaSet) {
            if (r.getIdService().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkIdServiceHouse(String id) {
        houseMap = readAndWriteHouseFile.read(HOUSE_FILE_PATH);
        Set<House> houseSet = houseMap.keySet();
        for (Facility r : houseSet) {
            if (r.getIdService().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkIdServiceRoom(String id) {
        roomMap = readAndWriteRoomFile.read(ROOM_FILE_PATH);
        Set<Room> roomSet = roomMap.keySet();
        for (Room r : roomSet) {
            if (r.getIdService().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayListFacilityMaintenance() {
        Set<Villa> villaSet = villaMap.keySet();
        for (Villa v : villaSet) {
            if (villaMap.get(v) >= 5) {
                System.out.println(v);
            }
        }
        Set<House> houseSet = houseMap.keySet();
        for (House h : houseSet) {
            if (houseMap.get(h) >= 5) {
                System.out.println(h);
            }
        }
        Set<Room> roomSet = roomMap.keySet();
        for (Room r : roomSet) {
            if (roomMap.get(r) >= 5) {
                System.out.println(r);
            }
        }

    }
}
