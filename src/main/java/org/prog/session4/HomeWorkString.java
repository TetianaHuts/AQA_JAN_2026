package org.prog.session4;

//TODO: print only correct emails
// Correct email rules:
// - at least 3 symbols before @
// - only @ symbol
// - full domain name (must have at least one ".")


public class HomeWorkString {

    public static void main(String[] args) {
        String[] emails = new String[]{
                "abcdefg@gmail.com", //+
                "a@gmail.com", //-
                "josh@@gmail.com", //-
                "janegmail.com", // -
                "pete@gmail.com", //+
                "zoe@gmailcom", //-
                "steve@outlook.com", //+
                "abcd@a.a", //+
                "abcd.a@fakemail" //-
        };

        System.out.println("\r\n" + "Using Continue" + "\r\n");
            for (int i = 0; i < emails.length; i++) {
                int first = emails[i].indexOf("@");
                int last = emails[i].lastIndexOf("@");
                int dot = emails[i].lastIndexOf(".");
                if ( first != last) {
                   continue;
                }
                if (emails[i].indexOf("@") < 3) {
                    continue;
                }
                if (first < dot){
                    System.out.println(emails[i]);
                }
                }
            System.out.println("\r\n" + "Using \"&&\""+ "\r\n");
        for (int i = 0; i < emails.length; i++) {
            int first = emails[i].indexOf("@");
            int last = emails[i].lastIndexOf("@");
            int dot = emails[i].lastIndexOf(".");
            if ( first == last && emails[i].indexOf("@") > 3 && first < dot) {
                System.out.println(emails[i]);

        }
        }
            }
        }


