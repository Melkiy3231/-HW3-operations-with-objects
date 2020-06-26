package main.java.com.yaroslavshchur;
import main.java.com.yaroslavshchur.car.Car;
import main.java.com.yaroslavshchur.circle.Circle;
import main.java.com.yaroslavshchur.objcount.ObjCount;

public class Main {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle.getCircleArea(15));

            new ObjCount();
            new ObjCount();
            new ObjCount();
            new ObjCount();
            new ObjCount();
            System.out.println("Quantity of objects created : " +ObjCount.getCount());

            Car car = new Car();
            car.start();
            car.stop();
            car.drive();
            car.speed(60);
        }
    }
