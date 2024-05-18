package task2.point1;

class Sedan extends Car {

    private String fuelType;
    private int luxuryLevel;
    private int numberOfDoors;
    private int trunkCapacity;

    public Sedan(String fuelType, int luxuryLevel, int numberOfDoors, int trunkCapacity) {
        this.fuelType = fuelType;
        this.luxuryLevel = luxuryLevel;
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
    }

    public String getLuxuryLevel() {
        return "Luxury level = " + this.luxuryLevel;
    }

    @Override
    public void start() {
        System.out.println("Sedan start");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stop");
    }

    @Override
    public String getFuelType() {
        return this.fuelType;
    }

    @Override
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        return this.trunkCapacity;
    }
}
