package FuramaResort.service;

import FuramaResort.model.Booking;
import FuramaResort.model.Facility;
import FuramaResort.model.House;
import FuramaResort.repository.BookingRepository;
import FuramaResort.utils.Validate;

import java.util.Scanner;

public class BookingService implements IBookingService {
    Scanner sc = new Scanner(System.in);
    BookingRepository bookingRepository = new BookingRepository();
    Validate validate = new Validate();

    @Override
    public void addNewBoking() {
        System.out.print("nhập mã booking: ");
        String idBooking = sc.nextLine();
        if (bookingRepository.getIndexToIdBooking(idBooking) != -1) {
            System.out.println("mã booking đã tồn tại");
        } else {
            String bookingDate;
            do {
                System.out.println("nhập ngày booking (yyyy-mm-dd): ");
                bookingDate = sc.nextLine();
                if (validate.validateDate(bookingDate)) {
                    System.out.println("nhập thành công");
                } else {
                    System.out.println("nhập sai định dạng,mời nhập lại");
                }
            } while (!validate.validateDate(bookingDate));
            String rentalStartDate;
            do {
                System.out.println("nhập ngày bắt đầu thuê (yyyy-mm-dd): ");
                rentalStartDate = sc.nextLine();
                if (validate.validateDate(rentalStartDate)) {
                    System.out.println("nhập thành công");
                } else {
                    System.out.println("nhập sai định dạng,mời nhập lại");
                }
            } while (!validate.validateDate(rentalStartDate));
            String rentalEndDate;
            do {
                System.out.println("nhập ngày kết thúc thuê (yyyy-mm-dd): ");
                rentalEndDate = sc.nextLine();
                if (validate.validateDate(rentalEndDate)) {
                    System.out.println("nhập thành công");
                } else {
                    System.out.println("nhập sai định dạng,mời nhập lại");
                }
            } while (!validate.validateDate(rentalEndDate));
            System.out.println("chọn số tương ứng với mã khách hàng");
            bookingRepository.showlistCustomer();
            int choice = 0;
            do {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("nhập sai kiểu dữ liệu, mời nhập lại");
                    continue;
                }
                if (choice < 1 || choice > bookingRepository.getIdCustomerList().size()) {
                    System.out.println("bạn nhập không đúng, mời nhập lại");
                }
            } while (choice < 1 || choice > bookingRepository.getIdCustomerList().size());
            String idCustomer = bookingRepository.getIdCustomerList().get(choice - 1);
            System.out.println("chọn số tương ứng với mã dịch vụ");
            bookingRepository.showListFacility();
            int choice1 = 0;
            do {
                try {
                    choice1 = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("nhập sai kiểu dữ liệu, mời nhập lại");
                    continue;
                }
                if (choice1 < 1 || choice > bookingRepository.getIdServiceList().size()) {
                    System.out.println("bạn nhập không đúng, mời nhập lại");
                }
            } while (choice1 < 1 || choice > bookingRepository.getIdServiceList().size());
            String idIdSerVice = bookingRepository.getIdServiceList().get(choice - 1);
            int type = bookingRepository.getTypeFacilityBooking(choice1);
            Facility facility = bookingRepository.getFacilityBooking(choice1);
            System.out.println(facility);
            bookingRepository.maintenanceFacility(type,facility);
            Booking newBooking = new Booking(idBooking, bookingDate, rentalStartDate, rentalEndDate, idCustomer, idIdSerVice);
            bookingRepository.addNewBooking(newBooking);
        }
    }

    @Override
    public void dispLayListBooking() {
        for (Booking b : bookingRepository.getBookingList()) {
            System.out.println(b);
        }
    }
}
