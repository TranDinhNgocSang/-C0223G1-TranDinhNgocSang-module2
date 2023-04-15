package quan_ly_hoc_vien.controller;

import quan_ly_hoc_vien.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public void showStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        boolean flag = true;
        do {
            System.out.print("-------Quản lý học viên-------\n" +
                    "1. thêm mới học viên\n" +
                    "2. xóa học viên \n" +
                    "3. xem danh sách học viên\n" +
                    "0. thoát\n" +
                    "mời chọn chức năng \n");
            String choice = scanner.nextLine();
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
                    flag = false;
                    System.out.println("kết thúc");
                    break;
                default:
                    System.out.println("bạn chưa chưa đúng");
            }
        } while (flag);
    }
}
