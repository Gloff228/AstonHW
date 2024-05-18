package task2.point2;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Swimming");
        hobbies.add("Fishing");

        ImmutablePerson immutablePerson = new ImmutablePerson("John", 20, hobbies);
        MutablePerson mutablePerson = new MutablePerson("Sam", 35, hobbies);

        System.out.println("\nImmutablePerson");
        System.out.println(immutablePerson.getAge());
        System.out.println(immutablePerson.getName());
        System.out.println(immutablePerson.getHobbies());

        try {
            immutablePerson.getHobbies().add("Football");
        } catch (Exception e) {
            System.out.println("Data cannot be changed");
        }

        System.out.println("\nMutablePerson before data change");
        System.out.println(mutablePerson.getAge());
        System.out.println(mutablePerson.getName());
        System.out.println(mutablePerson.getHobbies());

        mutablePerson.getHobbies().add("Football");
        mutablePerson.setAge(10);
        mutablePerson.setName("Adam");

        System.out.println("\nMutablePerson after data change");
        System.out.println(mutablePerson.getAge());
        System.out.println(mutablePerson.getName());
        System.out.println(mutablePerson.getHobbies());

    }
}
