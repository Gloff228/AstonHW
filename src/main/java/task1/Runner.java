package task1;

public class Runner {

    public static void main(String[] args) {
        Person person = new Person("Sam", 15);
        person.hobby = "Fishing";
        System.out.println("Hobby - " + person.hobby);

        Passenger passenger1 = new Passenger("Jack", 20);
        Passenger passenger2 = new Passenger();
        passenger2.setAge(30);
        passenger2.setName("Daniel");

        System.out.println(passenger1.getAge() + " - " + passenger1.getName());
        System.out.println(passenger2.getAge() + " - " + passenger2.getName());

        passenger2.doSomething();

        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane("2");
        airplane1.setModel("1");

        airplane1.addPassenger(passenger1);
        airplane1.addPassenger(passenger2);
        airplane1.addPassenger("Dan", 40);
        System.out.println(airplane1.getPassengers());

        airplane1.removePassenger(passenger1);
        System.out.println(airplane1.getPassengers());

        airplane1.removePassenger("Daniel");
        System.out.println(airplane1.getPassengers());
    }
}
