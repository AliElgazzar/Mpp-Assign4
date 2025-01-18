package prob4E.launch;

public class SavingsAccount extends Account {
private double balance;
    private double interestRate;
    private String acctID;

    public SavingsAccount( double interestRate, double balance,String acctID) {
        super();
        this.balance = balance;
        this.interestRate = interestRate;
        this.acctID = acctID;
    }

        @Override
        public double computeUpdatedBalance()
        {

         return   balance + (interestRate * balance);

        }
        @Override
        public String getAccountID()
        {

         return acctID;
        }
        @Override
        public double getBalance()
        {

         return balance;
        }
}
