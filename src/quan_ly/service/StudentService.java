package quan_ly.service;

import quan_ly.model.Student;
import quan_ly.repository.StudentRepository;

import java.util.Scanner;

public class StudentService implements IStudentService {
    StudentRepository studentRepository = new StudentRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void showStudentList() {
        for (Student s : studentRepository.getListStudent()) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewStudent() {
        System.out.println("nhap id hoc vien muon them");
        String id = sc.nextLine();
        System.out.println("nhap ten hoc vien muon them");
        String name = sc.nextLine();
        System.out.println("nhap tuoi hoc vien muon them");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("nhap gioi tinh hoc vien muon them\n" +
                "nhap 1 la nam\n" +
                "nhap khac 1 la nu\n");
        int chosse = Integer.parseInt(sc.nextLine());
        boolean gender;
        if (chosse == 1) {
            gender = true;
        } else {
            gender = false;
        }
        Student newStudent = new Student(id, name, age, gender);
        studentRepository.addNewStudent(newStudent);
        this.showStudentList();
    }

    @Override
    public void deleteStudent() {
        System.out.println("nhap id hoc vien muon xoa");
        String id = sc.nextLine();
        int index = studentRepository.getIndex(id);
        if (index != -1) {
            System.out.println("ban co muon xoa\n" +
                    "nhap y de xoa");
            String choice = sc.nextLine();
            if (choice.equals("y")) {
                studentRepository.deleteStudent(index);
                System.out.println("da xoa thanh cong");
            } else {
                System.out.println("xoa khong thanh cong");
            }
        } else {
            System.out.println("khong tim thay id");
        }
        this.showStudentList();
    }

    @Override
    public void editStudent() {
        System.out.println("nhap id hoc vien muon sua");
        String id = sc.nextLine();
        int index = studentRepository.getIndex(id);
        if (index != -1) {
            System.out.println("nhap id");
            String idEdit = sc.nextLine();
            System.out.println("nhap ten");
            String nameEdit = sc.nextLine();
            System.out.println("nhap tuoi");
            int ageEdit = Integer.parseInt(sc.nextLine());
            System.out.println("chon gioi tính\n" +
                    "nhap 1 là nam\n" +
                    "nhap khac 1 la nư");
            int choice = Integer.parseInt(sc.nextLine());
            boolean gender;
            if (choice == 1) {
                gender = true;
            } else {
                gender = false;
            }
            studentRepository.editStudent(index,idEdit,nameEdit,ageEdit,gender);
        }else {
            System.out.println("khong co trong danh sach");
        }
        this.showStudentList();
    }

    @Override
    public void ageIncrease() {
        studentRepository.ageIncrease();
        this.showStudentList();
    }
}
