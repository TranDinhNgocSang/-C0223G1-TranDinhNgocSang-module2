package FuramaResort.utils;

import FuramaResort.model.House;
import FuramaResort.model.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteRoomFile {
    public Map<Room, Integer> read(String path) {
        Map<Room, Integer> roomMap = new LinkedHashMap<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] str = line.split(",");
                Room room = new Room(str[0], str[1], str[2], str[3], str[4], RentalType.valueOf(str[5]), str[6]);
                int value = Integer.parseInt(str[7]);
                roomMap.put(room, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomMap;
    }

    public void write(String path, Map<Room, Integer> roomMap) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<Room> roomSet = roomMap.keySet();
            for (Room r : roomSet) {
                bufferedWriter.write(r.getInToCsv() + "," + roomMap.get(r));
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
