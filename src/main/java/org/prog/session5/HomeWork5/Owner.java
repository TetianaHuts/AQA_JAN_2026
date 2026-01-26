package org.prog.session5.HomeWork5;

public class Owner {
    public String name;
    public String ownedCar;
    public static Owner First = new Owner();
    public static Owner Second = new Owner();
    public static Owner Third = new Owner();

    public void goTo ( String destination, int speed){
System.out.println(ownedCar + " owned by " + name + " is going to " + destination + " at " + speed);

    }

}
