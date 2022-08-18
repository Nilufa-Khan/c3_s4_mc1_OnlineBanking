package data;

public class Account {
private long accountNumber;
private String accountHolderName;
private double accountBalance;
private String accountStatus;

    public Account(long accountNumber, String accountHolderName, double accountBalance, String accountStatus) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
    public void display1(){
        System.out.println("accountNumber = " + accountNumber);
        System.out.println("accountHolderName = " + accountHolderName);
        System.out.println("accountBalance = " + accountBalance);
        System.out.println("accountStatus = " + accountStatus);
    }
}
