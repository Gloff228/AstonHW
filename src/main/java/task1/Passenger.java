package task1;

class Passenger extends Person {

    {
        System.out.println("The person has become a passenger.");
    }

    public Passenger() {
        super();
    }

    public Passenger(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSomething() {
        System.out.println("I'm waiting for the airplane");
    }
}
