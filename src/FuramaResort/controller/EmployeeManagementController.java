package FuramaResort.controller;

import java.util.Scanner;

public class EmployeeManagementController {
    public void employeeManagementMenu(){
        Scanner sc = new Scanner(System.in);
        String choice = "0";
        do {
            System.out.println("1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Return main menu\n" +
                    "Please select function");
            choice = sc.nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("you have entered wrong please re-enter");
            }
        }while (!choice.equals("4"));
    }
}
