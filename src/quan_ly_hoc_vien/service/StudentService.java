package quan_ly_hoc_vien.service;

import quan_ly_hoc_vien.model.Student;
import quan_ly_hoc_vien.repository.StudentRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    private StudentRepository studentRepository = new StudentRepository();

    public StudentService() {
    }

    @Override
    public void displayStudentList() {
        ArrayList<Student> studentList = studentRepository.getStudentList();
        for (Student s : studentList) {
            System.out.println(s);
        }

    }

    @Override
    public void addNewStudent() {
        System.out.print("Nhap id sinh vien: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap ten sinh vien: ");
        String studentName = scanner.nextLine();
        System.out.print("Nhap ngay sinh vien: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Chon gioi tinh \n" +
                "1. Nam \n" +
                "2. Nu \n");
        boolean gender = false;
        String chooseGender = scanner.nextLine();
        if (chooseGender.equals("1")) {
            gender = true;
        } else if (chooseGender.equals("2")) {
            gender = false;
        }
        System.out.print("Nhap lop cua sinh vien: "); 
        String classes = scanner.nextLine();
        System.out.print("nhap diem cua sinh vien: ");
        double grade = Double.parseDouble(scanner.nextLine());
        Student newStudent = new Student(studentId, studentName, dayOfBirth, gender, classes, grade);
        studentRepository.addNewStudent(newStudent);
        System.out.println("them moi thanh cong sinh vien " + newStudent.getName());

    }

    @Override
    public void deleteStudent() {
        this.displayStudentList();
        System.out.println("nhập id học viên muốn xóa");
        int choice = Integer.parseInt(scanner.nextLine());
        if (studentRepository.deleteStudentById(choice)) {
            System.out.println("bạn có muốn xóa ?\n" +
                    "nhập y để xóa");
            String delete = scanner.nextLine();
            if (delete.equals(delete)) {
                for (int i = 0; i < studentRepository.getStudentList().size(); i++) {
                    if (studentRepository.getStudentList().get(i).getId() == choice) {
                        studentRepository.getStudentList().remove(i);
                        System.out.println("xóa thành công");
                        break;
                    } else {
                        System.out.println("không xóa");
                    }
                }
            } else {
                System.out.println("không tìm thấy id");
            }
            this.displayStudentList();
        }
    }
}
