package by.it_academy.homework6.airline;

public abstract class Aircraft {
    private int capacity; // вместимость
    private int liftingCapacity;  //грузоподъемность
    private int rangeOfFlight; // дальность полета
    private String name;


    public Aircraft(int capacity, int liftingCapacity, int rangeOfFlight, String name) {
        this.capacity = capacity;
        this.liftingCapacity = liftingCapacity;
        this.rangeOfFlight = rangeOfFlight;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(int rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    @Override
    public String toString() {
        return name + ": passanger capacity - " + capacity + " people,  range of flight - " + rangeOfFlight + " km" + "\n";
    }
}
