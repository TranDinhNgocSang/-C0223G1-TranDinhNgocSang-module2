package FuramaResort.repository;

import FuramaResort.model.Customer;
import FuramaResort.utils.TypeCustomer;

import java.util.List;

public interface ICustomerRepository{
    List<Customer> getList();
    void addNew (Customer customer);
    int getIndexToID (String id);
    void editID(int index, String id);
    void editName(int index, String name);
    void editDateOfBirth(int index, String dateOfBirth);
    void editGender(int index, boolean gender);
    void editCitizenIDNumber(int index, String citizenIDNumber);
    void editNumberPhone(int index, String numberPhone);
    void editEmail(int index, String email);
    void editTypeCustomer(int index, TypeCustomer typeCustomer);
    void editAdress(int index, String adress);
}
