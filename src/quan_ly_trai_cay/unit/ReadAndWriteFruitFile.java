package quan_ly_trai_cay.unit;

import quan_ly_trai_cay.model.Fruit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFruitFile {
    public List<Fruit> read(String path) {
        List<Fruit> fruitList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arr = line.split(",");
                Fruit fruit = new Fruit(arr[0], arr[1], arr[2], arr[3], arr[4]);
                fruitList.add(fruit);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fruitList;
    }

    public void write (String path, List<Fruit> fruitList){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Fruit f:fruitList) {
                bufferedWriter.write(f.getInToCsv());
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
