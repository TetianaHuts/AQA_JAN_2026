package org.prog.session5.MoreExercise3;

import static org.prog.session5.MoreExercise3.Warehouse.GlobalItem;

public class Main {
    public static void main (String[] args){
        GlobalItem[0] = new Warehouse();
        GlobalItem[0].Item = "Tomato";
        GlobalItem[0].Price = 101.5;
        GlobalItem[0].availability = false;

        GlobalItem[1] = new Warehouse();
        GlobalItem[1].Item = "Bread";
        GlobalItem[1].Price = 32;
        GlobalItem[1].availability = true;

        GlobalItem[2] = new Warehouse();
        GlobalItem[2].Item = "Eggs";
        GlobalItem[2].Price = 86.5;
        GlobalItem[2].availability = false;

        GlobalItem[3] = new Warehouse();
        GlobalItem[3].Item = "Chicken";
        GlobalItem[3].Price = 232;
        GlobalItem[3].availability = true;

        GlobalItem[4] = new Warehouse();
        GlobalItem[4].Item = "Rice";
        GlobalItem[4].Price = 48;
        GlobalItem[4].availability = true;

        GlobalItem[5] = new Warehouse();
        GlobalItem[5].Item = "Soy Sauce";
        GlobalItem[5].Price = 115;
        GlobalItem[5].availability = true;

CartTest MyTest = new CartTest();
MyTest.runTest(true);
MyTest.runTest(false);
    }
}