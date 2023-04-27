package FuramaResort.model;

import FuramaResort.utils.Level;
import FuramaResort.utils.Position;

public class Employee extends Person {
    private Level level;
    private Position position;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, String dateOfBirth, boolean gender, String citizenIDNumber,
                    String numberPhone, String email, Level level, Position position, double salary) {
        super(id, name, dateOfBirth, gender, citizenIDNumber, numberPhone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }


    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee " +super.toString()+
                "| level=" + level +
                "| position=" + position +
                "| salary=" + salary +
                '}';
    }

    public String getInToCsv (){
        return super.getId()+","+super.getName()+","+super.getDateOfBirth()+","+super.isGender()+","+
                super.getCitizenIDNumber()+","+super.getNumberPhone()+","+super.getEmail()+","+this.level+","+
                this.position+","+this.salary;
    }
}
