package ss19_thuat_toan.bai_tap13.service;

import ss19_thuat_toan.bai_tap13.model.Computer;
import ss19_thuat_toan.bai_tap13.repository.ComputerRepository;
import ss19_thuat_toan.bai_tap13.unit.Validate;

import java.util.Scanner;

public class ComputerService implements IComputerService {
    Scanner sc = new Scanner(System.in);
    ComputerRepository computerRepository = new ComputerRepository();
    Validate validate = new Validate();

    @Override
    public void showComputerList() {
        for (Computer c : computerRepository.getComputerList()) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewComputer() {
        String id;
        do {
            System.out.println("nhập id");
            id = sc.nextLine();
            if (!validate.validateID(id)) {
                System.out.println("nhập sai định dạng, mời nhập lại");
            }
        } while (!validate.validateID(id));
        if (computerRepository.getIndexToId(id) != -1) {
            System.out.println("id đã tồn tại");
        } else {
            String name;
            do {
                System.out.println("nhập tên");
                name = sc.nextLine();
                if (!validate.validateName(name)) {
                    System.out.println("nhập sai định dạng, mời nhập lại");
                }
            } while (!validate.validateName(name));
            double price=0;
            boolean flag;
            do {
                flag = false;
                try {
                    System.out.println("nhập giá");
                    price = Double.parseDouble(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("nhập sai mời nhập lại");
                    flag = true;
                }
            } while (flag);
            String date;
            do {
                System.out.println("nhập ngày (yyyy-mm-dd)");
                date = sc.nextLine();
            }while (!validate.validateDate(date));
            Computer newComputer = new Computer(id, name, price, date);
            computerRepository.addNewComputer(newComputer);
        }
    }
}
