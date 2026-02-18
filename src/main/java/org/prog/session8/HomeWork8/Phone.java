package org.prog.session8.HomeWork8;

import java.sql.SQLOutput;
import java.util.Objects;

public abstract class Phone implements IPhone {
    protected String color;
    protected String model;


    public Phone(String color, String model ) {
        if (color != null) {
            this.color = color;}
        else {
            this.color = "undefined color";
        }
        if (model != null) {
            this.model = model;
        }
        else {
            this.model = "unknown model";
        }
    }

    public void workWith (String name) {
        try {
            if (name == null) {
                throw new NullPointerException("No name");
            }
            System.out.print(color + " " + model);
            System.out.print(" ");
            unlockScreen();
            System.out.print(" ");
            System.out.print("and ");
            call(name);
        }
         catch (NullPointerException noName) {
            System.out.println("===========There is no name" + noName.getMessage() + "================");
        }
        finally {
            System.out.println("=========The end of working==========");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(color, phone.color) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model);
    }
}
