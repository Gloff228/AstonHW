package task9;

/**
 * Создает человека с именем, возрастом, адресом и адресом электронной почты.
 * Этот класс реализует паттерн Builder.
 */
class Person {

    // Обязательные поля
    private final String name;
    private final int age;

    // Необязательные поля
    private final String address;
    private final String email;

    // Конструктор, который доступен только через PersonBuilder
    private Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
        this.email = personBuilder.email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    // Builder класс
    public static class PersonBuilder {

        private final String name;
        private final int age;

        private String address;
        private String email;

        public PersonBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
