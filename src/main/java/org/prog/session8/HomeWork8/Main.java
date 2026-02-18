package org.prog.session8.HomeWork8;


public class Main {
    public static void main(String[] args) {
        Apple phone1 = new Apple ( "white", "14 Pro Max");

        Apple phone2 = new Apple(null, "13 Pro" );

        Apple phone3 = new Apple("white", "14 Pro Max");

        Android phone4 = new Android("grey", "15 pro");

        Android phone5 = new Android("white", null);

        Android phone6 = new Android(null, null);

        Android phone7 = new Android("white", null);

        System.out.println("==============================================");

        phone1.workWith("Alex");
        phone2.workWith(null);
        phone3.workWith("Andrew");
        phone4.workWith("Daniel");
        phone5.workWith(null);
        phone6.workWith("Sandy");
        phone7.workWith("Joy");

        System.out.println("==============================================");

       System.out.println("Phone 1 equals Phone 2? " + phone1.equals(phone2));
        System.out.println("Phone 1 equals Phone 3? " + phone1.equals(phone3));
        System.out.println("Phone 1 equals Phone 4? " +  phone1.equals(phone4));
        System.out.println("Phone 1 equals Phone 5? " + phone1.equals(phone5));
        System.out.println("Phone 1 equals Phone 6? " + phone1.equals(phone6));
        System.out.println("Phone 1 equals Phone 7? " + phone1.equals(phone7));
        System.out.println("Phone 2 equals Phone 3? " + phone2.equals(phone3));
        System.out.println("Phone 2 equals Phone 4? " + phone2.equals(phone4));
        System.out.println("Phone 2 equals Phone 5? " + phone2.equals(phone5));
        System.out.println("Phone 2 equals Phone 6? " + phone2.equals(phone6));
        System.out.println("Phone 2 equals Phone 7? " + phone2.equals(phone7));
        System.out.println("Phone 3 equals Phone 4? " + phone3.equals(phone4));
        System.out.println("Phone 3 equals Phone 5? " + phone3.equals(phone5));
        System.out.println("Phone 3 equals Phone 6? " + phone3.equals(phone6));
        System.out.println("Phone 3 equals Phone 7? " + phone3.equals(phone7));
        System.out.println("Phone 4 equals Phone 5? " + phone4.equals(phone5));
        System.out.println("Phone 4 equals Phone 6? " + phone4.equals(phone6));
        System.out.println("Phone 4 equals Phone 7? " + phone4.equals(phone7));
        System.out.println("Phone 5 equals Phone 6? " + phone5.equals(phone6));
        System.out.println("Phone 5 equals Phone 7? " + phone5.equals(phone7));
        System.out.println("Phone 6 equals Phone 7? " + phone6.equals(phone7));
    }


}
