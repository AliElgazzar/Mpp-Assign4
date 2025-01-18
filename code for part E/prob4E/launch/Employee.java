package prob4E.launch;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;
	private double TotalBalance;
	public Employee(String name) {
		this.name = name;
		accounts = new ArrayList<>();
	}

	public String GetName() {

		return name;
	}

	public void addAccount(Account a) {
		accounts.add(a);
	}


	public double computeUpdatedBalanceSum()
	{

		for (Account a : accounts) {

			TotalBalance += a.computeUpdatedBalance();

		}
          return  TotalBalance;
	}

}
