package FuramaResort.utils;

import FuramaResort.model.Booking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBookingFile {
    public List<Booking> read(String path) {
        List<Booking> bookingList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] str = line.split(",");
                Booking booking = new Booking(str[0],str[1],str[2],str[3],str[4],str[5]);
                bookingList.add(booking);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingList;
    }
    public void write(String path, List<Booking> bookingList){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking b:bookingList) {
                bufferedWriter.write(b.getInToCsv());
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
