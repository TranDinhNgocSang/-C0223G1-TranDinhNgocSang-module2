package FuramaResort.utils;

import FuramaResort.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileEmployee {
    public List<Employee> read(String path) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] str = line.split(",");
                Employee employee = new Employee(str[0],str[1],str[2],Boolean.parseBoolean(str[3]),str[4],str[5],str[6],
                        Level.valueOf(str[7]),Position.valueOf(str[8]));
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
    public void write(String path, List<Employee> employeeList){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e:employeeList) {
                bufferedWriter.write(e.getInToCsv());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
