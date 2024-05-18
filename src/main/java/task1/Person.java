package task1;

class Person {

    {
        System.out.println("Hello, new Person!");
    }

    private String name;
    private int age;
    public String hobby;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void doSomething() {
        System.out.println("I can walk");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "{name=" + this.name + ", age=" + this.age + "}";
    }
}
