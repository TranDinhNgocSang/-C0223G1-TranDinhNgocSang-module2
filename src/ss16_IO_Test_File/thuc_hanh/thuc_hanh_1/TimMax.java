package ss16_IO_Test_File.thuc_hanh.thuc_hanh_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TimMax {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File("E:\\CodeGym\\module2\\src\\ss16_IO_Test_File\\thuc_hanh\\thuc_hanh_1\\number");
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
