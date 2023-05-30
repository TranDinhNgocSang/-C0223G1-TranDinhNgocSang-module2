package quan_ly_trai_cay.service;

import FuramaResort.repository.FacilityRepository;
import quan_ly_trai_cay.model.Fruit;
import quan_ly_trai_cay.repository.FruitRepository;
import quan_ly_trai_cay.unit.Validate;

import java.util.Scanner;

public class FruitService implements IFruitService {
    Scanner sc = new Scanner(System.in);
    FruitRepository fruitRepository = new FruitRepository();
    Validate validate = new Validate();

    @Override
    public void showFruitList() {
        for (Fruit f : fruitRepository.getFruitList()) {
            System.out.println(f);
        }
    }

    @Override
    public void addNewFruit() {
        String id;
        do {
            System.out.println("nhập id");
            id = sc.nextLine();
            if (!validate.regexId(id)){
                System.out.println("nhập sai định dạng, mời nhập lại");
            }
        }while (!validate.regexId(id));
        String name;
        do {
            System.out.println("nhập tên");
            name = sc.nextLine();
            if (!validate.regexName(name)) {
                System.out.println("nhập sai định dạng, mời nhập lại");
            }
        }while (!validate.regexName(name));
        System.out.println("nhập giá");
        String price = sc.nextLine();
        System.out.println("nhập ngày nhập kho");
        String date = sc.nextLine();
        String quality = null;
        boolean flag;
        do {
            flag = true;
            System.out.println("chọn loại\n" +
                    "1. thượng hạn\n" +
                    "2. tốt\n" +
                    "3. thường");
            String choice1 = sc.nextLine();
            switch (choice1) {
                case "1":
                    quality = "thượng hạn";
                    flag = false;
                    break;
                case "2":
                    quality = "tốt";
                    flag = false;
                    break;
                case "3":
                    quality = "thường";
                    flag = false;
                    break;
                default:
                    System.out.println("bạn nhập không đúng, mời nhập lại");
            }
        }while (flag);
        Fruit newFruit = new Fruit(id, name, price, date, quality);
        fruitRepository.addNewFruit(newFruit);
        this.showFruitList();
    }

    @Override
    public void deleteFruit() {
        System.out.println("nhập id trái cây muốn xóa");
        String id = sc.nextLine();
        int index = fruitRepository.getIndexToId(id);
        if (index == -1) {
            System.out.println("id không tồn tại");
        } else {
            fruitRepository.deleteFruit(index);
        }
        this.showFruitList();
    }

    @Override
    public void editFruit() {
        System.out.println("nhập id trái cây cần sửa");
        String id = sc.nextLine();
        int index = fruitRepository.getIndexToId(id);
        if (index==-1){
            System.out.println("id không tồn tại");
        }else {
            String choice;
            do {
                System.out.println("-----chọn thuộc tính bạn muốn sửa-----\n" +
                        "1. sửa tên\n" +
                        "2. sửa giá\n" +
                        "3. sửa ngày nhập kho\n" +
                        "4. sửa loại\n" +
                        "5. thoát");
                choice = sc.nextLine();
                switch (choice){
                    case "1":
                        System.out.println("nhập tên");
                        String name = sc.nextLine();
                        fruitRepository.editNameFruit(index,name);
                        break;
                    case "2":
                        System.out.println("nhập giá");
                        String price = sc.nextLine();
                        fruitRepository.editPriceFruit(index,price);
                        break;
                    case "3":
                        System.out.println("nhập ngày nhập kho");
                        String date = sc.nextLine();
                        fruitRepository.editDateFruit(index,date);
                        break;
                    case "4":
                        String quality = null;
                        boolean flag;
                        do {
                             flag = true;
                            System.out.println("chọn loại\n" +
                                    "1. thượng hạn\n" +
                                    "2. tốt\n" +
                                    "3. thường");
                            String choice1 = sc.nextLine();
                            switch (choice1) {
                                case "1":
                                    quality = "thượng hạn";
                                    flag = false;
                                    break;
                                case "2":
                                    quality = "tốt";
                                    flag = false;
                                    break;
                                case "3":
                                    quality = "thường";
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("bạn nhập không đúng, mời nhập lại");
                            }
                            }while (flag);
                            fruitRepository.editQualityFruit(index,quality);
                        break;
                    case "5":
                        break;
                    default:
                        System.out.println("bạn nhập không đúng, mời nhập lại");
                        break;
                }
                
            }while (!choice.equals("5"));
        }
        this.showFruitList();
    }

    @Override
    public void giaGiamDan() {
        for (Fruit f: fruitRepository.giagGiamDan()) {
            System.out.println(f);
        }
    }

    @Override
    public void sapXepNgayNhapKho() {
        for (Fruit f: fruitRepository.sapXepNgayNhapKho()) {
            System.out.println(f);
        }
    }

}
