package ss17_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String sourceFile = "E:\\CodeGym\\module2\\src\\ss17_serialization\\bai_tap\\copy_file_nhi_phan\\source_file";
        String targetFile = "E:\\CodeGym\\module2\\src\\ss17_serialization\\bai_tap\\copy_file_nhi_phan\\target_file";

        // Kiểm tra file nguồn có tồn tại không
        File file = new File(sourceFile);
        if (!file.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        // Kiểm tra file đích đã tồn tại chưa
        file = new File(targetFile);
        if (!file.exists()) {
            System.out.println("Target file already exists.");
            return;
        }

        // Sao chép file nguồn vào đích
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(targetFile);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Hiển thị số byte trong tệp đích
        file = new File(targetFile);
        System.out.println("File copied successfully. Size: " + file.length() + " bytes.");
    }
}



