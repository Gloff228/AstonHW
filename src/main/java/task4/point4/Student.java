package task4.point4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Student {

    private final String name;
    private final String group;
    private Integer course;
    private final Map<String, Double> grades;

    public Student(String name, String group, Integer course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, Double grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Invalid grade: " + grade);
        }
        this.grades.put(subject, grade);
    }

    public void removeGrade(String subject) {
        this.grades.remove(subject);
    }

    public void setGrade(String subject, Double newGrade) {
        if (!this.grades.containsKey(subject)) {
            throw new IllegalArgumentException("Subject not found: " + subject);
        }
        if (newGrade < 2 || newGrade > 5) {
            throw new IllegalArgumentException("Invalid grade: " + newGrade);
        }
        this.grades.replace(subject, newGrade);
    }

    public void upgradeCourse() {
        this.course++;
    }

    public Double getAvgGrade() {
        Double gradesSum = 0.0;
        Collection<Double> values = this.grades.values();
        for (Double value : values) {
            gradesSum += value;
        }
        return gradesSum / values.size();
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Integer getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{name=" + this.name + ", group=" + this.group + ", course=" + this.course + "}";
    }
}
