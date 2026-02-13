package org.prog.session5.MoreExercise;

public class Airport {
    public String airportName;
    public Flight[] terminal;
    private String flightCode;

    public void processFlights() {
        System.out.println("Airport: " + airportName.toUpperCase());

        /**Bubble sort**/

        boolean condition = true;
        while (condition) {
            condition = false;

            for (int i = 1; i < terminal.length; i++) {
                if (terminal[i].passengers < terminal[i - 1].passengers) {
                    Flight people = terminal[i];
                    terminal[i] = terminal[i - 1];
                    terminal[i - 1] = people;
                    condition = true;

                }

            }

        }
        for (int i = 0; i < terminal.length; i++) {
            if (terminal[i].flightCode.startsWith("AF")) {
                System.out.println("AirFrance flight" + terminal[i].flightCode + "is ready");
            }
        }
    }
}

