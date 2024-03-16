package school.management.system;

public class Student {

    private int id;
    private int feesTotal; // Total fees to be paid by the student.
    private String name;
    private int grade;
    private int feesPaid; // Total fees already paid by the student.

    /**
     * Constructs a new Student object.
     * @param id The student's ID.
     * @param name The student's name.
     * @param grade The student's grade.
     */
    public Student(int id, String name, int grade) {
        feesPaid = 0;
        feesTotal = 30000; // Initial total fees set to 30,000.
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getter and setter methods

    public void setGrade(int grade) { // Update student's grade.
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * Records the payment of fees by the student.
     * @param fees The amount of fees paid by the student.
     */
    public void payFees(int fees) {
        feesPaid += fees; // Increment the total fees paid by the amount paid.
        School.updateTotalMoneyEarned(feesPaid); // Update the total money earned by the school.
    }

    /**
     * Calculates the remaining fees to be paid by the student.
     * @return The remaining fees to be paid by the student.
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid; // Calculate the remaining fees by subtracting fees already paid from total fees.
    }

    @Override
    public String toString() {
        return "Student's name: " + name +
                " Total fees paid so far: $" + feesPaid;
    }
}
