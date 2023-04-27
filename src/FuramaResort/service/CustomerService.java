package FuramaResort.service;

import FuramaResort.model.Customer;
import FuramaResort.model.Employee;
import FuramaResort.repository.CustomerRepository;
import FuramaResort.utils.Level;
import FuramaResort.utils.Position;
import FuramaResort.utils.TypeCustomer;
import FuramaResort.utils.Validate;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    Validate validate = new Validate();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayList() {
        for (Customer c : customerRepository.getList()) {
            System.out.println(c);
        }

    }

    @Override
    public void addNew() {
        boolean validateIdCustomer;
        String id;
        do {
            System.out.println("nhập id");
            id = sc.nextLine();
            if (validate.validateIdCustomer(id)) {
                if (customerRepository.getIndexToID(id) == -1) {
                    System.out.println("nhập thành công");
                    validateIdCustomer = false;
                } else {
                    System.out.println("id đã tồn tại, mời nhập lại");
                    validateIdCustomer = true;
                }
            } else {
                System.out.println("nhập sai định dạng, mời nhập lại");
                validateIdCustomer = true;
            }
        } while (validateIdCustomer);
        boolean validateName;
        String name;
        do {
            System.out.println("nhập tên");
            name = sc.nextLine();
            if (validate.validateName(name)) {
                System.out.println("nhập thành công");
                validateName = false;
            } else {
                System.out.println("nhập sai định dạng, mời nhập lại");
                validateName = true;
            }
        } while (validateName);
        boolean validateDateOfBirth;
        String dateOfBirth;
        do {
            System.out.println("nhập ngày sinh");
            dateOfBirth = sc.nextLine();
            if (validate.validateDateOfBirth(dateOfBirth)) {
                LocalDate dob = LocalDate.parse(dateOfBirth);
                LocalDate now = LocalDate.now();
                if (Period.between(dob, now).getYears() >= 18) {
                    System.out.println("nhập thành công");
                    validateDateOfBirth = false;
                } else {
                    System.out.println("chưa đủ 18 tuổi\n" +
                            "chọn 1 để nhập lại nếu sai sót\n" +
                            "chọn khác 1 để thoát\n");
                    String choice = sc.nextLine();
                    if (choice.equals("1")) {
                        validateDateOfBirth = true;
                    } else {
                        return;
                    }
                }
            } else {
                System.out.println("nhập sai định dạng, mời nhập lại");
                validateDateOfBirth = true;
            }
        } while (validateDateOfBirth);
        System.out.println("nhập giới tính\n" +
                "Nhập 1 là nam\n" +
                "Nhập khác 1 là nữ");
        String choice = sc.nextLine();
        boolean gender;
        if (choice.equals("1")) {
            gender = true;
        } else {
            gender = false;
        }
        boolean validateCitizenIDNumber;
        String citizenIDNumber;
        do {
            System.out.println("nhập số căn cước");
            citizenIDNumber = sc.nextLine();
            if (validate.validateCitizenIDNumber(citizenIDNumber)) {
                System.out.println("nhập thành công");
                validateCitizenIDNumber = false;
            } else {
                System.out.println("nhập sai định dạng, mời nhập lại");
                validateCitizenIDNumber = true;
            }
        } while (validateCitizenIDNumber);
        boolean validateNumberPhone;
        String numberPhone;
        do {
            System.out.println("nhập số điện thoại");
            numberPhone = sc.nextLine();
            if (validate.validateNumberPhone(numberPhone)) {
                System.out.println("nhập thành công");
                validateNumberPhone = false;
            } else {
                System.out.println("nhập sai định dạng, mời nhập lại");
                validateNumberPhone = true;
            }
        } while (validateNumberPhone);
        System.out.println("nhập Email");
        String email = sc.nextLine();
        boolean flag;
        TypeCustomer typeCustomer = null;
        do {
            flag = true;
            System.out.println("nhập loại khách hàng\n" +
                    "nhập số tương ứng để chọn\n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n");
            String choice1 = sc.nextLine();
            switch (choice1) {
                case "1":
                    typeCustomer = TypeCustomer.Diamond;
                    flag = false;
                    break;
                case "2":
                    typeCustomer = TypeCustomer.Platinum;
                    flag = false;
                    break;
                case "3":
                    typeCustomer = TypeCustomer.Gold;
                    flag = false;
                    break;
                case "4":
                    typeCustomer = TypeCustomer.Silver;
                    flag = false;
                    break;
                case "5":
                    typeCustomer = TypeCustomer.Member;
                    flag = false;
                    break;
                default:
                    System.out.println("bạn nhập không đúng, mời nhập lại");
            }
        } while (flag);
        System.out.println("nhập địa chỉ");
        String adress = sc.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, citizenIDNumber, numberPhone, email, typeCustomer, adress);
        customerRepository.addNew(customer);
        this.displayList();
    }

    @Override
    public void edit() {
        this.displayList();
        System.out.println("nhập id khách hàng muốn sửa");
        String id = sc.nextLine();
        int index = customerRepository.getIndexToID(id);
        System.out.println(index);
        String choice;
        if (index != -1) {
            do {
                System.out.println("chọn thuộc tính bạn muốn sửa\n" +
                        "1. id\n" +
                        "2. name\n" +
                        "3. dateOfBirth\n" +
                        "4. gender\n" +
                        "5. citizenIDNumber\n" +
                        "6. numberPhone\n" +
                        "7. email\n" +
                        "8. typeCustomer\n" +
                        "9. adress\n" +
                        "0. exit");
                choice = sc.nextLine();
                switch (choice) {
                    case "0":
                        break;
                    case "1":
                        boolean validateId;
                        String idEdit;
                        do {
                            System.out.println("nhập id");
                            idEdit = sc.nextLine();
                            if (validate.validateIdCustomer(idEdit)) {
                                if (customerRepository.getIndexToID(idEdit)==-1) {
                                    System.out.println("nhập thành công");
                                    customerRepository.editID(index, idEdit);
                                    validateId = false;
                                }else {
                                    System.out.println("id đã tồn tại, mời nhập lại");
                                    validateId = true;
                                }
                            } else {
                                System.out.println("nhập sai định dạng, mời nhập lại");
                                validateId = true;
                            }
                        } while (validateId);
                        break;
                    case "2":
                        boolean validateName;
                        String name;
                        do {
                            System.out.println("nhập tên");
                            name = sc.nextLine();
                            if (validate.validateName(name)) {
                                System.out.println("nhập thành công");
                                customerRepository.editName(index, name);
                                validateName = false;
                            } else {
                                System.out.println("nhập sai định dạng, mời nhập lại");
                                validateName = true;
                            }
                        } while (validateName);
                        break;
                    case "3":
                        boolean validateDateOfBirth;
                        String dateOfBirth;
                        do {
                            System.out.println("nhập ngày sinh");
                            dateOfBirth = sc.nextLine();
                            if (validate.validateDateOfBirth(dateOfBirth)) {
                                LocalDate dob = LocalDate.parse(dateOfBirth);
                                LocalDate now = LocalDate.now();
                                if (Period.between(dob, now).getYears() >= 18) {
                                    System.out.println("nhập thành công");
                                    customerRepository.editDateOfBirth(index, dateOfBirth);
                                    validateDateOfBirth = false;
                                } else {
                                    System.out.println("chưa đủ 18 tuổi\n" +
                                            "chọn 1 để nhập lại nếu sai sót\n" +
                                            "chọn khác 1 để thoát\n");
                                    String choice1 = sc.nextLine();
                                    if (choice1.equals("1")) {
                                        validateDateOfBirth = true;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                System.out.println("nhập sai định dạng, mời nhập lại");
                                validateDateOfBirth = true;
                            }
                        } while (validateDateOfBirth);
                        break;
                    case "4":
                        System.out.println("nhập giới tính\n" +
                                "Nhập 1 là nam\n" +
                                "Nhập khác 1 là nữ");
                        String choice2 = sc.nextLine();
                        boolean gender;
                        if (choice2.equals("1")) {
                            gender = true;
                        } else {
                            gender = false;
                        }
                        customerRepository.editGender(index, gender);
                        break;
                    case "5":
                        boolean validateCitizenIDNumber;
                        String citizenIDNumber;
                        do {
                            System.out.println("nhập số căn cước");
                            citizenIDNumber = sc.nextLine();
                            if (validate.validateCitizenIDNumber(citizenIDNumber)) {
                                System.out.println("nhập thành cồng");
                                customerRepository.editCitizenIDNumber(index, citizenIDNumber);
                                validateCitizenIDNumber = false;
                            } else {
                                System.out.println("nhập sai định dạng, mời nhập lại");
                                validateCitizenIDNumber = true;
                            }
                        } while (validateCitizenIDNumber);
                        break;
                    case "6":
                        boolean validateNumberPhone;
                        String numberPhone;
                        do {
                            System.out.println("nhập số điện thoại");
                            numberPhone = sc.nextLine();
                            if (validate.validateNumberPhone(numberPhone)) {
                                System.out.println("nhập thành cồng");
                                customerRepository.editNumberPhone(index, numberPhone);
                                validateNumberPhone = false;
                            } else {
                                System.out.println("nhập sai định dạng, mời nhập lại");
                                validateNumberPhone = true;
                            }
                        } while (validateNumberPhone);
                        break;
                    case "7":
                        System.out.println("nhập Email");
                        String email = sc.nextLine();
                        customerRepository.editEmail(index, email);
                        break;
                    case "8":
                        boolean flag;
                        TypeCustomer typeCustomer = null;
                        do {
                            flag = true;
                            System.out.println("nhập loại khách hàng\n" +
                                    "nhập số tương ứng để chọn\n" +
                                    "1. Diamond\n" +
                                    "2. Platinum\n" +
                                    "3. Gold\n" +
                                    "4. Silver\n" +
                                    "5. Member\n");
                            String choice1 = sc.nextLine();
                            switch (choice1) {
                                case "1":
                                    typeCustomer = TypeCustomer.Diamond;
                                    flag = false;
                                    break;
                                case "2":
                                    typeCustomer = TypeCustomer.Platinum;
                                    flag = false;
                                    break;
                                case "3":
                                    typeCustomer = TypeCustomer.Gold;
                                    flag = false;
                                    break;
                                case "4":
                                    typeCustomer = TypeCustomer.Silver;
                                    flag = false;
                                    break;
                                case "5":
                                    typeCustomer = TypeCustomer.Member;
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("bạn nhập không đúng, mời nhập lại");
                            }
                        } while (flag);
                        customerRepository.editTypeCustomer(index, typeCustomer);
                        break;
                    case "9":
                        System.out.println("nhập địa chỉ");
                        String adress = sc.nextLine();
                        customerRepository.editAdress(index,adress);
                        break;
                    default:
                        System.out.println("bạn nhập sai chức năng, mời nhập lại");
                        break;
                }
            } while (!choice.equals("0"));
        } else {
            System.out.println("không tìm thấy id");
        }
        this.displayList();
    }
}
