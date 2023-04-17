package ss12_java_collection_frame_work.bai_tap_1.controller;

import ss12_java_collection_frame_work.bai_tap_1.Service.ProductService;

import java.util.Scanner;

public class ProductController {
    ProductService productService = new ProductService();

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("------Quản Lý Sản Phẩm------\n" +
                    "1.thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xoá sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "0. thoát\n" +
                    "mời bạn chọn chức năng \n");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    productService.addNewProduct();
                    break;
                case 2:
                    productService.editProduct();
                    break;
                case 3:
                    productService.deleteProduct();
                    break;
                case 4:
                    productService.showProductList();
                    break;
                case 5:
                    productService.findProduct();
                    break;
                case 6:
                    System.out.println("nhập 1 để sắp xếp tăng dần\n" +
                            "nhập 2 để sắp xếp giảm dần");
                    int choose = Integer.parseInt(sc.nextLine());
                    if (choose == 1) {
                        productService.priceIncrease();
                    }
                    if (choose == 2) {
                        productService.priceDecrease();
                    } else {
                        System.out.println("nhập không hợp lệ");
                    }
                    break;
                default:
                    if (choice != 0) {
                        System.out.println("bạn đã nhập sai, mời nhập lại");
                    }
            }

        } while (choice != 0);
    }

}
