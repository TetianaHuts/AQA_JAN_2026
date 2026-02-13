package org.prog.session8.HomeWork8;

public class Android extends Phone {
    public Android(String color, String model) {
        super(color, model);
    }
    @Override
    public void call (String someone) {
        System.out.println("Android called " + someone);
    }

    @Override
    public void unlockScreen() {
        System.out.println("Android unlocked the screen");
    }

}
