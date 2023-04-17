package ss12_java_collection_frame_work.bai_tap_1.Repository;

import ss12_java_collection_frame_work.bai_tap_1.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> getProductList();

    void addNewProduct(Product product);

    boolean deleteProduct(int id);

    int editProduct(int id);

    Product findProduct(String name);

    void priceIncrease();

    void priceDecrease();

}
