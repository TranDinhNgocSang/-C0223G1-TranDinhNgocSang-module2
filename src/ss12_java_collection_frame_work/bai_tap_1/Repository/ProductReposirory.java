package ss12_java_collection_frame_work.bai_tap_1.Repository;

import ss12_java_collection_frame_work.bai_tap_1.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductReposirory implements IProductRepository {
    private static ArrayList<Product> productList = new ArrayList<>();

    static {
        Product product1 = new Product(01, "bàn phím", 100000);
        Product product2 = new Product(02, "màn hình", 90000);
        Product product3 = new Product(03, "chuột gamming", 200000);
        Product product4 = new Product(04, "tai nge", 300000);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
    }

    @Override
    public ArrayList<Product> getProductList() {
        return productList;
    }

    @Override
    public void addNewProduct(Product product) {
        productList.add(product);
    }

    @Override
    public boolean deleteProduct(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int editProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Product findProduct(String name) {
        for (Product p : productList) {
            if (p.getNameProduct().equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void priceIncrease() {
        Collections.sort(this.getProductList(), new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
               return (int) (product1.getPrice()-product2.getPrice());
            }
        });
    }

    @Override
    public void priceDecrease() {
        Collections.sort(this.getProductList(), new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return (int) (product2.getPrice()-product1.getPrice());
            }
        });
    }
}