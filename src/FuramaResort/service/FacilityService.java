package FuramaResort.service;

import FuramaResort.model.Facility;
import FuramaResort.model.House;
import FuramaResort.model.Room;
import FuramaResort.model.Villa;
import FuramaResort.repository.FacilityRepository;
import FuramaResort.utils.RentalType;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService{
    Scanner sc = new Scanner(System.in);
    FacilityRepository facilityRepository = new FacilityRepository();

    public void displayListFacility(){
    Map<Facility,Integer> map = facilityRepository.getFacilityMap();
        Set<Facility> facilitySet = map.keySet();
        for (Facility c : facilitySet) {
            System.out.println(c + " - " + map.get(c)+" lần sử dụng");
        }
    }

    @Override
    public void addNewVilla() {
        System.out.print("nhập mã dịch vụ (SVVL-YYYY): ");
        String idService = sc.nextLine();
        if (facilityRepository.checkIdService(idService)){
            System.out.println("đã tồn tại");
        }else {
            System.out.print("nhập tên dịch vụ: ");
            String nameService = sc.nextLine();
            System.out.print("nhập diện tích: ");
            String area = sc.nextLine();
            System.out.println("nhập giá ($): ");
            String price = sc.nextLine();
            System.out.println("nhập số người tối đa: ");
            String maximumPeople = sc.nextLine();
            boolean flag;
            RentalType rentalType = null;
            do {
                flag = true;
                System.out.println("chọn kiểu thuê\n" +
                        "1. thuê theo năm\n" +
                        "2. thuê theo tháng\n" +
                        "3. thuê theo ngày\n" +
                        "4. thuê theo giờ\n");
                String choice = sc.nextLine();
                switch (choice){
                    case "1":
                        rentalType = RentalType.Year;
                        flag = false;
                        break;
                    case "2":
                        rentalType = RentalType.Month;
                        flag = false;
                        break;
                    case "3":
                        rentalType = RentalType.Day;
                        flag = false;
                        break;
                    case "4":
                        rentalType = RentalType.hour;
                        flag = false;
                        break;
                    default:
                        System.out.println("bạn nhập không đúng, mời nhập lại");
                    break;
                }
            }while (flag);
            System.out.print("nhập tiêu chuẩn phòng: ");
            String standard = sc.nextLine();
            System.out.print("nhập diện tích hồ bơi: ");
            String poolArea = sc.nextLine();
            System.out.println("nhập số tầng: ");
            String numberOfFloors = sc.nextLine();
            Villa newVilla = new Villa(idService,nameService,area,price,maximumPeople,rentalType,standard,poolArea,
                    numberOfFloors);
            facilityRepository.addNewFacility(newVilla);
            this.displayListFacility();
        }
    }

    @Override
    public void addNewHouse() {
        System.out.print("nhập mã dịch vụ (SVHO-YYYY): ");
        String idService = sc.nextLine();
        if (facilityRepository.checkIdService(idService)){
            System.out.println("đã tồn tại");
        }else {
            System.out.print("nhập tên dịch vụ: ");
            String nameService = sc.nextLine();
            System.out.print("nhập diện tích: ");
            String area = sc.nextLine();
            System.out.println("nhập giá ($): ");
            String price = sc.nextLine();
            System.out.println("nhập số người tối đa: ");
            String maximumPeople = sc.nextLine();
            boolean flag;
            RentalType rentalType = null;
            do {
                flag = true;
                System.out.println("chọn kiểu thuê\n" +
                        "1. thuê theo năm\n" +
                        "2. thuê theo tháng\n" +
                        "3. thuê theo ngày\n" +
                        "4. thuê theo giờ\n");
                String choice = sc.nextLine();
                switch (choice){
                    case "1":
                        rentalType = RentalType.Year;
                        flag = false;
                        break;
                    case "2":
                        rentalType = RentalType.Month;
                        flag = false;
                        break;
                    case "3":
                        rentalType = RentalType.Day;
                        flag = false;
                        break;
                    case "4":
                        rentalType = RentalType.hour;
                        flag = false;
                        break;
                    default:
                        System.out.println("bạn nhập không đúng, mời nhập lại");
                        break;
                }
            }while (flag);
            System.out.print("nhập tiêu chuẩn phòng: ");
            String standard = sc.nextLine();
            System.out.println("nhập số tầng: ");
            String numberOfFloors = sc.nextLine();
            House newHouse = new House(idService,nameService,area,price,maximumPeople,rentalType,standard,numberOfFloors);
            facilityRepository.addNewFacility(newHouse);
            this.displayListFacility();
        }
    }

    @Override
    public void addNewRoom() {
        System.out.print("nhập mã dịch vụ (SVHO-YYYY): ");
        String idService = sc.nextLine();
        if (facilityRepository.checkIdService(idService)){
            System.out.println("đã tồn tại");
        }else {
            System.out.print("nhập tên dịch vụ: ");
            String nameService = sc.nextLine();
            System.out.print("nhập diện tích: ");
            String area = sc.nextLine();
            System.out.println("nhập giá ($): ");
            String price = sc.nextLine();
            System.out.println("nhập số người tối đa: ");
            String maximumPeople = sc.nextLine();
            boolean flag;
            RentalType rentalType = null;
            do {
                flag = true;
                System.out.println("chọn kiểu thuê\n" +
                        "1. thuê theo năm\n" +
                        "2. thuê theo tháng\n" +
                        "3. thuê theo ngày\n" +
                        "4. thuê theo giờ\n");
                String choice = sc.nextLine();
                switch (choice){
                    case "1":
                        rentalType = RentalType.Year;
                        flag = false;
                        break;
                    case "2":
                        rentalType = RentalType.Month;
                        flag = false;
                        break;
                    case "3":
                        rentalType = RentalType.Day;
                        flag = false;
                        break;
                    case "4":
                        rentalType = RentalType.hour;
                        flag = false;
                        break;
                    default:
                        System.out.println("bạn nhập không đúng, mời nhập lại");
                        break;
                }
            }while (flag);
            System.out.print("nhập tiêu chuẩn phòng: ");
            String standard = sc.nextLine();
            Room newRoom = new Room(idService,nameService,area,price,maximumPeople,rentalType,standard);
            facilityRepository.addNewFacility(newRoom);
            this.displayListFacility();
        }
    }

    @Override
    public void displayListFacilityMaintenance() {
        for (Facility f:facilityRepository.displayListFacilityMaintenance()) {
            System.out.println(f);
        }
    }
}
