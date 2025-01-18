import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Hourly hourly = new Hourly(1 , 10, 40);
        Commissioned commissioned = new Commissioned(2, 0.1, 5000);
        Salaried salaried = new Salaried(3, 5000);
        Order order = new Order( 1000, "2025-01-01",1000);
        Order order1 = new Order( 1001, "2025-02-01",1000);
        commissioned.addOrder(order);
        commissioned.addOrder(order1);

        Employee[] employees = {hourly, commissioned, salaried};

        for (Employee employee : employees) {
            Paycheck paycheck = employee.calcCompensation(1, 2023);
            System.out.println(paycheck.print());

        }


    }
}