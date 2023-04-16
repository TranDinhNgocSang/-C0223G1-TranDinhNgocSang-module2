package quan_ly_hoc_vien.controller;

import quan_ly_hoc_vien.service.StudentService;
import quan_ly_hoc_vien.service.TutorService;

import java.util.Scanner;

public class StudentController {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("-------- hệ thống quản lý CodeGym---------\n" +
                    "Chọn chức năng theo số ( để tiếp tục):\n" +
                    "1.Quản lý sinh viên.\n" +
                    "2.Quản lý tutor\n" +
                    "0.Thoát \n" +
                    "Mời bạn nhập sự lựa chọn.\n");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    this.showStudentMenu();
                    break;
                case "2":
                    this.showTutorMenu();
                    break;
                case "0":
                    flag = false;
                    System.out.println("kết thúc");
                    break;
                default:
                    System.out.println("bạn chưa chưa đúng");
            }
        } while (flag);
    }

    public void showStudentMenu() {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        boolean flag2 = true;
        do {
            System.out.print("-------Quản lý học viên-------\n" +
                    "1. thêm mới học viên\n" +
                    "2. xóa học viên \n" +
                    "3. xem danh sách học viên\n" +
                    "0. thoát\n" +
                    "mời chọn chức năng \n");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    studentService.addNewStudent();
                    break;
                case "2":
                    studentService.deleteStudent();
                    break;
                case "3":
                    studentService.displayStudentList();
                    break;
                case "0":
                    flag2 = false;
                    System.out.println("kết thúc");
                    break;
                default:
                    System.out.println("bạn chưa chưa đúng");
            }
        } while (flag2);
    }

    public void showTutorMenu() {
        Scanner scanner1 = new Scanner(System.in);
        TutorService tutorService = new TutorService();
        boolean flag1 = true;
        do {
            System.out.print("-------Quản lý giáo viên-------\n" +
                    "1. thêm mới giáo viên\n" +
                    "2. xóa giáo viên \n" +
                    "3. xem danh sách giáo viên\n" +
                    "0. thoát\n" +
                    "mời chọn chức năng \n");
            String choice = scanner1.nextLine();
            switch (choice) {
                case "1":
                    tutorService.addNewTutor();
                    break;
                case "2":
                    tutorService.deleteTutor();
                    break;
                case "3":
                    tutorService.displayTutorList();
                    break;
                case "0":
                    flag1 = false;
                    System.out.println("kết thúc");
                    break;
                default:
                    System.out.println("bạn chưa chưa đúng");
            }
        } while (flag1);
    }
}

