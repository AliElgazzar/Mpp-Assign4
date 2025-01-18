public class Hourly extends Employee {


    private int hourlyWage;
    private int hoursPerWeek;

    public Hourly(int empid, int hourlyWage, int hoursPerWeek) {
        super(empid);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;

    }

    @Override
    public double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4; // Assuming 4 weeks per month
    }

}
