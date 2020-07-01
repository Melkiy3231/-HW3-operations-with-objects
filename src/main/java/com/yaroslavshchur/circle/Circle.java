package main.java.com.yaroslavshchur.circle;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getCircleArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Area of the circle = " + getCircleArea();
    }
}
