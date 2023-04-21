package ss16_IO_Test_File.bai_tap.bai_tap_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static List<String> read(String fileSource) {
        List<String> list = new ArrayList<>();
        File file = new File(fileSource);
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        String str = "";
        int count = 0;
        try {
            reader = new FileReader(file);
            bufferedReader = new BufferedReader(reader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
                count += line.length();
            }
            list.add(String.valueOf(count));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
            return list;
        }
    }

    public static void write(String fileTaget, List<String> list) {
        File file = new File(fileTaget);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String PATH = "E:\\CodeGym\\module2\\src\\ss16_IO_Test_File\\bai_tap\\bai_tap_1\\target file";
        List<String> list = read("E:\\CodeGym\\module2\\src\\ss16_IO_Test_File\\bai_tap\\bai_tap_1\\source file");
        write(PATH, list);
    }
}
