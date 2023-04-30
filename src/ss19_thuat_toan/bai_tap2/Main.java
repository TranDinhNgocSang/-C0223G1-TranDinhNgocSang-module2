package ss19_thuat_toan.bai_tap2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String string = sc.nextLine();
        String newString = string.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < newString.length(); i++) {
            if (map.containsKey(newString.charAt(i))){
                map.put(newString.charAt(i),map.get(newString.charAt(i))+1);
            }else{
                map.put(newString.charAt(i),1);
            }
        }
        Set<Character> charSet = map.keySet();
        for (Character c : charSet) {
            System.out.println(c + " - " + map.get(c));
        }
    }
}
