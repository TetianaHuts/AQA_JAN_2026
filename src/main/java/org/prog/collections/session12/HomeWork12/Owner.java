package org.prog.collections.session12.HomeWork12;

import java.util.Objects;

public class Owner {

    private String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(name, owner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
