package ss12_java_collection_frame_work.bai_tap_2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UseMap {
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<>();
        String string = "aaaa bbbbbb ccccccccccccc dd";
        String newString = string.toLowerCase();
        for (int i = 0; i < newString.length(); i++) {
            if (map.containsKey(newString.charAt(i))) {
                map.put(newString.charAt(i), map.get(newString.charAt(i)) + 1);
            } else {
                map.put(newString.charAt(i), 1);
            }
        }
        Set<Character> charSet = map.keySet();
        for (Character c : charSet) {
            System.out.println(c + " - " + map.get(c));

        }

    }
}
