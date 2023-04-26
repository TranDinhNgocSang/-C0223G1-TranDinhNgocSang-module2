package quan_ly.repository;

import quan_ly.model.Student;
import quan_ly.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> listStudent = new ArrayList<>();
    private final String STUDENT_FILE_PATH = "E:\\CodeGym\\module2\\src\\quan_ly\\data\\data.csv";
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    @Override
    public List<Student> getListStudent() {
        listStudent = readAndWriteFile.readFile(STUDENT_FILE_PATH);
        return listStudent;
    }

    @Override
    public void addNewStudent(Student student) {
        listStudent = readAndWriteFile.readFile(STUDENT_FILE_PATH);
        listStudent.add(student);
        readAndWriteFile.writeFile(listStudent, STUDENT_FILE_PATH);

    }

    @Override
    public void deleteStudent(int index) {
        listStudent = readAndWriteFile.readFile(STUDENT_FILE_PATH);
        listStudent.remove(index);
        readAndWriteFile.writeFile(listStudent, STUDENT_FILE_PATH);
    }

    @Override
    public int getIndex(String id) {
        listStudent = readAndWriteFile.readFile(STUDENT_FILE_PATH);
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void editStudent(int index, String id, String name, int age, boolean gender) {
        listStudent = readAndWriteFile.readFile(STUDENT_FILE_PATH);
        listStudent.get(index).setId(id);
        listStudent.get(index).setName(name);
        listStudent.get(index).setAge(age);
        listStudent.get(index).setGender(gender);
        readAndWriteFile.writeFile(listStudent, STUDENT_FILE_PATH);
    }

    @Override
    public void ageIncrease() {
        listStudent = readAndWriteFile.readFile(STUDENT_FILE_PATH);
        listStudent.sort(((o1, o2) -> o1.getAge()-o2.getAge()));
//        Collections.sort(listStudent, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        readAndWriteFile.writeFile(listStudent, STUDENT_FILE_PATH);
    }
}
