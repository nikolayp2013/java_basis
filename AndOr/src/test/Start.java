package test;

public class Start {

    public static void main(String[] args) {

        /*if (condition1() && condition2()) {
            System.out.println("ok");
        }*/

        /*if (
                (condition1() && condition2()) &&
                (condition3() && condition4())
        ) {
            System.out.println("ok");
        }*/

        if (
                (condition1() || condition2())
//                    && (condition3() && condition4())
        ) {
            System.out.println("ok");
        }

    }

    public static boolean condition1() {
        System.out.println("condition1");
        return true;
    }

    public static boolean condition2() {
        System.out.println("condition2");
        return false;
    }

    public static boolean condition3() {
        System.out.println("condition3");
        return true;
    }

    public static boolean condition4() {
        System.out.println("condition4");
        return true;
    }
}
