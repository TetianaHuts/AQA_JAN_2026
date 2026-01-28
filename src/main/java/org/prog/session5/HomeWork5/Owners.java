package org.prog.session5.HomeWork5;

public class Owners {
    public String name;
    public String ownedCar;
    public static Owners[] Owner =  new Owners[3];


    public void goTo ( String destination, int speed){
System.out.println(ownedCar + " owned by " + name + " is going to " + destination + " at " + speed);

    }

}
