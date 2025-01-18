package prob4E.launch;

public class CheckingAccount extends Account{

private double balance;
private String acctID;
private double monthlyFee;

public CheckingAccount(double balance,String acctID, double monthlyFee) {
    super();
    this.balance = balance;
    this.acctID = acctID;
    this.monthlyFee = monthlyFee;
}

    @Override
    public double computeUpdatedBalance()
    {

        return (balance - monthlyFee);

    }
    @Override
    public double getBalance()
    {
        return balance;
    }
    @Override
    public String getAccountID()
    {
        return acctID;
    }


}
