package ss12_java_collection_frame_work.bai_tap_1.Service;

import ss12_java_collection_frame_work.bai_tap_1.Repository.ProductReposirory;
import ss12_java_collection_frame_work.bai_tap_1.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner sc = new Scanner(System.in);
    ProductReposirory productReposirory = new ProductReposirory();

    @Override
    public void showProductList() {
        ArrayList<Product> productArrayList = productReposirory.getProductList();
        for (Product p : productArrayList) {
            System.out.println(p);
        }

    }

    @Override
    public void addNewProduct() {
        System.out.println("nhập id của sản phẩm");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên của sản phẩm");
        String name = sc.nextLine();
        System.out.println("nhập giá của sản phẩm");
        double price = Double.parseDouble(sc.nextLine());
        Product newProduct = new Product(id, name, price);
        productReposirory.addNewProduct(newProduct);
        System.out.println("thêm thành công");
        this.showProductList();
    }

    @Override
    public void deleteProduct() {
        System.out.println("nhập id sản phẩm muốn xóa");
        int id = Integer.parseInt(sc.nextLine());
        if (productReposirory.deleteProduct(id)) {
            System.out.println("bạn có muốn xóa không\n" +
                    "nhập yes để xóa");
            String confirm = sc.nextLine();
            if (confirm.equals("yes")) {
                int index = 0;
                for (int i = 0; i < productReposirory.getProductList().size(); i++) {
                    if (productReposirory.getProductList().get(i).getId() == id) {
                        index = i;
                        break;
                    }
                }
                productReposirory.getProductList().remove(index);
            } else {
                System.out.println("xóa không thành công");
            }
        } else {
            System.out.println("không có id trùng khớp");
        }
        this.showProductList();
    }

    @Override
    public void editProduct() {
        System.out.println("nhập id sản phẩm bạn muốn sửa");
        ArrayList<Product> products = productReposirory.getProductList();
        int id = Integer.parseInt(sc.nextLine());
        if (productReposirory.editProduct(id) != -1) {
            int index = productReposirory.editProduct(id);
            System.out.println("nhập id mới");
            int idEdit = Integer.parseInt(sc.nextLine());
            System.out.println("nhập tên sản phẩm mới");
            String nameEdit = sc.nextLine();
            System.out.println("nhập giá mới");
            double priceEdit = Double.parseDouble(sc.nextLine());
            productReposirory.getProductList().get(index).setId(idEdit);
            productReposirory.getProductList().get(index).setNameProduct(nameEdit);
            productReposirory.getProductList().get(index).setPrice(priceEdit);

        } else {
            System.out.println("id không trùng khớp");
        }
        this.showProductList();
    }

    @Override
    public void findProduct() {
        System.out.println("nhập tên sản phẩm cần tìm");
        String name = sc.nextLine();
        System.out.println(productReposirory.findProduct(name));
    }

    @Override
    public void priceIncrease() {
        productReposirory.priceIncrease();
        this.showProductList();
    }

    @Override
    public void priceDecrease() {
        productReposirory.priceDecrease();
        this.showProductList();
    }
}
