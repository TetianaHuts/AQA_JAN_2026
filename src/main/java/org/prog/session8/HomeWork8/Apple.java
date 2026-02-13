package org.prog.session8.HomeWork8;

public class Apple extends Phone {

    public Apple(String color, String model) {
        super(color, model);
    }


    @Override
    public void call (String someone) {
        System.out.println("Iphone called " + someone);
    }

    @Override
    public void unlockScreen() {
        System.out.println("Iphone unlocked the screen");
    }



}
