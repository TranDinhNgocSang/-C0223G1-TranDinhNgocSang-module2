package FuramaResort.controller;

import FuramaResort.service.EmployeeService;

import java.util.Scanner;

public class EmployeeManagementController {
    EmployeeService employeeService = new EmployeeService();
    Scanner sc = new Scanner(System.in);
    public void employeeManagementMenu(){
        String choice;
        do {
            System.out.println("1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Return main menu\n" +
                    "Please select function");
            choice = sc.nextLine();
            switch (choice){
                case "1":
                    employeeService.displayList();
                    break;
                case "2":
                    employeeService.addNew();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("you have entered wrong please re-enter");
            }
        }while (!choice.equals("4"));
    }
}
