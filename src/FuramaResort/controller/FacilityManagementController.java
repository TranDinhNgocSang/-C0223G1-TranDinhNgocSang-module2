package FuramaResort.controller;

import FuramaResort.repository.FacilityRepository;
import FuramaResort.service.FacilityService;

import java.util.Scanner;

public class FacilityManagementController {
    FacilityService facilityService = new FacilityService();
    public void facilityManagementMenu(){
        Scanner sc = new Scanner(System.in);
        String choice = "0";
        do {
            System.out.println("1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu\n" +
                    "Please select function");
            choice = sc.nextLine();
            switch (choice){
                case "1":
                    facilityService.displayListFacility();
                    break;
                case "2":
                    String choice1;
                    do {
                        System.out.println("mời chọn chức năng\n" +
                                "1.\tAdd New Villa\n" +
                                "2.\tAdd New House \n" +
                                "3.\tAdd New Room\n" +
                                "4.\tBack to menu\n");
                        choice1 = sc.nextLine();
                        switch (choice1){
                            case "1":
                                facilityService.addNewVilla();
                                break;
                            case "2":
                                facilityService.addNewHouse();
                                break;
                            case "3":
                                facilityService.addNewRoom();
                                break;
                            case "4":
                                break;
                            default:
                                System.out.println("bạn nhập không đúng, mời nhập lại");
                                break;
                        }
                    }while (!choice1.equals("4"));
                    break;
                case "3":
                    facilityService.displayListFacilityMaintenance();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("you have entered wrong please re-enter");
            }
        }while (!choice.equals("4"));
    }
}
