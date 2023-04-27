package FuramaResort.controller;

import FuramaResort.service.CustomerService;

import java.util.Scanner;

public class CustomerManagementController {
    CustomerService customerService = new CustomerService();
    Scanner sc = new Scanner(System.in);
    public void customerManagementMenu(){
        String choice;
        do {
            System.out.println("1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu\n" +
                    "Please select function");
            choice = sc.nextLine();
            switch (choice){
                case "1":
                    customerService.displayList();
                    break;
                case "2":
                    customerService.addNew();
                    break;
                case "3":
                    customerService.edit();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("you have entered wrong please re-enter");
            }
        }while (!choice.equals("4"));
    }
}
