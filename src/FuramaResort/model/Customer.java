package FuramaResort.model;

import FuramaResort.utils.TypeCustomer;

public class Customer extends Person{
    private TypeCustomer typeCustomer;
    private String adress;

    public Customer() {
    }

    public Customer(String id, String name, String dateOfBirth, boolean gender, String citizenIDNumber, String numberPhone, String email, TypeCustomer typeCustomer, String adress) {
        super(id, name, dateOfBirth, gender, citizenIDNumber, numberPhone, email);
        this.typeCustomer = typeCustomer;
        this.adress = adress;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "| typeCustomer=" + typeCustomer +
                "| adress='" + adress + '\'' +
                '}';
    }

    public String getInToCsv (){
        return super.getId()+","+super.getName()+","+super.getDateOfBirth()+","+super.isGender()+","+
                super.getCitizenIDNumber()+","+super.getNumberPhone()+","+super.getEmail()+","+this.typeCustomer+","+
                this.adress;
    }

}
