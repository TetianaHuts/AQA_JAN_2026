package org.prog.session5.MoreExercise;

public class Main {
    public static void main(String[] args) {
        Flight.allFlights[0] = new Flight();
        Flight.allFlights[0].flightCode = "LH 4022";
        Flight.allFlights[0].passengers = 150;

        Flight.allFlights[1] = new Flight();
        Flight.allFlights[1].flightCode = "EK 241";
        Flight.allFlights[1].passengers = 260;

        Flight.allFlights[2] = new Flight();
        Flight.allFlights[2].flightCode = "TK 1589";
        Flight.allFlights[2].passengers = 300;

        Flight.allFlights[3] = new Flight();
        Flight.allFlights[3].flightCode = "AF 7311";
        Flight.allFlights[3].passengers = 120;

        String name;
        Airport boryspil = new Airport();
        boryspil.airportName = "Boryspil";
        boryspil.terminal = new Flight[4];
for (int i = 0; i < Flight.allFlights.length; i++){
    boryspil.terminal[i] = Flight.allFlights [i];
}
boryspil.processFlights();

        }
    }


