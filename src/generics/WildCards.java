package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void deleteBike(List<? extends Bike> bikes, Bike bike) {
        bikes.remove(bike);
        System.out.println("bike removed");
    }

    public static void addBike(List<? super Bullet> bikes) {
        bikes.add(new Bullet("classic"));
        System.out.println("bike added");
    }

    public static void printItems(List<?> list) {
        for (Object i: list) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        List<Vehicle> v1 = new ArrayList<>();
        List<Bullet> b1 = new ArrayList<>();
//        List<Car> c1 = new ArrayList<>();

        addBike(v1);
        addBike(b1);
//        addBike(Collections.singletonList(c1));
        printItems(b1);
        printItems(v1);

        Bullet bike1 = b1.get(0);
        deleteBike(b1, bike1);
        printItems(b1);
    }
}

class Vehicle{
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Car extends Vehicle{
    String name;

    public Car(String name) {
        super(name);
    }
}

class Bike extends Vehicle{
    String name;

    public Bike(String name) {
        super(name);
    }
}

class Bullet extends Bike{
    String name;

    public Bullet(String name) {
        super(name);
    }
}