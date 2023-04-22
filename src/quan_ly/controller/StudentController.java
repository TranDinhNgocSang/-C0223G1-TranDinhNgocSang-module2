package quan_ly.controller;

import quan_ly.service.StudentService;

import java.util.Scanner;

public class StudentController {
    Scanner sc= new Scanner(System.in);
    StudentService studentService = new StudentService();
    public  void showMenu(){
        int choice;
        do {
            System.out.println("-----Qua ly hoc vien-----\n" +
                    "1. hien thi danh sach\n" +
                    "2. them moi hoc vien\n" +
                    "3. xoa hoc vien theo id\n" +
                    "4. sua hoc vien theo id\n" +
                    "0. thoat\n" +
                    "moi chon chuc nang");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    studentService.showStudentList();
                    break;
                case 2:
                    studentService.addNewStudent();
                    break;
                case 3:
                    studentService.deleteStudent();
                    break;
                case 4:
                    studentService.editStudent();
                    break;
                case 0:
                    System.out.println("ket thuc");
                    break;
                default:
                    System.out.println("chon sai chuc nang");
                    break;
            }
        }while (choice!=0);
    }
}
