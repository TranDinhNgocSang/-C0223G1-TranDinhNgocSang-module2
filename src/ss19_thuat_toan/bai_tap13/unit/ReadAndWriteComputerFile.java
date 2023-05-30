package ss19_thuat_toan.bai_tap13.unit;

import ss19_thuat_toan.bai_tap13.model.Computer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteComputerFile {
    public List<Computer> read(String path){
        List<Computer> computerList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null&& !line.equals("")){
                String[] arr = line.split(",");
                Computer computer = new Computer(arr[0],arr[1],Double.parseDouble(arr[2]),arr[2]);
                computerList.add(computer);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return computerList;
    }

    public void write(String path, List<Computer> computerList){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Computer c:computerList) {
                bufferedWriter.write(c.getToCsv());
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
