package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create teacher objects and instantiate them with IDs, names, and salaries.
        Teacher adam = new Teacher(1, "Adam", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);

        // Create a list to hold teacher objects.
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(adam);
        teacherList.add(melissa);

        // Create student objects and instantiate them with IDs, names, and grades.
        Student tamara = new Student(1, "Tamara", 7);
        Student jackson = new Student(2, "Jackson", 12);

        // Create a list to hold student objects.
        List<Student> studentList = new ArrayList<>();
        studentList.add(tamara);
        studentList.add(jackson);

        // Instantiate the School object with the lists of teachers and students.
        School rhs = new School(teacherList, studentList);

        // Simulate students paying their tuition fees.
        tamara.payFees(5000);
        jackson.payFees(6000);
        
        // Display the total money earned by the school from tuition fees.
        System.out.println("RHS has earned " + rhs.getTotalMoneyEarned() +" from tuition. ");

        // Display the process of the school paying salaries to teachers.
        System.out.println("---Making RHS pay salary---");
        adam.receiveSalary(adam.getSalary());
        System.out.println("RHS has paid the salary to " +adam.getName()
                + " a salary of "+adam.getSalary());
        // Display the updated total money earned by the school.
        System.out.println("RHS now has made "+rhs.getTotalMoneyEarned());

        // Display information about a student and a teacher.
        System.out.println(tamara);
        System.out.println(adam);
    }
}
