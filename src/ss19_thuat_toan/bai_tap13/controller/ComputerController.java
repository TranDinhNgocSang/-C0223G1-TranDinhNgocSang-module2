package ss19_thuat_toan.bai_tap13.controller;

import ss19_thuat_toan.bai_tap13.service.ComputerService;

import java.util.Scanner;

public class ComputerController {
    ComputerService computerService = new ComputerService();
    Scanner sc = new Scanner(System.in);
    public void showMenu(){
        String choice;
        do {
            System.out.println("--------quản lý máy tính------\n" +
                    "1. hiển thị danh sách\n" +
                    "2. thêm mới\n" +
                    "3. sửa theo id\n" +
                    "4. xóa theo id\n" +
                    "5. tìm kiếm\n" +
                    "6. sắp xếp theo giá\n" +
                    "7. sắp xếp theo ngày nhập kho\n" +
                    "8. thoát\n" +
                    "nhập số tương ứng để chọn chứ năng");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    computerService.showComputerList();
                    break;
                case "2":
                    computerService.addNewComputer();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                default:
                    System.out.println("bạn nhập k đúng , mời nhập lại");
                    break;
            }
        }while (!choice.equals("8"));
    }
}
