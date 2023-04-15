package quan_ly_hoc_vien.repository;

import quan_ly_hoc_vien.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentRepository {
    ArrayList<Student> getStudentList();

    void addNewStudent(Student student);

    boolean deleteStudentById(int id);
}
