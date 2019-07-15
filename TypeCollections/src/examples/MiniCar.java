package examples;

public class MiniCar extends Car {

    public MiniCar(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("minicar drive");
    }
}
