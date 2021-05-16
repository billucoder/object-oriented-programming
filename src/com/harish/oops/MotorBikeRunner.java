package com.harish.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {
        // write your code here
        MotorBike ducat = new MotorBike(300); //Motor Bike is class
        MotorBike benz = new MotorBike(200);  //Ducati benz are instances(
        MotorBike audi = new MotorBike(200);

//        ducat.start();  //instance calling the method
//        benz.start(); //Behaviour of this calls is start
//        ducat.setSpeed(100);
//        benz.setSpeed(80);
  ducat.increaseSpeed(100);
  benz.increaseSpeed(100);

  ducat.decreaseSpeed(50);
        benz.decreaseSpeed(500);
//        ducat.setSpeed(100);
//        int ducatSpeed= ducat.getSpeed();
//        ducatSpeed= ducatSpeed+100;
//        ducat.setSpeed(ducatSpeed);
//
//
        System.out.println(ducat.getSpeed());
//        benz.setSpeed(80);
//        int benzSpeed= benz.getSpeed();
//        benzSpeed=benzSpeed+100;
//        benz.setSpeed(benzSpeed);



        System.out.println(benz.getSpeed());

    }
}
