package task1;

import java.util.ArrayList;
import java.util.List;

class Airplane {

    static {
        System.out.println("The first flight of an airplane in history was carried out on December 17, 1903");
    }

    {
        System.out.println("New aircraft created");
    }

    private String model;
    private List<Passenger> passengers = new ArrayList<>();

    public Airplane() {
    }

    public Airplane(String model) {
        this.model = model;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void addPassenger(String name, int age) {
        Passenger newPassenger = new Passenger(name, age);
        this.passengers.add(newPassenger);
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }

    public void removePassenger(String passengerName) {
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(passengerName)) {
                passengers.remove(passenger);
                break;
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
