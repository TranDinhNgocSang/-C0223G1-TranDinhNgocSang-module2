package quan_ly.view;

import quan_ly.controller.StudentController;
import quan_ly.service.StudentService;

public class Test {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showMenu();
    }
}
