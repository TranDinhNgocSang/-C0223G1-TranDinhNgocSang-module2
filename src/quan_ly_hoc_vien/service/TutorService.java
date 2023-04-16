package quan_ly_hoc_vien.service;

import quan_ly_hoc_vien.model.Student;
import quan_ly_hoc_vien.model.Tutor;
import quan_ly_hoc_vien.repository.TutorRepository;

import java.util.Scanner;

public class TutorService implements ITutorService {
    Scanner scanner = new Scanner(System.in);
    TutorRepository tutorRepository = new TutorRepository();

    @Override
    public void displayTutorList() {
        for (int i = 0; i < tutorRepository.getTutorList().size(); i++) {
            System.out.println(tutorRepository.getTutorList().get(i));
        }

    }

    @Override
    public void addNewTutor() {
        System.out.print("Nhap id giáo viên ");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap ten giáo viên: ");
        String studentName = scanner.nextLine();
        System.out.print("Nhap ngay giáo viên: ");
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
        System.out.print("Nhap chuyen mon cua giáo viên: ");
        String specialize = scanner.nextLine();
        Tutor newTutor = new Tutor(studentId, studentName, dayOfBirth, gender, specialize);
        tutorRepository.addNewTutor(newTutor);
        System.out.println("them moi thanh cong");
        this.displayTutorList();
    }

    @Override
    public void deleteTutor() {
        this.displayTutorList();
        System.out.println("nhập id học viên muốn xóa");
        int choice = Integer.parseInt(scanner.nextLine());
        if (tutorRepository.deleteTutor(choice)) {
            System.out.println("bạn có muốn xóa ?\n" +
                    "nhập y để xóa");
            String delete = scanner.nextLine();
            if (delete.equals(delete)) {
                for (int i = 0; i < tutorRepository.getTutorList().size(); i++) {
                    if (tutorRepository.getTutorList().get(i).getId() == choice) {
                        tutorRepository.getTutorList().remove(i);
                        System.out.println("xóa thành công");
                        break;
                    } else {
                        System.out.println("không xóa");
                    }
                }
            } else {
                System.out.println("không tìm thấy id");
            }
            this.displayTutorList();
        }

    }
}
