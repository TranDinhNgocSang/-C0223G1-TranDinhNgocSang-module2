package FuramaResort.service;

import FuramaResort.model.Facility;
import FuramaResort.model.House;
import FuramaResort.model.Room;
import FuramaResort.model.Villa;
import FuramaResort.repository.FacilityRepository;
import FuramaResort.utils.RentalType;
import FuramaResort.utils.Validate;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    Scanner sc = new Scanner(System.in);
    FacilityRepository facilityRepository = new FacilityRepository();
    Validate validate = new Validate();

    public void displayListFacility() {
        Map<Facility, Integer> map = facilityRepository.getFacilityMap();
        Set<Facility> facilitySet = map.keySet();
        for (Facility c : facilitySet) {
            System.out.println(c + " - " + map.get(c) + " lần sử dụng");
        }
    }

    @Override
    public void addNewVilla() {
        String idService;
        do {
            System.out.print("nhập mã dịch vụ (SVVL-YYYY): ");
            idService = sc.nextLine();
            if (validate.validateIdServiceVilla(idService)) {
                if (facilityRepository.checkIdService(idService)) {
                    System.out.println("đã tồn tại");
                    break;
                } else {
                    String nameService;
                    do {
                        System.out.print("nhập tên dịch vụ (chữ đầu in hoa): ");
                        nameService = sc.nextLine();
                        if (validate.validateNameService(nameService)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validateNameService(nameService));
                    String area;
                    do {
                        System.out.print("nhập diện tích (m2) (>=30m2): ");
                        area = sc.nextLine();
                        if (validate.validateArea(area)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validateArea(area));
                    String price;
                    do {
                        System.out.print("nhập giá ($): ");
                        price = sc.nextLine();
                        if (validate.validatePrice(price)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validatePrice(price));
                    String maximumPeople;
                    do {
                        System.out.println("nhập số người tối đa: ");
                        maximumPeople = sc.nextLine();
                        if (validate.validateMaximumPeople(maximumPeople)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validateMaximumPeople(maximumPeople));
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
                        switch (choice) {
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
                    } while (flag);
                    System.out.print("nhập tiêu chuẩn phòng: ");
                    String standard = sc.nextLine();
                    String poolArea;
                    do {
                        System.out.print("nhập diện tích hồ bơi (m2) (>=30m2): ");
                        poolArea = sc.nextLine();
                        if (validate.validateArea(poolArea)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validateArea(poolArea));
                    String numberOfFloors;
                    do {
                        System.out.println("nhập số tầng: ");
                        numberOfFloors = sc.nextLine();
                        if (validate.validateNumberOfFloors(numberOfFloors)){
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    }while (!validate.validateNumberOfFloors(numberOfFloors));
                    Villa newVilla = new Villa(idService, nameService, area, price, maximumPeople, rentalType, standard, poolArea,
                            numberOfFloors);
                    facilityRepository.addNewFacility(newVilla);
                    this.displayListFacility();
                }
            } else {
                System.out.println("bạn đã nhập sai định dạng, mời nhập lại");
            }
        } while (!validate.validateIdServiceVilla(idService));
    }

    @Override
    public void addNewHouse() {
        String idService;
        do {
            System.out.print("nhập mã dịch vụ (SVHO-YYYY): ");
            idService = sc.nextLine();
            if (validate.validateIdServiceHouse(idService)) {
                if (facilityRepository.checkIdService(idService)) {
                    System.out.println("đã tồn tại");
                    break;
                } else {
                    String nameService;
                    do {
                        System.out.print("nhập tên dịch vụ (chữ đầu in hoa): ");
                        nameService = sc.nextLine();
                        if (validate.validateNameService(nameService)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validateNameService(nameService));
                    String area;
                    do {
                        System.out.print("nhập diện tích (m2) (>=30m2): ");
                        area = sc.nextLine();
                        if (validate.validateArea(area)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validateArea(area));
                    String price;
                    do {
                        System.out.print("nhập giá ($): ");
                        price = sc.nextLine();
                        if (validate.validatePrice(price)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validatePrice(price));
                    String maximumPeople;
                    do {
                        System.out.println("nhập số người tối đa: ");
                        maximumPeople = sc.nextLine();
                        if (validate.validateMaximumPeople(maximumPeople)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validateMaximumPeople(maximumPeople));
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
                        switch (choice) {
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
                    } while (flag);
                    System.out.print("nhập tiêu chuẩn phòng: ");
                    String standard = sc.nextLine();
                    String numberOfFloors;
                    do {
                        System.out.println("nhập số tầng: ");
                        numberOfFloors = sc.nextLine();
                        if (validate.validateNumberOfFloors(numberOfFloors)){
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    }while (!validate.validateNumberOfFloors(numberOfFloors));
                    House newHouse = new House(idService, nameService, area, price, maximumPeople, rentalType, standard,
                            numberOfFloors);
                    facilityRepository.addNewFacility(newHouse);
                    this.displayListFacility();
                }
            } else {
                System.out.println("bạn đã nhập sai định dạng, mời nhập lại");
            }
        } while (!validate.validateIdServiceHouse(idService));
    }

    @Override
    public void addNewRoom() {
        String idService;
        do {
            System.out.print("nhập mã dịch vụ (SVRO-YYYY): ");
            idService = sc.nextLine();
            if (validate.validateIdServiceRoom(idService)) {
                if (facilityRepository.checkIdService(idService)) {
                    System.out.println("đã tồn tại");
                    break;
                } else {
                    String nameService;
                    do {
                        System.out.print("nhập tên dịch vụ (chữ đầu in hoa): ");
                        nameService = sc.nextLine();
                        if (validate.validateNameService(nameService)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validateNameService(nameService));
                    String area;
                    do {
                        System.out.print("nhập diện tích (m2) (>=30m2): ");
                        area = sc.nextLine();
                        if (validate.validateArea(area)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validateArea(area));
                    String price;
                    do {
                        System.out.print("nhập giá ($): ");
                        price = sc.nextLine();
                        if (validate.validatePrice(price)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validatePrice(price));
                    String maximumPeople;
                    do {
                        System.out.println("nhập số người tối đa: ");
                        maximumPeople = sc.nextLine();
                        if (validate.validateMaximumPeople(maximumPeople)) {
                            System.out.println("nhập thành công");
                        } else {
                            System.out.println("bạn nhập sai định dạng, mời nhập lại");
                        }
                    } while (!validate.validateMaximumPeople(maximumPeople));
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
                        switch (choice) {
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
                    } while (flag);
                    System.out.print("nhập tiêu chuẩn phòng: ");
                    String standard = sc.nextLine();
                    Room newRoom = new Room(idService, nameService, area, price, maximumPeople, rentalType, standard);
                    facilityRepository.addNewFacility(newRoom);
                    this.displayListFacility();
                }
            } else {
                System.out.println("bạn đã nhập sai định dạng, mời nhập lại");
            }
        } while (!validate.validateIdServiceRoom(idService));
    }

    @Override
    public void displayListFacilityMaintenance() {
        for (Facility f : facilityRepository.displayListFacilityMaintenance()) {
            System.out.println(f);
        }
    }
}
