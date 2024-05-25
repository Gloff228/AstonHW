package task4.point4;

import java.util.ArrayList;
import java.util.List;

class Runner {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Alex", "1", 1);
        student1.addGrade("History", 3.0);
        student1.addGrade("PE", 2.2);
        students.add(student1);

        Student student2 = new Student("Lev", "2", 2);
        student2.addGrade("History", 5.0);
        student2.addGrade("PE", 4.2);
        students.add(student2);

        Student student3 = new Student("Max", "3", 1);
        student3.addGrade("History", 4.0);
        student3.addGrade("PE", 4.2);
        students.add(student3);

        System.out.println("\nBefore check:");
        University.printStudents(students, 1);
        University.printStudents(students, 2);

        University.checkStudentGrades(students);

        System.out.println("\nAfter check:");
        University.printStudents(students, 2);
        University.printStudents(students, 3);
    }
}
