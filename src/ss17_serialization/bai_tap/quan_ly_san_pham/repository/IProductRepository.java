package ss17_serialization.bai_tap.quan_ly_san_pham.repository;

import ss17_serialization.bai_tap.quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getListProduct();

    void addNewProduct(List<Product> productList);

    int getIdexToName(String name);

    void findProduct(int index);
}
