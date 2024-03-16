package school.management.system;

import java.util.List;

public class School {

    private List<Teacher> teachers; // We use a List to allow flexibility in the number of teachers/students.
    private List<Student> students; // ArrayList is chosen for its dynamic resizing capabilities.

    private static int totalMoneyEarned; // Total income earned by the school.
    private static int totalMoneySpent; // Total expenditure on teacher salaries.

    /**
     * Constructs a School object with specified lists of teachers and students.
     * @param teachers The list of teachers in the school.
     * @param students The list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    // Getter and setter methods

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }
}
