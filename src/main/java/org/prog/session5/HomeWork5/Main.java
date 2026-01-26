package org.prog.session5.HomeWork5;

import static org.prog.session5.HomeWork5.Cars.*;
import static org.prog.session5.HomeWork5.Owner.*;

public class Main {
    public static void main(String[] args) {

        FirstCar.brand = "Audi";
        SecondCar.brand = "BMW";
        ThirdCar.brand = "Porsche";

        First.name = "Alice";
        Second.name = "Bob";
        Third.name = "Elsa";

        First.ownedCar = FirstCar.brand;
        Second.ownedCar = SecondCar.brand;
        Third.ownedCar = ThirdCar.brand;
        First.goTo("Kyiv", 90);
        Second.goTo("Lviv", 85);
        Third.goTo("Odessa", 100);

    }
}
