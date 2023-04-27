package FuramaResort.utils;

import FuramaResort.model.Customer;
import FuramaResort.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaAndWriteFileCustomer {
    public List<Customer> read(String path) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] str = line.split(",");
                Customer customer = new Customer(str[0],str[1],str[2],Boolean.parseBoolean(str[3]),str[4],str[5],str[6],
                        TypeCustomer.valueOf(str[7]),str[8]);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
    public void write(String path, List<Customer> customerList){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer c:customerList) {
                bufferedWriter.write(c.getInToCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
