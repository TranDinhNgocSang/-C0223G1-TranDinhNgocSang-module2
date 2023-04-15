package ss10_dsa_danh_sach.bai_tap.quan_ly_sinh_vien.repository;

import ss10_dsa_danh_sach.bai_tap.quan_ly_sinh_vien.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentReopsitory {
    List<Student> getStudentList = new ArrayList<>();
    void addNewStudent (Student student);

}
