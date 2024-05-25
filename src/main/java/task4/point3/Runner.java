package task4.point3;

import java.util.HashSet;
import java.util.Set;

class Runner {

    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<>();

        Person person1 = new Person("Alex");
        Person person2 = new Person("Lev");
        Person person3 = new Person("Max");
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.forEach(person -> System.out.println(person));
        System.out.println();

        personSet.remove(person1);
        personSet.remove(person3);
        personSet.forEach(person -> System.out.println(person));

        System.out.println(personSet.contains(person2));
    }
}
