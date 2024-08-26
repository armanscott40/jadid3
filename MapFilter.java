import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapFilter {
    public static <K, V> Map<K, V> filterMapByKeys(Map<K, V> originalMap, List<K> keysToFilter) {
        Map<K, V> filteredMap = new HashMap<>();

        for (K key : keysToFilter) {
            if (originalMap.containsKey(key)) {
                filteredMap.put(key, originalMap.get(key));
            }
        }

        return filteredMap;
    }
}
