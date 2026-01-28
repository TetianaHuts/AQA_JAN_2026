package org.prog.session5.HomeWork5;

import static org.prog.session5.HomeWork5.Cars.*;
import static org.prog.session5.HomeWork5.Owners.Owner;

public class Main {
    public static void main(String[] args) {

        Car[0] = new Cars();
        Car[0].brand = "Audi";
        Owner[0] = new Owners();
        Owner[0].name = "Alice";
        Owner[0].ownedCar = Car[0].brand;

        Car[1] = new Cars();
        Car[1].brand = "BMW";
        Owner[1] = new Owners();
        Owner[1].name = "Bob";
        Owner[1].ownedCar = Car[1].brand;

        Car[2] = new Cars();
        Car[2].brand = "Porsche";
        Owner[2] = new Owners();
        Owner[2].name = "Elsa";
        Owner[2].ownedCar = Car[2].brand;

        Owner[0].goTo("Kyiv", 90);
        Owner[1].goTo("Lviv", 85);
        Owner[2].goTo("Odessa", 100);

    }
}
