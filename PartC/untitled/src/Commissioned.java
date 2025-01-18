import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
    private double commission;
    private double baseSalary;
    private double totalSales;
    List<Order> orders;

    public Commissioned(int empid,double commission, double baseSalary) {
        super(empid);
        this.commission = commission;
        this.baseSalary = baseSalary;
      orders = new ArrayList<>();
    }

    private double CalculatetotalSales() {
        for (Order order : orders) {
            totalSales += order.orderAmount;
        }
        return totalSales;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return baseSalary + commission * CalculatetotalSales();
    }

}
