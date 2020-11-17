package com.company;

public class Polonez extends Car {
    static private final int MAX_SPEED = 180;

    public Polonez (String color){
        super(color, MAX_SPEED);
        // initialize Polonez
    }

    @Override
    public void drive() {
        System.out.println("Polonez colored "+getColor()+" is driving with "+getMaxSpeed()+"km/h");
    }
}
