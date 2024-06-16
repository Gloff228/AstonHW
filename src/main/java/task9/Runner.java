package task9;

class Runner {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John", 25)
                .address("Gagarinskiy Pereulok, 41, Moscow, Russia 15097")
                .email("john@mail.ru")
                .build();

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Email: " + person.getEmail());

        Person personWithoutAddress = new Person.PersonBuilder("Sam", 18)
                .email("sam@gmail.com")
                .build();

        System.out.println("\nName: " + personWithoutAddress.getName());
        System.out.println("Age: " + personWithoutAddress.getAge());
        System.out.println("Address: " + personWithoutAddress.getAddress());
        System.out.println("Email: " + personWithoutAddress.getEmail());
    }
}
