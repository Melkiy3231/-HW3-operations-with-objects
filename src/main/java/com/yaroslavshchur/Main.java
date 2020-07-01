package main.java.com.yaroslavshchur;

import main.java.com.yaroslavshchur.car.Car;
import main.java.com.yaroslavshchur.circle.Circle;
import main.java.com.yaroslavshchur.objcount.ObjCount;

public class Main {
    private static final double RADIUS = 8.6d;

    public static void main(String[] args) {
        Circle circle = new Circle(RADIUS);
        System.out.println(circle);

        new ObjCount();
        new ObjCount();
        new ObjCount();
        new ObjCount();
        new ObjCount();
        System.out.println("Quantity of objects created : " + ObjCount.getCount());

        Car car = new Car();
        car.setMotorOn();
        car.drive();
        car.speedKeeping(50);
        car.useStop();
        car.setMotorOff();

    }
}
