package FuramaResort.repository;

import FuramaResort.model.*;
import FuramaResort.utils.ReadAndWriteBookingFile;

import java.time.LocalDate;
import java.util.*;

public class BookingRepository implements IBookingRepository {
    private static List<Booking> bookingList = new ArrayList<>();
    private static final String BOOKING_FILE_PATH = "E:\\CodeGym\\my-new-project\\src\\FuramaResort\\data\\booking_data.csv";
    ReadAndWriteBookingFile readAndWriteBookingFile = new ReadAndWriteBookingFile();
    CustomerRepository customerRepository = new CustomerRepository();
    FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public List<String> getIdCustomerList() {
        List<String> idCustomerList = new ArrayList<>();
        for (int i = 0; i < customerRepository.getList().size(); i++) {
            idCustomerList.add(customerRepository.getList().get(i).getId());
        }
        return idCustomerList;
    }

    @Override
    public List<String> getIdServiceList() {
        List<String> idServiceList = new ArrayList<>();
        Set<Villa> villaSet = facilityRepository.getVillaMap().keySet();
        for (Villa v : villaSet) {
            idServiceList.add(v.getIdService());
        }
        Set<House> houseSet = facilityRepository.getHouseMap().keySet();
        for (House h : houseSet) {
            idServiceList.add(h.getIdService());
        }
        Set<Room> roomSet = facilityRepository.getRoomMap().keySet();
        for (Room r : roomSet) {
            idServiceList.add(r.getIdService());
        }
        return idServiceList;
    }

    @Override
    public List<Booking> getBookingList() {
        bookingList = readAndWriteBookingFile.read(BOOKING_FILE_PATH);
        Collections.sort(bookingList, new Comparator<Booking>() {
            @Override
            public int compare(Booking o1, Booking o2) {
                if (o1.getBookingDate().equals(o2.getBookingDate())) {
                    return LocalDate.parse(o2.getRentalEndDate()).compareTo(LocalDate.parse(o1.getRentalEndDate()));
                } else {
                    return LocalDate.parse(o2.getBookingDate()).compareTo(LocalDate.parse(o1.getBookingDate()));
                }
            }
        });
        return bookingList;
    }

    @Override
    public void addNewBooking(Booking booking) {
        bookingList = readAndWriteBookingFile.read(BOOKING_FILE_PATH);
        bookingList.add(booking);
        readAndWriteBookingFile.write(BOOKING_FILE_PATH, bookingList);
    }

    @Override
    public int getIndexToIdBooking(String idBooking) {
        bookingList = readAndWriteBookingFile.read(BOOKING_FILE_PATH);
        for (int i = 0; i < bookingList.size(); i++) {
            if (bookingList.get(i).getIdBooking().equals(idBooking)) {
                return i;
            }
        }
        return -1;
    }

    public void showListFacility() {
        Set<Villa> villaSet = facilityRepository.getVillaMap().keySet();
        int i = 1;
        for (Villa v : villaSet) {
            System.out.println(i + ". " + v);
            i++;
        }
        Set<House> houseSet = facilityRepository.getHouseMap().keySet();
        for (House h : houseSet) {
            System.out.println(i + ". " + h);
            i++;
        }
        Set<Room> roomSet = facilityRepository.getRoomMap().keySet();
        for (Room r : roomSet) {
            System.out.println(i + ". " + r);
            i++;
        }
    }

    public void showlistCustomer() {
        for (int i = 0; i < customerRepository.getList().size(); i++) {
            System.out.println((i + 1) + ". " + customerRepository.getList().get(i));
        }
    }

    //nhap
    public Facility getFacilityBooking(int choice) {
        Set<Villa> villaSet = facilityRepository.getVillaMap().keySet();
        List<Villa> villaList = new ArrayList<>();
        for (Villa v:villaSet) {
            villaList.add(v);
        }
        Set<House> houseSet = facilityRepository.getHouseMap().keySet();
        List<House> houseList = new ArrayList<>();
        for (House h:houseSet) {
            houseList.add(h);
        }
        Set<Room> roomSet = facilityRepository.getRoomMap().keySet();
        List<Room> roomList = new ArrayList<>();
        for (Room r:roomSet) {
            roomList.add(r);
        }
        if (choice <= villaList.size()) {
            return villaList.get(choice - 1);
        } else {
            if ((choice - villaList.size()) <= houseList.size()) {
                return houseList.get(choice - villaList.size() - 1);
            } else {
                return roomList.get(choice - villaList.size() - houseList.size() - 1);
            }
        }

    }

    public int getTypeFacilityBooking(int choice) {
        Set<Villa> villaSet = facilityRepository.getVillaMap().keySet();
        List<Villa> villaList = new ArrayList<>();
        for (Villa v:villaSet) {
            villaList.add(v);
        }
        Set<House> houseSet = facilityRepository.getHouseMap().keySet();
        List<House> houseList = new ArrayList<>();
        for (House h:houseSet) {
            houseList.add(h);
        }
        Set<Room> roomSet = facilityRepository.getRoomMap().keySet();
        List<Room> roomList = new ArrayList<>();
        for (Room r:roomSet) {
            roomList.add(r);
        }
        if (choice <= villaList.size()) {
            return 1;
        } else {
            if ((choice - villaList.size()) <= houseList.size()) {
                return 2;
            } else {
                return 3;
            }
        }

    }

    public void maintenanceFacility(int getTypeFacilityBooking, Facility getFacilityBooking) {
        switch (getTypeFacilityBooking) {
            case 1:
                facilityRepository.addBookingVilla((Villa) getFacilityBooking);
                break;
            case 2:
                facilityRepository.addBookingHouse((House) getFacilityBooking);
                break;
            case 3:
                facilityRepository.addBookingRoom((Room) getFacilityBooking);
        }
    }

}
