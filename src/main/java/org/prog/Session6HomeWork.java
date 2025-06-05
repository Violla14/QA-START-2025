package org.prog;

public class Session6HomeWork {
        public static void main(String[] args) {
            Plane plane1 = new Plane();

            plane1.flightId = "AA-101";
            plane1.busyPassengersSets = "15";
            plane1.maxPassengersSets = "100";
            System.out.println("flight ID: " + plane1.flightId
                    + " | busyPassengersSet: " + plane1.busyPassengersSets
                    + " | maxPassengersSet: " + plane1.maxPassengersSets);
            plane1.goTo("London");

        }
    }


