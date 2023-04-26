package FuramaResort.model;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private boolean gender;
    private String citizenIDNumber;
    private String numberPhone;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String dateOfBirth, boolean gender, String citizenIDNumber, String numberPhonel, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.citizenIDNumber = citizenIDNumber;
        this.numberPhone = numberPhonel;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getCitizenIDNumber() {
        return citizenIDNumber;
    }

    public void setCitizenIDNumber(String citizenIDNumber) {
        this.citizenIDNumber = citizenIDNumber;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String sex;
        if (gender){
            sex = "male";
        }else {
            sex = "female";
        }
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\''+
                ", gender=" + sex +
                ", citizenIDNumber='" + citizenIDNumber + '\'' +
                ", numberPhonel='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
