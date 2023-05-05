package FuramaResort.utils;

import FuramaResort.model.Contract;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteContractFile {
    public List<Contract> read(String path) {
        List<Contract> contractList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] str = line.split(",");
                Contract contract = new Contract(str[0],str[1],str[2],str[3]);
                contractList.add(contract);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contractList;
    }
    public void write(String path, List<Contract> contractList){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Contract c:contractList) {
                bufferedWriter.write(c.getTnToCsv());
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
