package examples;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Car car) {
        return this.getName().compareTo(car.getName());
    }

    @Override
    public String toString() {
        return "Car(" +
                "name='" + name + '\'' +
                ')';
    }
}
