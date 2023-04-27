package FuramaResort.repository;

import FuramaResort.model.Employee;
import FuramaResort.utils.Level;
import FuramaResort.utils.Position;
import FuramaResort.utils.ReadAndWriteFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    private final static String EMPLOYEE_FILE_PATH = "E:\\CodeGym\\module2\\src\\FuramaResort\\data\\employee_data.csv";
    ReadAndWriteFileEmployee readAndWriteFileEmployee = new ReadAndWriteFileEmployee();

    @Override
    public List<Employee> getList() {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        return employeeList;
    }

    @Override
    public void addNew(Employee employee) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        employeeList.add(employee);
        readAndWriteFileEmployee.write(EMPLOYEE_FILE_PATH, employeeList);
    }

    @Override
    public int getIndexToID(String id) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void editID(int index, String id) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        employeeList.get(index).setId(id);
        readAndWriteFileEmployee.write(EMPLOYEE_FILE_PATH, employeeList);
    }

    public void editName(int index, String name) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        employeeList.get(index).setName(name);
        readAndWriteFileEmployee.write(EMPLOYEE_FILE_PATH, employeeList);
    }

    public void editDateOfBirth(int index, String dateOfBirth) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        employeeList.get(index).setDateOfBirth(dateOfBirth);
        readAndWriteFileEmployee.write(EMPLOYEE_FILE_PATH, employeeList);
    }

    public void editGender(int index, boolean gender) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        employeeList.get(index).setGender(gender);
        readAndWriteFileEmployee.write(EMPLOYEE_FILE_PATH, employeeList);
    }

    public void editCitizenIDNumber(int index, String citizenIDNumber) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        employeeList.get(index).setCitizenIDNumber(citizenIDNumber);
        readAndWriteFileEmployee.write(EMPLOYEE_FILE_PATH, employeeList);
    }

    public void editNumberPhone(int index, String numberPhone) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        employeeList.get(index).setNumberPhone(numberPhone);
        readAndWriteFileEmployee.write(EMPLOYEE_FILE_PATH, employeeList);
    }

    public void editEmail(int index, String email) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        employeeList.get(index).setEmail(email);
        readAndWriteFileEmployee.write(EMPLOYEE_FILE_PATH, employeeList);
    }

    public void editlevel(int index, Level level) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        employeeList.get(index).setLevel(level);
        readAndWriteFileEmployee.write(EMPLOYEE_FILE_PATH, employeeList);
    }

    public void editPosition(int index, Position position) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        employeeList.get(index).setPosition(position);
        readAndWriteFileEmployee.write(EMPLOYEE_FILE_PATH, employeeList);
    }

    public void editSalary(int index, double salary) {
        employeeList = readAndWriteFileEmployee.read(EMPLOYEE_FILE_PATH);
        employeeList.get(index).setSalary(salary);
        readAndWriteFileEmployee.write(EMPLOYEE_FILE_PATH, employeeList);
    }
}
