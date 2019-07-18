package examples;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Start {

    public static void main(String[] args) {

       // FIFO - first in first out
//        Queue<Car> cars = new ArrayBlockingQueue<Car>(5); // ограничение на количество элементов
        Deque<Car> cars = new ArrayDeque<Car>();

        Car car1 = new Car("Nissan");
        Car car2 = new Car("BMW");
        Car car3 = new Car("Toyota");
        Car car4 = new Car("KIA");
        Car car5 = new Car("NIVA");
        Car car6 = new Car("Lexus");

//        cars.add(car1);
//        cars.add(car2);
//        cars.add(car3);
//        cars.add(car4);
//        cars.add(car5);
//        cars.add(car6);
//
//        System.out.println("cars.element() = " + cars.element()); // получение верхнего элемента без удаление из очереди
//
//        System.out.println("cars.remove() = " + cars.remove()); // получение верхнего элемента с удалением из очереди

//        LIFO - last in first out
//        Queue lifoQueue = Collections.asLifoQueue(cars);
//
//        lifoQueue.add(car1);
//        lifoQueue.add(car2);
//        lifoQueue.add(car3);
//        lifoQueue.add(car4);
//        lifoQueue.add(car5);
//        lifoQueue.add(car6);
//
//        System.out.println("lifoQueue.element() = " + lifoQueue.element()); // получение верхнего элемента без удаление из очереди
//
//        System.out.println("lifoQueue.remove() = " + lifoQueue.remove()); // получение верхнего элемента с удалением из очереди

        Stack stack = new Stack();
        stack.add(car1);
        stack.add(car2);
        stack.add(car3);
        stack.add(car4);
        stack.add(car5);
        stack.add(car6);

        System.out.println("stack.peek() = " + stack.peek()); // получение верхнего элемента без удаление из очереди

        System.out.println("stack.pop() = " + stack.pop()); // получение верхнего элемента с удалением из очереди

        System.out.println("stack.pop() = " + stack.pop()); // получение верхнего элемента с удалением из очереди

    }
}
