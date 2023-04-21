package ss16_IO_Test_File.thuc_hanh.thuc_hanh_2;

import java.io.File;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
//        File = new File()
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("E:\\CodeGym\\module2\\src\\ss16_IO_Test_File\\thuc_hanh\\thuc_hanh_2\\numbers");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("E:\\CodeGym\\module2\\src\\ss16_IO_Test_File\\thuc_hanh\\thuc_hanh_2\\kequa", maxValue);
    }
}
