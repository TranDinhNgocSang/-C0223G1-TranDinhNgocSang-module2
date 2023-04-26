package FuramaResort.controller;

import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);
    EmployeeManagementController employeeManagementController = new EmployeeManagementController();
    CustomerManagementController customerManagementController = new CustomerManagementController();
    FacilityManagementController facilityManagementController = new FacilityManagementController();
    BookingManagermentController bookingManagermentController = new BookingManagermentController();
    PromotionManagementController promotionManagementController = new PromotionManagementController();

    public void displayMainMenu() {
        String choice = "0";
        do {
            System.out.println("---------FuramaResort---------\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n" +
                    "Please select function");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    employeeManagementController.employeeManagementMenu();
                    break;
                case "2":
                    customerManagementController.customerManagementMenu();
                    break;
                case "3":
                    facilityManagementController.facilityManagementMenu();
                    break;
                case "4":
                    bookingManagermentController.bookingManagermentMenu();
                    break;
                case "5":
                    promotionManagementController.promotionManagementMenu();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("you have entered wrong please re-enter");
                    break;
            }
        } while (!choice.equals("6"));
    }
}
