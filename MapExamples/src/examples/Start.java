package examples;

import java.util.*;

public class Start {

    public static void main(String[] args) {

        HashMap<String, Car> hashMap = new HashMap<String, Car>();

        hashMap.put("test", new Car("Toyota"));
        hashMap.put("key", new Car("BMW"));
        hashMap.put("niva", new Car("NIVA"));
        hashMap.put("car", new Car("Lexus"));

        iterateMap(hashMap); // порядок вставки по ключам не сохраняется при печати

        TreeMap<String, Car> treeMap = new TreeMap<String, Car>();

        treeMap.put("test", new Car("Toyota"));
        treeMap.put("key", new Car("BMW"));
        treeMap.put("niva", new Car("NIVA"));
        treeMap.put("car", new Car("Lexus"));
        treeMap.put("test", new Car("Audi")); // дублированный ключ происходит замена

        iterateMap(treeMap); // сортировка по ключам (в алфавитном порядке)

        LinkedHashMap<String, Car> linkedHashMap = new LinkedHashMap<String, Car>();

        linkedHashMap.put("test", new  Car("Toyota"));
        linkedHashMap.put("key", new  Car("BMW"));
        linkedHashMap.put("niva", new  Car("NIVA"));
        linkedHashMap.put("car", new  Car("Lexus"));

        iterateMap(linkedHashMap); // сохраняем порядок вставки

        System.out.println();
        System.out.println("higherKey = " + treeMap.higherKey("key"));

        System.out.println("higherEntry = " + treeMap.higherEntry("key"));

    }

    private static void iterateMap(Map map) {
        System.out.println();

        Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Car> carEntry = iterator.next();
            System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
            //iterator.remove(); // можно удалять элементы после обработки
        }
    }

}
