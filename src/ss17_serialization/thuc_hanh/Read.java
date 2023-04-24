package ss17_serialization.thuc_hanh;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        FileInputStream file = new FileInputStream("E:\\CodeGym\\module2\\src\\ss17_serialization\\thuc_hanh\\object.dat");
        ObjectInputStream input = new ObjectInputStream(file);
        try {
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date)(input.readObject());
            System.out.println(name+" "+score+" "+date);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
