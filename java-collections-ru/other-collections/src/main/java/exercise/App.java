package exercise;

import java.util.*;

// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Set<String> keys1 = map1.keySet();
        Set<String> keys2 = map2.keySet();

        Map<String, String> result = new HashMap<>();

        for (String key : keys2) {
            if (!keys1.contains(key)) {
                result.put(key, "added");
            } else {
                if (map1.get(key).equals(map2.get(key))) {
                    result.put(key, "unchanged");
                } else {
                    result.put(key, "changed");
                }
            }
        }

        for (String key : keys1) {
            if (!keys2.contains(key)) {
                result.put(key, "deleted");
            }
        }
        return result;
    }
}
//END
