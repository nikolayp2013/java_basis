package examples;

import java.util.*;

public class Start {

    public static void main(String[] args) {
        example1();
    }

    public static void example1(){

//        arrayListExamples();

        linkedListExamples();

    }

    public static void arrayListExamples(){

        ArrayList<Car> cars = new ArrayList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4); // можно добавлять дубли

        cars.add(new Car("Toyota")); // создание объекта в месте добавления

        System.out.println("cars.size() = " + cars.size()); // размер коллекции

        System.out.println("cars.contains(car2) = " + cars.contains(car2)); // содержит ли коллекция определенный объект

        int index = cars.indexOf(car3);

        System.out.println("index = " + index); // получение индекса элемента (индексация с нуля)

        Car selectedCar = cars.get(3); // получение объекта по индексу

        System.out.println("selectedCar = " + selectedCar.getName());

        // проход по коллекции с помощью итератора
        // ordered
        Iterator<Car> iterator = cars.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        cars.clear(); // щчистка коллекции
        System.out.println("cars.isEmpty() = " + cars.isEmpty()); // пустая ли коллекция

//        selectedCar = cars.get(3); // ошибка IndexOutOfBoundsException, т.к. по этому индексу нет объекта

    }

    public static void linkedListExamples() {

        LinkedList<Car> cars = new LinkedList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Toyota");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.addFirst(car4);

        //cars.addLast(car1);

        //Iterator<Car> iterator = cars.descendingIterator(); // итератор в обратную сторону
        Iterator<Car> iterator = cars.iterator(); // итератор в обратную сторону

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
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
