package org.prog.session5.SomeMoreExercise;

public class Planet {

    public String planetName;
    public Starship dockedShip;


    public static Planet Mars = new Planet();
    public static Planet Venus = new Planet();

    public void printReport (){
        System.out.println(planetName + " accepted " + dockedShip.shipName + ". Fuel level: " + dockedShip.fuel);
    }

}
