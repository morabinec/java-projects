package school.management.system;

/**
 * This class represents a teacher, storing their ID, name, and salary.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Constructs a new Teacher object with the specified ID, name, and salary.
     * @param id The teacher's ID.
     * @param name The teacher's name.
     * @param salary The teacher's salary.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    // Getter and setter methods

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds the received salary to the total salary earned by the teacher.
     * Deducts the salary from the total money spent by the school.
     * @param salary The amount of salary received by the teacher.
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name: " + name +
                " Total salary earned so far: $" + salaryEarned;
    }
}
