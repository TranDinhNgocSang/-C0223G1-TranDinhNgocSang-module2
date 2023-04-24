package ss16_IO_Test_File.bai_tap.bai_tap_2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("E:\\CodeGym\\module2\\src\\ss16_IO_Test_File\\bai_tap\\bai_tap_2\\text");
        BufferedReader br = null;
        FileReader reader;
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String line;
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            while ((line = br.readLine()) != null) {
               String[] strings = line.split(",");
                System.out.println("Country [id= "
                        + strings[0]
                        + ", code= " + strings[1]
                        + " , name=" + strings[2]
                        + "]");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
