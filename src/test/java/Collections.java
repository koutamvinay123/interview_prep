import java.util.LinkedHashMap;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Test",90);
        map.put("Nice",80);
        for(Map.Entry<String,Integer> mp : map.entrySet()){
System.out.println(mp.getValue());
        }
    }
}
