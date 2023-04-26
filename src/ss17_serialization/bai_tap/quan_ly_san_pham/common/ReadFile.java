package ss17_serialization.bai_tap.quan_ly_san_pham.common;

import ss17_serialization.bai_tap.quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public String PATH = "E:\\CodeGym\\module2\\src\\ss17_serialization\\bai_tap\\quan_ly_san_pham\\repository\\data.csv";

    public List<Product> read() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<Product> list = null;
        try {
            File file = new File(PATH);
            if (file.length() == 0) {
                list = new ArrayList<>();
            } else {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                list = (List<Product>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

}
