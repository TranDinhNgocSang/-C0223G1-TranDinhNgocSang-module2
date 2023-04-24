package ss17_serialization.thuc_hanh;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("E:\\CodeGym\\module2\\src\\ss17_serialization\\thuc_hanh\\object.dat");
        ObjectOutputStream output=new ObjectOutputStream(file);
        try {
            output.writeUTF("Sang");
            output.writeDouble(3.14);
            output.writeObject(new java.util.Date());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
