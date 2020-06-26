package main.java.com.yaroslavshchur.car;

public class Car {
    public void start() {
        System.out.println("Car start up");
    }

    public void stop() {
        System.out.println("The car is muffled");
    }

    public void drive() {
        System.out.println("Car rides");
    }

    public void speed(int x) {
        System.out.println("Car's speed is : " + x);
    }
}