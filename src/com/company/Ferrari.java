package com.company;

public class Ferrari extends Car {
    static private final int MAX_SPEED = 300;

    public Ferrari (String color){
        super(color, MAX_SPEED);
        // initialize Ferrari
    }

    @Override
    public void drive() {
        System.out.println("Ferrari colored "+getColor()+" is driving with "+getMaxSpeed()+"km/h");
    }
}
