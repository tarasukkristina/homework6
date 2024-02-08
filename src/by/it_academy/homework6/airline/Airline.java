package by.it_academy.homework6.airline;

import java.util.Arrays;

public class Airline {

    private Aircraft[] aircrafts;

    public Airline(Aircraft[] aircrafts) {
        this.aircrafts = aircrafts;
    }

    public int getCommonCapacity() {
        int sumCapacity = 0;
        for (Aircraft aircraft : aircrafts) {
            sumCapacity += aircraft.getCapacity();
        }
        return sumCapacity;
    }

    public int getCommonLiftingCapacity() {
        int sumLifCapacity = 0;
        for (Aircraft aircraft : aircrafts) {
            sumLifCapacity += aircraft.getLiftingCapacity();
        }
        return sumLifCapacity;
    }

    public int[] capacityOfParameters(int minCapacity, int maxCapacity) {
        int[]  arrayCapacityOfParameters = new int[aircrafts.length];
        int i = 0;
        for (Aircraft aircraft : aircrafts) {
            if (aircraft.getCapacity() <= maxCapacity && aircraft.getCapacity() >= minCapacity) {
                arrayCapacityOfParameters[i] = aircrafts[i].getCapacity();
                i++;
            }
        }
        return arrayCapacityOfParameters;
    }

    public int[] getRange() {
        int[] ranges = new int[aircrafts.length];  //массив значений дальность полета
        for (int i=0; i < ranges.length; i++) {
           ranges[i] = aircrafts[i].getRangeOfFlight();
        }
        return ranges;
    };

    @Override
    public String toString() {
        return  Arrays.toString(aircrafts);

    }


}


