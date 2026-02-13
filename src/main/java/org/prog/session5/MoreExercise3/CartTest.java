package org.prog.session5.MoreExercise3;

public class CartTest {


    public void runTest(boolean onlyAvailable){
        double totalPrice = 0;
        for (int i = 0; i < Warehouse.GlobalItem.length; i++) {
            if (Warehouse.GlobalItem[i] == null) {
                continue;
            }
            if (onlyAvailable && !Warehouse.GlobalItem[i].availability) {
                continue;
            }

            totalPrice += Warehouse.GlobalItem[i].Price;
        }
            if (totalPrice > 500){
                System.out.println("Test Passed: Premium order");
            }
            if (totalPrice < 500){
                System.out.println("Test Passed: Budget order");
            }
    }
}

