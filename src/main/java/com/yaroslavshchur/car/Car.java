package main.java.com.yaroslavshchur.car;

public class Car {
    private double speed;
    private boolean isMotorOn;
    private boolean isDrive;


    public void useStop() {
        isDrive = false;
        speed = 0;
    }

    public void setMotorOn() {
        if (isMotorOn = false) {
            isMotorOn = true;
        }
    }

    public void setMotorOff() {
        if (isMotorOn) {
            isMotorOn = false;
        }
    }

    public void speedKeeping(double speed) {
        if (isMotorOn && isDrive) {
            this.speed = speed;
        }
    }

    public void drive() {
        if (isMotorOn) {
            isDrive = true;
        }
    }
}
