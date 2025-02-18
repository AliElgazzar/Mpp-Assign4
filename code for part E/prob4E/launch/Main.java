package prob4E.launch;

import java.util.ArrayList;
import java.util.List;

/** This class tests the code package */
public class Main {

	public static void main(String[] args) {
		Account[] someCheckingAccounts = new CheckingAccount[2];
		someCheckingAccounts[0] = new CheckingAccount(25.00, "231-471", 100);
		someCheckingAccounts[1] = new CheckingAccount(25.00, "446-973", 200);
		Account[] someSavingsAccounts = new SavingsAccount[3];
		someSavingsAccounts[0] = new SavingsAccount(0.03, 200, "44-8123");
		someSavingsAccounts[1] = new SavingsAccount(0.03, 200, "21-9672");
		someSavingsAccounts[2] = new SavingsAccount(0.04, 600, "68-0902");
		
		
		Employee e1 = new Employee("Joe");
		Employee e2 = new Employee("Ralph");
		Employee e3 = new Employee("Tom");
		
			e1.addAccount(someCheckingAccounts[0]);
			e1.addAccount(someSavingsAccounts[0]);
			e2.addAccount(someCheckingAccounts[1]);
			e2.addAccount(someSavingsAccounts[1]);
			e3.addAccount(someSavingsAccounts[2]);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		System.out.println("Total balance: "+Admin.computeUpdatedBalanceSum(employees)+" $");
		
		
	}

}
