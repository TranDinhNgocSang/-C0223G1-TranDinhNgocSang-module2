package ss10_dsa_danh_sach.bai_tap.quan_ly_sinh_vien.model;

public class Student extends Person{
    private String classes;
    private double grade;

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, boolean gender, String classes, double grade) {
        super(id, name, dateOfBirth, gender);
        this.classes = classes;
        this.grade = grade;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classes='" + classes + '\'' +
                ", grade=" + grade +
                '}';
    }
}
