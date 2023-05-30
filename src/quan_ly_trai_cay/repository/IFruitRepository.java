package quan_ly_trai_cay.repository;

import quan_ly_trai_cay.model.Fruit;

import java.util.List;

public interface IFruitRepository {
    List<Fruit> getFruitList();

    void addNewFruit(Fruit fruit);

    int getIndexToId(String id);

    void deleteFruit(int index);

    void editNameFruit(int index, String name);

    void editPriceFruit(int index, String price);

    void editDateFruit(int index, String date);

    void editQualityFruit(int index, String date);

    List<Fruit> giagGiamDan();

    List<Fruit> sapXepNgayNhapKho();

}
