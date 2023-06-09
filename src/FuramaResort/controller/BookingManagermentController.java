package FuramaResort.controller;

import FuramaResort.repository.ContractRepository;
import FuramaResort.service.BookingService;
import FuramaResort.service.ContractService;

import java.util.Scanner;

public class BookingManagermentController {
    BookingService bookingService = new BookingService();
    ContractService contractService = new ContractService();
    public void bookingManagermentMenu(){
        Scanner sc = new Scanner(System.in);
        String choice = "0";
        do {
            System.out.println("1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new contracts\n" +
                    "4.Display list contracts\n" +
                    "5.Edit contracts\n" +
                    "6.Return main menu\n" +
                    "Please select function");
            choice = sc.nextLine();
            switch (choice){
                case "1":
                    bookingService.addNewBoking();
                    break;
                case "2":
                    bookingService.dispLayListBooking();
                    break;
                case "3":
                    contractService.createNewContract();
                    break;
                case "4":
                    contractService.displayContractList();
                    break;
                case "5":
                    contractService.editContract();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("you have entered wrong please re-enter");
            }
        }while (!choice.equals("6"));
    }
}
