package quan_ly.repository;

import quan_ly.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    private static List<Student> listStudent = new ArrayList<>();
    static {
        Student student1 = new Student("hs01","Sang",25,true);
        Student student2 = new Student("hs02","Tinh",26,true);
        Student student3 = new Student("hs03","Trang",25,false);
    listStudent.add(student1);
    listStudent.add(student2);
    listStudent.add(student3);
    }

    @Override
    public List<Student> getListStudent() {
        return listStudent;
    }

    @Override
    public void addNewStudent(Student student) {
        listStudent.add(student);

    }

    @Override
    public void deleteStudent(int index) {
        listStudent.remove(index);
    }

    @Override
    public int getIndex(String id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void editStudent(int index, String id, String name, int age, boolean gender) {
        listStudent.get(index).setId(id);
        listStudent.get(index).setName(name);
        listStudent.get(index).setAge(age);
        listStudent.get(index).setGender(gender);
    }
}
