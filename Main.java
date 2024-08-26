import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // ایجاد یک مپ نمونه
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 3);
        originalMap.put("D", 4);


        // ایجاد یک لیست از کلیدها برای فیلتر کردن
        List<String> keysToFilter = new ArrayList<>();
        keysToFilter.add("B");
        keysToFilter.add("D");
        keysToFilter.add("E"); // این کلید در مپ وجود ندارد

        // فراخوانی متد filterMapByKeys
        Map<String, Integer> filteredMap = MapFilter.filterMapByKeys(originalMap, keysToFilter);

        // نمایش مپ فیلتر شده

        System.out.println("مپ فیلتر شده: " + filteredMap);
    }
}
