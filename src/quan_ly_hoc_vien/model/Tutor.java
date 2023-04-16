package quan_ly_hoc_vien.model;

public class Tutor extends Person{
    private String specialize;

    public Tutor() {
    }
    public Tutor(int id, String name, String dayOfBirth, boolean gender, String specialize) {
        super(id, name, dayOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Tutor{" +super.toString()+
                "specialize='" + specialize + '\'' +
                '}';
    }
}
