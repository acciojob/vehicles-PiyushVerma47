package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;

        this.currentGear = 1;
    }

    public void changeGear(int newGear){
        currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getSeats() {
        return seats;
    }
}






//package com.driver;
//
//public class F1 extends Car {
//
//    public F1(String name, boolean isManual) {
//        //Use arbitrary values for parameters which are not mentioned
//        super(name, 4, 2, 6, true, "Super Car", 2);
//    }
//
//    public void accelerate(int rate){
//         int newSpeed = getCurrentSpeed() + rate;; //set the value of new speed by using currentSpeed and rate
//        /**
//         * speed 0: gear 1
//         * speed 1-50: gear 1
//         * speed 51-100: gear 2
//         * speed 101-150: gear 3
//         * speed 151-200: gear 4
//         * speed 201-250: gear 5
//         * speed more than 250: gear 6
//         */
//
//        if(newSpeed == 0) {
//            //Stop the car, set gear as 1
//            stop();
//            changeGear(1);
//        }
//        //for all other cases, change the gear accordingly
//        else if (newSpeed >= 1 && newSpeed <= 50) {
//            changeGear(1);
//
//        }
//        else if (newSpeed >= 51 && newSpeed <= 100) {
//            changeGear(2);
//
//        }
//        else if (newSpeed >= 101 && newSpeed <= 150) {
//            changeGear(3);
//
//        }
//        else if (newSpeed >= 151 && newSpeed <= 200) {
//            changeGear(4);
//
//        }
//        else if (newSpeed >= 201 && newSpeed <= 250) {
//            changeGear(5);
//
//        }
//        else if(newSpeed > 250){
//            changeGear(6);
//        }
//        //for all other cases, change the gear accordingly
//
//        if(newSpeed > 0) {
//            changeSpeed(newSpeed, getCurrentDirection());
//        }
//    }
//}
