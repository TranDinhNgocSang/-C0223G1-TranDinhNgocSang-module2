package quan_ly_hoc_vien.repository;

import quan_ly_hoc_vien.model.Student;

import java.util.ArrayList;

public class StudentRepository implements IStudentRepository {
    private static ArrayList<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "Sang", "20/01/1998", true, "12a5", 10));
        studentList.add(new Student(2, "Trang", "24/11/1998", false, "12a5", 10));
        studentList.add(new Student(3, "Duyên", "17/10/1997", false, "12a7", 10));
        studentList.add(new Student(4, "Nhi", "01/01/1998", false, "12a6", 10));
    }

    public StudentRepository() {
    }

    @Override
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    @Override
    public void addNewStudent(Student student) {
        studentList.add(student);

    }

    @Override
    public boolean deleteStudentById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }
}
