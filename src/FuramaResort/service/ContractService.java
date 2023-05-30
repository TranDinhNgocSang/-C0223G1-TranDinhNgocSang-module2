package FuramaResort.service;

import FuramaResort.model.Booking;
import FuramaResort.model.Contract;
import FuramaResort.repository.ContractRepository;
import FuramaResort.utils.Validate;

import java.util.Scanner;
import java.util.Stack;

public class ContractService implements IContractService {
    Scanner sc = new Scanner(System.in);
    ContractRepository contractRepository = new ContractRepository();
    Validate validate = new Validate();

    @Override
    public void createNewContract() {
        Stack<Booking> bookingNotContract = contractRepository.bookingNotContractStack();
        System.out.println("danh sách booking chưa có hợp đồng");
        for (Booking b:bookingNotContract) {
            System.out.println(b);
        }
        System.out.println("bạn có muốn tạo hợp đồng\n" +
                "nhập 1 để tạo\n" +
                "khác 1 để quay lại");
        String choice = sc.nextLine();
        if (choice.equals("1")) {
            System.out.println("tạo hợp đồng cho booking có mã "+ bookingNotContract.peek().getIdBooking());
            System.out.print("nhập mã số hợp đồng: ");
            String numberContrac = sc.nextLine();
            String idBooking = bookingNotContract.peek().getIdBooking();
            String deposit;
            do {
                System.out.print("nhập tiền cọc trước: ");
                deposit = sc.nextLine();
                if (!validate.validatePrice(deposit)){
                    System.out.println("nhập sai định dạng mời nhập lại");
                }
            }while (!validate.validatePrice(deposit));
            String totalPayment;
            do {
                System.out.print("nhập tổng tiền thanh toán: ");
                totalPayment = sc.nextLine();
                if (!validate.validatePrice(totalPayment)){
                    System.out.println("nhập sai định dạng mời nhập lại");
                }
            }while (validate.validatePrice(totalPayment));
            Contract contract = new Contract(numberContrac,idBooking,deposit,totalPayment);
            contractRepository.createNew(contract);
        }

    }

    @Override
    public void displayContractList() {
        for (Contract c : contractRepository.getContractList()) {
            System.out.println(c);
        }
    }

    @Override
    public void editContract() {
        System.out.print("mời nhập mã Contract cần sửa: ");
        String idContract = sc.nextLine();
        int index = contractRepository.getIndexToID(idContract);
        if (index==-1){
            System.out.println("không tìm thấy");
        }else {
            String choice;
            do {
                System.out.println("chọn số tương ứng với thuộc tính bạn muốn sửa\n" +
                        "1. sửa số tiền cọc trước\n" +
                        "2. sửa tổng tiền thanh toán\n" +
                        "3. thoát");
                choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        System.out.print("nhập tiền cọc: ");
                        String deposit = sc.nextLine();
                        contractRepository.editDeposit(index, deposit);
                        break;
                    case "2":
                        System.out.print("nhập tổng tiền thanh toán: ");
                        String totalPayment = sc.nextLine();
                        contractRepository.editTotalPayment(index, totalPayment);
                        break;
                    case "3":
                        break;
                    default:
                        System.out.println("bạn nhập không đúng, mời nhập lại");
                }
            }while (!choice.equals("3"));
        }
    }
}
