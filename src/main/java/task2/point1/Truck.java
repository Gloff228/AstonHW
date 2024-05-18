package task2.point1;

class Truck extends Car {

    private String fuelType;
    private int maxLoadCapacity;
    private int numberOfDoors;
    private int trunkCapacity;

    public Truck(String fuelType, int maxLoadCapacity, int numberOfDoors, int trunkCapacity) {
        this.fuelType = fuelType;
        this.maxLoadCapacity = maxLoadCapacity;
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
    }

    public String getMaxLoadCapacity() {
        return "max load capacity = " + this.maxLoadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck start");
    }

    @Override
    public void stop() {
        System.out.println("Truck stop");
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
