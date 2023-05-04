package FuramaResort.repository;
import FuramaResort.model.Customer;
import FuramaResort.utils.*;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    private static List<Customer> customerList = new ArrayList<>();
    private final static String CUSTOMER_FILE_PATH = "E:\\CodeGym\\my-new-project\\src\\FuramaResort\\data\\customer_data.csv";
    ReaAndWriteFileCustomer reaAndWriteFileCustomer = new ReaAndWriteFileCustomer();

    @Override
    public List<Customer> getList() {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        return customerList;
    }

    @Override
    public void addNew(Customer customer) {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        customerList.add(customer);
        reaAndWriteFileCustomer.write(CUSTOMER_FILE_PATH,customerList);
    }

    @Override
    public int getIndexToID(String id) {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void editID(int index, String id) {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        customerList.get(index).setId(id);
        reaAndWriteFileCustomer.write(CUSTOMER_FILE_PATH,customerList);
    }

    @Override
    public void editName(int index, String name) {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        customerList.get(index).setName(name);
        reaAndWriteFileCustomer.write(CUSTOMER_FILE_PATH,customerList);
    }

    @Override
    public void editDateOfBirth(int index, String dateOfBirth) {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        customerList.get(index).setDateOfBirth(dateOfBirth);
        reaAndWriteFileCustomer.write(CUSTOMER_FILE_PATH,customerList);
    }

    @Override
    public void editGender(int index, boolean gender) {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        customerList.get(index).setGender(gender);
        reaAndWriteFileCustomer.write(CUSTOMER_FILE_PATH,customerList);
    }

    @Override
    public void editCitizenIDNumber(int index, String citizenIDNumber) {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        customerList.get(index).setCitizenIDNumber(citizenIDNumber);
        reaAndWriteFileCustomer.write(CUSTOMER_FILE_PATH,customerList);
    }

    @Override
    public void editNumberPhone(int index, String numberPhone) {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        customerList.get(index).setNumberPhone(numberPhone);
        reaAndWriteFileCustomer.write(CUSTOMER_FILE_PATH,customerList);
    }

    @Override
    public void editEmail(int index, String email) {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        customerList.get(index).setEmail(email);
        reaAndWriteFileCustomer.write(CUSTOMER_FILE_PATH,customerList);
    }

    @Override
    public void editTypeCustomer(int index, TypeCustomer typeCustomer) {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        customerList.get(index).setTypeCustomer(typeCustomer);
        reaAndWriteFileCustomer.write(CUSTOMER_FILE_PATH,customerList);
    }

    @Override
    public void editAdress(int index, String adress) {
        customerList = reaAndWriteFileCustomer.read(CUSTOMER_FILE_PATH);
        customerList.get(index).setAdress(adress);
        reaAndWriteFileCustomer.write(CUSTOMER_FILE_PATH,customerList);
    }


}
