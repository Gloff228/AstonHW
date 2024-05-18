package task2.point1;

public class Runner {

    public static void main(String[] args) {
        Sedan sedan = new Sedan("95", 5, 4, 100);
        Truck truck = new Truck("92", 1000, 2, 10000);

        sedan.start();
        truck.start();
        sedan.stop();
        truck.stop();

        System.out.println("\nsedan fuel type = " + sedan.getFuelType());
        System.out.println(sedan.getLuxuryLevel());
        System.out.println("sedan number of doors = " + sedan.getNumberOfDoors());
        System.out.println("sedan trunk capacity = " + sedan.getTrunkCapacity());
        System.out.println();

        System.out.println("truck fuel type = " + truck.getFuelType());
        System.out.println(truck.getMaxLoadCapacity());
        System.out.println("truck number of doors = " + truck.getNumberOfDoors());
        System.out.println("truck trunk capacity = " + truck.getTrunkCapacity());

    }
}
