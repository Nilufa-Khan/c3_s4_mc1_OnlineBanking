package data;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(long accountNumber, String accountHolderName, double accountBalance, String accountStatus, double interestRate) {
        super(accountNumber, accountHolderName, accountBalance, accountStatus);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double checkBalance(){
        return getAccountBalance();
    }
    public double creditBalance(double creditAmount){
        return getAccountBalance()+ creditAmount;
    }
    public double debitBalance(double debitAmount){
        return getAccountBalance() - debitAmount;
    }
    public void display2(){
        System.out.println("interestRate = " + interestRate);
    }
}
