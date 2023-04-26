package FuramaResort.controller;

import java.util.Scanner;

public class PromotionManagementController {
    public void promotionManagementMenu(){
        Scanner sc = new Scanner(System.in);
        String choice = "0";
        do {
            System.out.println("1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu\n" +
                    "Please select function");
            choice = sc.nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("you have entered wrong please re-enter");
            }
        }while (!choice.equals("3"));
    }
}
