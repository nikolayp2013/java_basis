package com.company.main;

public class Start {

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = c1; // две переменные ссылаются на один объект
        Car c3 = new Car();

        // если одна переменная изменит значение объекта вторая переменная будет "видеть" все изменения
        c1.setName("BMW");
        System.out.println("c1.getName() = " + c1.getName());

//        c2.setName("Toyota");
//        System.out.println("c2.getName() = " + c2.getName());

//        System.out.println("c1.getName() = " + c1.getName());
//        System.out.println("c1.getName() = " + c1.getName().length()); // java.lang.NullPointerException

        //c1 = null;

        //System.out.println("c1.getName() = " + c1.getName()); // java.lang.NullPointerException

        c1 = null;
        c2 = null;
        c3.setName("Niva");
    }
}
