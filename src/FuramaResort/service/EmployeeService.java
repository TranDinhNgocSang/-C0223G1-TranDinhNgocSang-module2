package FuramaResort.service;

import FuramaResort.model.Employee;
import FuramaResort.repository.EmployeeRepository;
import FuramaResort.utils.Level;
import FuramaResort.utils.Position;
import FuramaResort.utils.Validate;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    Validate validate = new Validate();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayList() {
        for (Employee e : employeeRepository.getList()) {
            System.out.println(e);
        }
    }

    @Override
    public void addNew() {
        boolean validateIDEmployee;
        String id;
        do {
            System.out.print("nhập id (NV-yyyy): ");
            id = sc.nextLine();
            if (validate.validateIDEmployee(id)) {
                if (employeeRepository.getIndexToID(id)==-1) {
                    System.out.println("nhập thành công");
                    validateIDEmployee = false;
                }else {
                    System.out.println("id đã tồn tại, mời nhập lại");
                    validateIDEmployee = true;
                }
            } else {
                System.out.println("nhập sai định dạng, mời nhập lại");
                validateIDEmployee = true;
            }
        } while (validateIDEmployee);
        boolean validateName;
        String name;
        do {
            System.out.print("nhập tên: ");
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
            System.out.print("nhập ngày sinh (yyyy-mm-dd): ");
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
            System.out.print("nhập số căn cước (9 hoặc 12 số): ");
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
            System.out.print("nhập số điện thoại: ");
            numberPhone = sc.nextLine();
            if (validate.validateNumberPhone(numberPhone)) {
                System.out.println("nhập thành công");
                validateNumberPhone = false;
            } else {
                System.out.println("nhập sai định dạng, mời nhập lại");
                validateNumberPhone = true;
            }
        } while (validateNumberPhone);
        System.out.print("nhập Email: ");
        String email = sc.nextLine();
        boolean flag;
        Level level = null;
        do {
            flag = true;
            System.out.println("nhập trình độ\n" +
                    "nhập số tương ứng để chọn\n" +
                    "1. Trung cấp\n" +
                    "2. Cao đẳng\n" +
                    "3. Đại học\n" +
                    "4. Sau Đại học");
            String choice1 = sc.nextLine();
            switch (choice1) {
                case "1":
                    level = Level.Intermediate;
                    flag = false;
                    break;
                case "2":
                    level = Level.Colleges;
                    flag = false;
                    break;
                case "3":
                    level = Level.University;
                    flag = false;
                    break;
                case "4":
                    level = Level.After_University;
                    flag = false;
                    break;
                default:
                    System.out.println("bạn nhập không đúng, mời nhập lại");
            }
        } while (flag);
        boolean flag1;
        Position position = null;
        do {
            flag1 = true;
            System.out.println("nhập chức vụ\n" +
                    "nhập số tương ứng để chọn\n" +
                    "1. Lễ Tân\n" +
                    "2. Phục vụ\n" +
                    "3. Chuyên viên\n" +
                    "4. Giám sát\n" +
                    "5. Quản lý\n" +
                    "6. Giám đốc");
            String choice1 = sc.nextLine();
            switch (choice1) {
                case "1":
                    position = Position.Receptionist;
                    flag1 = false;
                    break;
                case "2":
                    position = Position.Serve;
                    flag1 = false;
                    break;
                case "3":
                    position = Position.Expert;
                    flag1 = false;
                    break;
                case "4":
                    position = Position.Monitor;
                    flag1 = false;
                    break;
                case "5":
                    position = Position.Manage;
                    flag1 = false;
                    break;
                case "6":
                    position = Position.Director;
                    flag1 = false;
                    break;
                default:
                    System.out.println("bạn nhập không đúng, mời nhập lại");
            }
        } while (flag1);
        boolean flag2;
        double salary;
        do {
            flag2 = true;
            System.out.print("nhập lương: ");
            salary = Double.parseDouble(sc.nextLine());
            if (salary > 0) {
                System.out.println("nhập thành công");
                flag2 = false;
            } else {
                System.out.println("lương phải lớn hơn 0, mời nhập lại");
            }
        } while (flag2);
        Employee newEmployee = new Employee(id, name, dateOfBirth, gender, citizenIDNumber, numberPhone, email, level, position, salary);
        employeeRepository.addNew(newEmployee);
        this.displayList();
    }

    @Override
    public void edit() {
        this.displayList();
        System.out.print("nhập id nhân viên muốn sửa (NV-yyyy): ");
        String id = sc.nextLine();
        int index = employeeRepository.getIndexToID(id);
        System.out.println(index);
        String choice;
        if (index != -1) {
            do {
                System.out.println("chọn thuộc tính bạn muốn sửa\n" +
                        "1. name\n" +
                        "2. dateOfBirth\n" +
                        "3. gender\n" +
                        "4. citizenIDNumber\n" +
                        "5. numberPhone\n" +
                        "6. email\n" +
                        "7. level\n" +
                        "8. position\n" +
                        "9. salary\n" +
                        "0. exit");
                choice = sc.nextLine();
                switch (choice) {
                    case "0":
                        break;
                    case "1":
                        boolean validateName;
                        String name;
                        do {
                            System.out.print("nhập tên: ");
                            name = sc.nextLine();
                            if (validate.validateName(name)) {
                                System.out.println("nhập thành công");
                                employeeRepository.editName(index, name);
                                validateName = false;
                            } else {
                                System.out.println("nhập sai định dạng, mời nhập lại");
                                validateName = true;
                            }
                        } while (validateName);
                        break;
                    case "2":
                        boolean validateDateOfBirth;
                        String dateOfBirth;
                        do {
                            System.out.print("nhập ngày sinh (yyyy-mm-dd): ");
                            dateOfBirth = sc.nextLine();
                            if (validate.validateDateOfBirth(dateOfBirth)) {
                                LocalDate dob = LocalDate.parse(dateOfBirth);
                                LocalDate now = LocalDate.now();
                                if (Period.between(dob, now).getYears() >= 18) {
                                    System.out.println("nhập thành công");
                                    employeeRepository.editDateOfBirth(index, dateOfBirth);
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
                    case "3":
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
                        employeeRepository.editGender(index, gender);
                        break;
                    case "4":
                        boolean validateCitizenIDNumber;
                        String citizenIDNumber;
                        do {
                            System.out.print("nhập số căn cước (9 hoặc 12 số): ");
                            citizenIDNumber = sc.nextLine();
                            if (validate.validateCitizenIDNumber(citizenIDNumber)) {
                                System.out.println("nhập thành cồng");
                                employeeRepository.editCitizenIDNumber(index, citizenIDNumber);
                                validateCitizenIDNumber = false;
                            } else {
                                System.out.println("nhập sai định dạng, mời nhập lại");
                                validateCitizenIDNumber = true;
                            }
                        } while (validateCitizenIDNumber);
                        break;
                    case "5":
                        boolean validateNumberPhone;
                        String numberPhone;
                        do {
                            System.out.print("nhập số điện thoại: ");
                            numberPhone = sc.nextLine();
                            if (validate.validateNumberPhone(numberPhone)) {
                                System.out.println("nhập thành cồng");
                                employeeRepository.editNumberPhone(index, numberPhone);
                                validateNumberPhone = false;
                            } else {
                                System.out.println("nhập sai định dạng, mời nhập lại");
                                validateNumberPhone = true;
                            }
                        } while (validateNumberPhone);
                        break;
                    case "6":
                        System.out.print("nhập Email");
                        String email = sc.nextLine();
                        employeeRepository.editEmail(index, email);
                        break;
                    case "7":
                        boolean flag;
                        Level level = null;
                        do {
                            flag = true;
                            System.out.println("nhập trình độ\n" +
                                    "nhập số tương ứng để chọn\n" +
                                    "1. Trung cấp\n" +
                                    "2. Cao đẳng\n" +
                                    "3. Đại học\n" +
                                    "4. Sau Đại học");
                            String choice1 = sc.nextLine();
                            switch (choice1) {
                                case "1":
                                    level = Level.Intermediate;
                                    flag = false;
                                    break;
                                case "2":
                                    level = Level.Colleges;
                                    flag = false;
                                    break;
                                case "3":
                                    level = Level.University;
                                    flag = false;
                                    break;
                                case "4":
                                    level = Level.After_University;
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("bạn nhập không đúng, mời nhập lại");
                            }
                        } while (flag);
                        employeeRepository.editlevel(index, level);
                        break;
                    case "8":
                        boolean flag1;
                        Position position = null;
                        do {
                            flag1 = true;
                            System.out.println("nhập chức vụ\n" +
                                    "nhập số tương ứng để chọn\n" +
                                    "1. Lễ Tân\n" +
                                    "2. Phục vụ\n" +
                                    "3. Chuyên viên\n" +
                                    "4. Giám sát\n" +
                                    "5. Quản lý\n" +
                                    "6. Giám đốc");
                            String choice1 = sc.nextLine();
                            switch (choice1) {
                                case "1":
                                    position = Position.Receptionist;
                                    flag1 = false;
                                    break;
                                case "2":
                                    position = Position.Serve;
                                    flag1 = false;
                                    break;
                                case "3":
                                    position = Position.Expert;
                                    flag1 = false;
                                    break;
                                case "4":
                                    position = Position.Monitor;
                                    flag1 = false;
                                    break;
                                case "5":
                                    position = Position.Manage;
                                    flag1 = false;
                                    break;
                                case "6":
                                    position = Position.Director;
                                    flag1 = false;
                                    break;
                                default:
                                    System.out.println("bạn nhập không đúng, mời nhập lại");
                            }
                        } while (flag1);
                        employeeRepository.editPosition(index, position);
                        break;
                    case "9":
                        boolean flag2;
                        do {
                            flag2 = true;
                            System.out.print("nhập lương: ");
                            double salary = Double.parseDouble(sc.nextLine());
                            if (salary > 0) {
                                System.out.println("nhập thành công");
                                employeeRepository.editSalary(index, salary);
                                flag2 = false;
                            } else {
                                System.out.println("lương phải lớn hơn 0");
                            }
                        } while (flag2);
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
