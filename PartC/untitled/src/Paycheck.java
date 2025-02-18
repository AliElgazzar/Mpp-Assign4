public class Paycheck {

    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;
    private double netPay;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity, double netPay) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        this.netPay = netPay;
    }

    public double getNetPay() {
        return netPay;
    }
 public String print() {

        return "Gross Pay: $" + grossPay + "\n" +
                "FICA: $" + fica + "\n" +
                "State: $" + state + "\n" +
                "Local: $" + local + "\n" +
                "Medicare: $" + medicare + "\n" +
                "Social Security: $" + socialSecurity + "\n" +
                "Net Pay: $" + getNetPay() + "\n";
    }

}