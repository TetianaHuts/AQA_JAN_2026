package org.prog.session5.SomeMoreExercise;

import static org.prog.session5.SomeMoreExercise.Planet.Mars;
import static org.prog.session5.SomeMoreExercise.Planet.Venus;
import static org.prog.session5.SomeMoreExercise.Starship.*;

public class Main {
    public static void main (String[] args){
        String name;
        Mars.planetName = "Mars";
        Venus.planetName = "Venus";
        Ship1.shipName = "Vostok";
        Ship2.shipName = "Falcon";
        Ship3.shipName = "Enterprise";

        Ship1.fuel = 500;
        Ship1.fuel = 1200;
        Ship1.fuel = 2500;

        Mars.dockedShip = Ship1;
        Mars.printReport();
    }
}
