package study.blaife.basic.container.map;

import java.util.*;

/**
 * HashMap 循环案例
 *
 * @author: magd39318
 * @date: 2022/5/5 16:52
 */
public class ForTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "壹");
        map.put("2", "贰");
        map.put("3", "叁");
        map.put("4", "肆");
        map.put("5", "伍");

        forEachForEntry(map);
        forEachForKey(map);
        forEachForValues(map);
    }

    /**
     * entrySet 方法进行循环
     * @param map
     */
    public static void forEachForEntry(Map<String, String> map) {
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println("----------------entrySet(forEach)---------------");
        entrySet.stream().forEach(a -> {
            System.out.print(a.getKey() + ":" + a.getValue() + ",");
        });
        System.out.println();

        System.out.println("----------------entrySet(Iterator)---------------");
        Iterator<Map.Entry<String, String>> setiterator = entrySet.iterator();
        while (setiterator.hasNext()) {
            Map.Entry<String, String> entry = setiterator.next();
            System.out.print(entry.getKey() + ":" + entry.getValue() + ",");
        }
        System.out.println();
    }

    /**
     * keySet 方法进行循环
     * @param map
     */
    public static void forEachForKey(Map<String, String> map) {
        Set<String> sets = map.keySet();
        System.out.println("----------------keySet(forEach)---------------");
        sets.stream().forEach(a -> {
            System.out.print(a + ":" + map.get(a) + ",");
        });
        System.out.println();

        System.out.println("----------------keySet(Iterator)---------------");
        Iterator<String> setiterator = sets.iterator();
        while (setiterator.hasNext()) {
            String key = setiterator.next();
            System.out.print(key + ":" + map.get(key) + ",");
        }
        System.out.println();
    }

    /**
     * values 方法进行循环
     * @param map
     */
    public static void forEachForValues(Map<String, String> map) {
        Collection<String> values = map.values();
        System.out.println("----------------values(forEach)---------------");
        values.stream().forEach(a -> {
            System.out.print(a + ",");
        });
        System.out.println();

        System.out.println("----------------values(Iterator)---------------");
        Iterator valueIterator = values.iterator();
        while (valueIterator.hasNext()) {
            System.out.print(valueIterator.next() + ",");
        }
        System.out.println();
    }
}
