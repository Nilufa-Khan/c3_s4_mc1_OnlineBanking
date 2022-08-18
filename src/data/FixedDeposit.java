package data;

public class FixedDeposit extends Account{
    private double fixedAmounts;
    private double maturityAmounts;
    private double rateOfInterest;
    private int noOfYears;

    public FixedDeposit(long accountNumber, String accountHolderName, double accountBalance, String accountStatus, double fixedAmounts, double maturityAmounts, double rateOfInterest, int noOfYears) {
        super(accountNumber, accountHolderName, accountBalance, accountStatus);
        this.fixedAmounts = fixedAmounts;
        this.maturityAmounts = maturityAmounts;
        this.rateOfInterest = rateOfInterest;
        this.noOfYears = noOfYears;
    }

    public double getFixedAmounts() {
        return fixedAmounts;
    }

    public void setFixedAmounts(double fixedAmounts) {
        this.fixedAmounts = fixedAmounts;
    }

    public double getMaturityAmounts() {
        return maturityAmounts;
    }

    public void setMaturityAmounts(double maturityAmounts) {
        this.maturityAmounts = maturityAmounts;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getNoOfYears() {
        return noOfYears;
    }

    public void setNoOfYears(int noOfYears) {
        this.noOfYears = noOfYears;
    }
    public double interestCalculation(){
        double response = 0;
        response = getFixedAmounts() + (getFixedAmounts() * getRateOfInterest()) / 100;
        return  response;
    }
    public  void display3(){
        System.out.println("fixedAmounts = " + fixedAmounts);
        System.out.println("maturityAmounts = " + maturityAmounts);
        System.out.println("rateOfInterest = " + rateOfInterest);
        System.out.println("noOfYears = " + noOfYears);
    }
}
