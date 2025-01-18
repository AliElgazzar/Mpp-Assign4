public class Salaried extends Employee {
    private double salary;

    public Salaried(int empid, double salary) {
        super(empid);
        this.salary = salary;

    }

    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }
}
