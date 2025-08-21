package Service;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String s = "abbcccdddddeeee";
        char[] ch = s.toCharArray();
        Map<Character, Integer> mp = new HashMap<>();
        for (char c:ch) {
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        char k = ' ';
        int count = 0;
        System.out.println(mp);
        for(Map.Entry<Character, Integer> t : mp.entrySet()){
            if(t.getValue() > count){
                k = t.getKey();
                count = t.getValue();
            }
        }
        System.out.println(k);
    }
}
