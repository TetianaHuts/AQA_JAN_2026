package org.prog.collections.session12.HomeWork12;

import java.util.*;

public class Main {

    //TODO: Write Map that will allow multiple different people to own several unique phones each
//TODO: * - I should be able to find phones for new Owner("Name_Of_Owner");
//TODO: Map<...> phoneOwners = new HashMap<>();
//TODO: phoneOwners.put(owner1, ...);
//TODO: phoneOwners.put(owner2, ...);
//TODO: phoneOwners.put(owner3, ...);
//TODO: phoneOwners.get(new PhoneOwner("ownerName")) -> {}

    public static void main (String[] args){

        Map<Owner, List<Phone>> phoneOwners = new HashMap<>();

        Owner alex = new Owner("Alex");
        Owner steve = new Owner("Steve");
        Owner beth = new Owner("Beth");


        List<Phone> apple = List.of(new Phone("Iphone 14 Pro Max"), new Phone("Iphone 13"));
        List<Phone> xiaomi = List.of(new Phone("Xiaomi 15"));
        List<Phone> huawei = List.of(new Phone ("Nova 12"));


        phoneOwners.put(alex, apple);
        phoneOwners.put(steve, xiaomi);
        phoneOwners.put(beth, huawei);




        System.out.println(phoneOwners.get(new Owner ("Alex")));
        System.out.println(phoneOwners.get(beth));
        System.out.println(phoneOwners.get(steve));



    }
}
