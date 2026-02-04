package org.prog.session6.HomeWork6;

import static org.prog.session6.HomeWork6.Trucks.truck;

public class Main {
    public static void main (String[] args){
        Cars car1 = new Cars();
        car1.owner = "Alex";
        car1.model = "Tesla";
        car1.plateNumber = "EL-7742-V";
        Cars car2 = new Cars();
        car2.owner = "Bob";
        car2.model = "BMW";
        car2.plateNumber = "B 789 RCM";
        Cars car3 = new Cars();
        car3.owner = "Nancy";
        car3.model = "Toyota";
        car3.plateNumber = "A 001 KKK";

        truck[0] = new Trucks();
        truck[0].owner = "Olov";
        truck[0].model = "Volvo";
        truck[0].plateNumber = "SE 902 TRK";
        truck[1] = new Trucks();
        truck[1].owner = "Harry";
        truck[1].model = "Scania";
        truck[1].plateNumber = "V9-POWER-01";
        truck[2] = new Trucks();
        truck[2].owner = "Volodya";
        truck[2].model = "Mercedes-Benz";
        truck[2].plateNumber = "DA 5521-7";

        String takeinfo = car1.info();
        System.out.println(takeinfo);
        takeinfo = car2.info();
        System.out.println(takeinfo);
        takeinfo = car3.info();
        System.out.println(takeinfo);

        takeinfo = truck[0].info();
        System.out.println(takeinfo);
        takeinfo = truck[1].info();
        System.out.println(takeinfo);
        takeinfo = truck[2].info();
        System.out.println(takeinfo);








    }
}
