package org.prog.collections.session11.HomeWok11;

import java.util.Objects;

public class Phones {
    private String color;

    public Phones(String color) {
        if (color != null) {
            this.color = color;
        }
        else {
            this.color = "undefined color";
        }
    }

    @Override
    public String toString() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Phones phones = (Phones) o;
        return Objects.equals(color, phones.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }


}
