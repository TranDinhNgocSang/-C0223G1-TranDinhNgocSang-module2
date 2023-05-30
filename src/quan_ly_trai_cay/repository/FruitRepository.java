package quan_ly_trai_cay.repository;

import quan_ly_trai_cay.model.Fruit;
import quan_ly_trai_cay.unit.ReadAndWriteFruitFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitRepository implements IFruitRepository {
    private List<Fruit> fruitList = new ArrayList<>();
    private final String FRUIT_FILE = "E:\\CodeGym\\my-new-project\\src\\quan_ly_trai_cay\\data\\fruit_data.csv";
    ReadAndWriteFruitFile readAndWriteFruitFile = new ReadAndWriteFruitFile();

    @Override
    public List<Fruit> getFruitList() {
        fruitList = readAndWriteFruitFile.read(FRUIT_FILE);
        return fruitList;
    }

    @Override
    public void addNewFruit(Fruit fruit) {
        fruitList = readAndWriteFruitFile.read(FRUIT_FILE);
        fruitList.add(fruit);
        readAndWriteFruitFile.write(FRUIT_FILE, fruitList);
    }

    @Override
    public int getIndexToId(String id) {
        fruitList = readAndWriteFruitFile.read(FRUIT_FILE);
        for (int i = 0; i < fruitList.size(); i++) {
            if (fruitList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void deleteFruit(int index) {
        fruitList = readAndWriteFruitFile.read(FRUIT_FILE);
        fruitList.remove(index);
        readAndWriteFruitFile.write(FRUIT_FILE, fruitList);
    }

    @Override
    public void editNameFruit(int index, String name) {
        fruitList = readAndWriteFruitFile.read(FRUIT_FILE);
        fruitList.get(index).setName(name);
        readAndWriteFruitFile.write(FRUIT_FILE, fruitList);
    }

    @Override
    public void editPriceFruit(int index, String price) {
        fruitList = readAndWriteFruitFile.read(FRUIT_FILE);
        fruitList.get(index).setPrice(price);
        readAndWriteFruitFile.write(FRUIT_FILE, fruitList);
    }

    @Override
    public void editDateFruit(int index, String date) {
        fruitList = readAndWriteFruitFile.read(FRUIT_FILE);
        fruitList.get(index).setDate(date);
        readAndWriteFruitFile.write(FRUIT_FILE, fruitList);
    }

    @Override
    public void editQualityFruit(int index, String quality) {
        fruitList = readAndWriteFruitFile.read(FRUIT_FILE);
        fruitList.get(index).setQuality(quality);
        readAndWriteFruitFile.write(FRUIT_FILE, fruitList);
    }

    @Override
    public List<Fruit> giagGiamDan() {
        fruitList = readAndWriteFruitFile.read(FRUIT_FILE);
        Collections.sort(fruitList, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return Integer.parseInt(o2.getPrice()) - Integer.parseInt(o1.getPrice());
            }
        });
        return fruitList;
    }

    @Override
    public List<Fruit> sapXepNgayNhapKho() {
        fruitList = readAndWriteFruitFile.read(FRUIT_FILE);
        Collections.sort(fruitList, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return LocalDate.parse(o2.getDate()).compareTo(LocalDate.parse(o1.getDate()));
            }
        });
        return fruitList;
    }
}
