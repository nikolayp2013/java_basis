package examples;

import java.util.*;

public class Start {

    public static void main(String[] args) {
        example1();
    }

    public static void example1(){

//        hashSetExample();

//        treeSetExample();

        linkedHashSetExample();

    }

    public static void hashSetExample(){

        Set cars = new HashSet();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4); // добавление дубликата

        // проход по коллекции с помощью итератора
        Iterator iterator = cars.iterator();

        // not ordered - порядок получения не такой же, как порядок вставки
        while(iterator.hasNext()) {
            Car car = (Car) iterator.next();
            System.out.println(car.getName());
        }

    }

    // sorted
    public static void treeSetExample(){

//        TreeSet<Integer> tree = new TreeSet<Integer>();
        Set<Integer> tree = new TreeSet<Integer>();

        tree.add(34);
        tree.add(21);
        tree.add(67);
        tree.add(23);
        tree.add(676);
        tree.add(453);
        tree.add(23);

        Iterator<Integer> iterator = tree.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

    }

    // ordered
    public static void linkedHashSetExample(){

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        set.add(34);
        set.add(334);
        set.add(123);
        set.add(546);
        set.add(162);
        set.add(565);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
