package by.it_academy.homework6.airline;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane(200, 97000, 60000, "Airbus А380");

        Airplane airplane2 = new Airplane(400, 80000, 13000, "Boeing747");

        Helicopter helicopter = new Helicopter(26, 14, 500, "Helicopter Mi-8");
        Quadcopter quadcopter = new Quadcopter(0, 2, 500, "Quadcopter DJI Mini 4 Pro");

        Aircraft[] aircrafts = new Aircraft[] {airplane1, airplane2, helicopter, quadcopter};
        Airline airline = new Airline(aircrafts);
        System.out.println("Total passenger capacity of aircraft is " + airline.getCommonCapacity() + " people." + "\n" + "Total aircraft payload capacity is " + airline.getCommonLiftingCapacity() + " kg");

        System.out.println(" ");

        int[] aircraft = airline.capacityOfParameters(100,500);
        System.out.println("Passenger capacity of aircraft corresponding to the specified parameters: " + Arrays.toString(aircraft));

        System.out.println(" ");

        int[] ranges = airline.getRange();
        Arrays.sort(ranges);
        System.out.println("Sorted indicators of the flight range of aircrafts: " + Arrays.toString(ranges));

        System.out.println(" ");

        System.out.println("Look and choose which aircraft meets the given parameters (passenger capacity, flight range): \n" + Arrays.toString(aircrafts));

    }
}
