package com.harish.oops;

public class MotorBike {

private int speed; //instance variable //member vairable

    MotorBike(int speed){

        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed >0)
        this.speed = speed;

    }

    public void increaseSpeed(int howmuch){
        setSpeed(this.speed+howmuch);
    }
public void decreaseSpeed(int howmuch){
   setSpeed(this.speed-howmuch);
}
    void start() {
        System.out.println("Bike Started");

    }

}
