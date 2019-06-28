package ru.javabegin.training.syntax.var;

public class Car {

//    private int i = 0;
//    private String name = null;
    private int i = 5, z = 6;
    private int x = 7;
    private String name;
    private int j = 7;

    public Car(int i, String name) {
        this.i = i;
        this.name = name;
    }

    private void test() {
        i = 4;
//        int j = 4;
//        go(j);
    }

    public void go() {
        int count = 0;
        count++;
        System.out.println(i);

        if (count > 8) {
            int j = 5;
        }
        int j = 6;
    }


    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }
}
