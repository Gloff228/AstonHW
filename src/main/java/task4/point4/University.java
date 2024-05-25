package task4.point4;

import java.util.ArrayList;
import java.util.List;

class University {

    public static void checkStudentGrades(List<Student> students) {
        if (students.isEmpty()) throw new IllegalArgumentException("Empty students list");
        List<Student> studentsToRemove = new ArrayList<>();
        students.forEach(student -> {
            if (student.getAvgGrade() >= 3) {
                student.upgradeCourse();
            } else {
                studentsToRemove.add(student);
            }
        });

        students.removeAll(studentsToRemove);
    }

    public static void printStudents(List<Student> students, int course) {
        students.forEach(student -> {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        });
    }
}
