package ss17_serialization.bai_tap.quan_ly_san_pham.repository;

import ss17_serialization.bai_tap.quan_ly_san_pham.common.WriteFile;
import ss17_serialization.bai_tap.quan_ly_san_pham.model.Product;
import ss17_serialization.bai_tap.quan_ly_san_pham.common.ReadFile;

import java.util.List;

public class ProductRepository implements IProductRepository {
    private ReadFile readFile = new ReadFile();
    private WriteFile writeFile = new WriteFile();

    @Override
    public List<Product> getListProduct() {
        return readFile.read();
    }

    @Override
    public void addNewProduct(List<Product> productList) {
        writeFile.write(productList);
    }

    @Override
    public int getIdexToName(String name) {
        for (int i = 0; i < this.getListProduct().size(); i++) {
            if (getListProduct().get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void findProduct(int index) {
        System.out.println(this.getListProduct().get(index));
    }
}
