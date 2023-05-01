package FuramaResort.utils;

import FuramaResort.model.Villa;

import java.io.*;
import java.util.*;

public class ReadAndWriteVillaFile {
    public Map<Villa, Integer> read(String path) {
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] str = line.split(",");
                Villa villa = new Villa(str[0], str[1], str[2], str[3], str[4], RentalType.valueOf(str[5]), str[6],
                        str[7], str[8]);
                int value = Integer.parseInt(str[9]);
                villaMap.put(villa, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaMap;
    }

    public void write(String path, Map<Villa, Integer> villaMap) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<Villa> villaSet = villaMap.keySet();
            for (Villa v : villaSet) {
                bufferedWriter.write(v.getInToCsv() + "," + villaMap.get(v));
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
