package in.coll;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Abhishek", 1);
        map.put("a", 1);
        map.put("a", 1); // Duplicate key, will overwrite the previous "a"
        map.put("b", 1);

        for (Map.Entry<String, Integer> demo : map.entrySet()) {
            System.out.println("Key: " + demo.getKey() + ", Value: " + demo.getValue());
        }
    }
}
