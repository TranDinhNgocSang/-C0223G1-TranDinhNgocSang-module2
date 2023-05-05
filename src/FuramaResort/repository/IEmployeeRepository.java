package FuramaResort.repository;

import FuramaResort.model.Employee;
import FuramaResort.utils.Level;
import FuramaResort.utils.Position;

import java.util.List;

public interface IEmployeeRepository{
    List<Employee> getList();
    void addNew (Employee employee);
    int getIndexToID (String id);
    void editID(int index, String id);
    void editName(int index, String name);
    void editDateOfBirth(int index, String dateOfBirth);
    void editGender(int index, boolean gender);
    void editCitizenIDNumber(int index, String citizenIDNumber);
    void editNumberPhone(int index, String numberPhone);
    void editEmail(int index, String email);
    void editlevel(int index, Level level);
    void editPosition(int index, Position position);
    void editSalary(int index, double salary);
}
