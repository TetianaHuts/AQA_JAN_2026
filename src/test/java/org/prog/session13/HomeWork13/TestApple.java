package org.prog.session13.HomeWork13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.prog.session8.HomeWork8.Apple;

import java.util.Random;

public class TestApple {

    //TODO: Using class Androind OR Apple:
//TODO: Add field int modelNumber
//TODO: Assign model as random 1-5
//TODO: Write test that confirms model number is 3 or above

    @Test
public void testApple(){
        System.out.println("====Apple Test====");
        Apple phone1 = new Apple ( "white", "14 Pro Max");
        System.out.println("Model Number: " + phone1.modelNumber);
        Assertions.assertTrue(phone1.modelNumber >= 3);
        System.out.println("End of test");

}

}
