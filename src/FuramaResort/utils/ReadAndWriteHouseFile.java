package FuramaResort.utils;

import FuramaResort.model.House;
import FuramaResort.model.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteHouseFile {
    public Map<House, Integer> read(String path) {
        Map<House, Integer> houseMap = new LinkedHashMap<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] str = line.split(",");
                House house = new House(str[0], str[1], str[2], str[3], str[4], RentalType.valueOf(str[5]), str[6], str[7]);
                int value = Integer.parseInt(str[8]);
                houseMap.put(house, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseMap;
    }

    public void write(String path, Map<House, Integer> houseMap) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<House> houseSet = houseMap.keySet();
            for (House h : houseSet) {
                bufferedWriter.write(h.getInToCsv() + "," + houseMap.get(h));
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
