package quan_ly.repository;

import quan_ly.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getListStudent();
    void addNewStudent (Student student);
    void deleteStudent(int index);
    int getIndex(String id);
    void editStudent (int index, String id, String name, int age, boolean gender);
    void ageIncrease();
}
