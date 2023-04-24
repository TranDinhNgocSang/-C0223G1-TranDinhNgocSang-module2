package ss17_serialization.bai_tap.quan_ly_san_pham.controller;

import ss17_serialization.bai_tap.quan_ly_san_pham.service.ProductService;

import java.util.Scanner;

public class ProductController {
    Scanner sc = new Scanner(System.in);
    ProductService productService = new ProductService();

    public void showMenu() {
        String choice = "0";
        do {
            System.out.println("----Quản Lý Sản Phẩm------\n" +
                    "1.thêm sản phâm\n" +
                    "2.hiển thị danh sách sản phẩm\n" +
                    "3.tìm kiếm thông tin sản phẩm\n" +
                    "0. thoát\n" +
                    "mời chọn chức năng\n");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    productService.addNewProduct();
                    break;
                case "2":
                    productService.showListProduct();
                    break;
                case "3":
                    productService.findProduct();
                    break;
                case "0":
                    System.out.println("kết thúc");
                    break;
                default:
                    System.out.println("chọn sai chức năng mời nhập lại");
                    break;
            }
        } while (!choice.equals("0"));
    }
}
