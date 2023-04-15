package ss10_dsa_danh_sach.bai_tap.quan_ly_sinh_vien.repository;

import ss10_dsa_danh_sach.bai_tap.quan_ly_sinh_vien.model.Student;

import java.util.ArrayList;

public class StudentRepository implements IStudentReopsitory {
    private static ArrayList<Student> studentList = new ArrayList<>();
    static {
        Student student1 = new Student(1,"Sang","20/01/1998",true,"12a5",10);
        Student student2 = new Student(2,"Trang","24/11/1998",false,"12a5",10);
        Student student3 = new Student(3,"Duyên","17/10/1997",false,"12a5",10);
        Student student4 = new Student(4,"Nhi","20/01/1998",false,"12a5",10);
        Student student5 = new Student(5,"Linh","20/01/1998",false,"12a5",10);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
    }
    @Override
    public void addNewStudent(Student student) {

    }
}
