package quan_ly_hoc_vien.model;

public class Student extends Person {
    private String classes;
    private double grade;

    public Student() {
    }

    public Student(int id, String name, String dayOfBirth, boolean gender, String classes, double grade) {
        super(id, name, dayOfBirth, gender);
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
                super.toString() +
                "classes='" + classes + '\'' +
                ", grade=" + grade +
                '}';
    }
}
