package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveStudents {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Jane", "Smith", 4.0));
        students.add(new Student("Alice", "Johnson", 2.8));
        students.add(new Student("Bob", "Williams", 3.2));

        double totalGpa = 0.0;
        for (Student student : students) {
            totalGpa += student.getGpa();
        }

        double averageGpa = totalGpa / students.size();

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGpa() < averageGpa) {
                iterator.remove();
            }
        }

        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " (GPA: " + student.getGpa() + ")");
        }
    }
}

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }
}
