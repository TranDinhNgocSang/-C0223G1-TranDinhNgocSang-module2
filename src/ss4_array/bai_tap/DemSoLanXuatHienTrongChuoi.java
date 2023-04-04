package ss4_array.bai_tap;

public class DemSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        String str = "Tran Dinh Ngoc Sang";
        char cha = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (cha == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("số lầ ký tự '" + cha + "' xuất hiện trong chuỗi '" + str + "' là: " + count);
    }
}
