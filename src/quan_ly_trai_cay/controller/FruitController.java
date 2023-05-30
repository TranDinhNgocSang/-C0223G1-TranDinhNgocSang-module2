package quan_ly_trai_cay.controller;

import quan_ly_trai_cay.service.FruitService;

import java.util.Scanner;

public class FruitController {
    Scanner sc = new Scanner(System.in);
    FruitService fruitService = new FruitService();

    public void showMenu() {
        String choice;
        do {
            System.out.println("-----Quản lý trái cây-----\n" +
                    "1. hiển thị danh dánh trái cây\n" +
                    "2. thêm mới trái cây\n" +
                    "3. xóa trái cây theo id\n" +
                    "4. sửa trái cây\n" +
                    "5. hiện thị danh sách trái cây theo giá giảm dần\n" +
                    "6. hiện thị danh sách trái cây theo ngày nhập kho xa nhất\n" +
                    "7. thoát\n" +
                    "mời nhập số tương ứng với chức năng");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    fruitService.showFruitList();
                    break;
                case "2":
                    fruitService.addNewFruit();
                    break;
                case "3":
                    fruitService.deleteFruit();
                    break;
                case "4":
                    fruitService.editFruit();
                    break;
                case "5":
                    fruitService.giaGiamDan();
                    break;
                case "6":
                    fruitService.sapXepNgayNhapKho();
                    break;
                case "7":
                    break;
                default:
                    System.out.println("bạn nhập không đúng mời nhập lại");
                    break;
            }
        } while (!choice.equals("7"));
    }
}
