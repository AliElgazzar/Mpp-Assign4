package prob4E.launch;

import java.util.List;

public class Admin {
	private static double TotalBalance;
	public static double computeUpdatedBalanceSum(List<Employee> list) {

		for (Employee e : list) {
			TotalBalance += e.computeUpdatedBalanceSum();
		}
		return TotalBalance;
	}

}
