package ru.javabegin.training.syntax.var;

public class Start {

    public static void main (String[] args) {
        Car car = new Car();
        car.setName("Toyota");

        Start start = new Start();
        car.setName(start.getString(car.getName()));

        // soutv + tab
        System.out.println("car.getName() = " + car.getName());

        car.setName("BMW");

        car = null;
    }

    public String getString(String name){
        return name + "!!!";
    }
}

