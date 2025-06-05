package org.prog;

public class Session6HomeWork {
        public static void main(String[] args) {
            Plane plane1 = new Plane();

            plane1.flightId = "AA-101";
            plane1.currentPassengersSet = "15";
            plane1.maxPassengersSet = "100";
            System.out.println("flight ID: " + plane1.flightId
                    + " | currentPassengersSet: " + plane1.currentPassengersSet
                    + " | maxPassengersSet: " + plane1.maxPassengersSet);
            plane1.goTo("London");

        }
    }


