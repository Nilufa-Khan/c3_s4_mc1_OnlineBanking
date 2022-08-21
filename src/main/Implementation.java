package main;


import data.RecurringDeposit;
import data.SavingsAccount;

public class Implementation {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(234567891215L,"Rajat",50000,"Active","03/02/2022","Self",true,3);
        RecurringDeposit rd = new RecurringDeposit(34565657767766L,"Sanjana",5000,"Active","23/06/2022","Self",true,10000,14000,10,4);
        double res1 = sa.calculateInterest();
        System.out.println("Savings Account interest calculation = " + res1);
        double res2 = rd.calculateInterest();
        System.out.println("Reccuring deposit interest calculation = " + res2);
        System.out.println("Displaying Operations performed by savings account  ");
        System.out.println();
        System.out.println("Check Balance = " + sa.checkBalance());
        System.out.println("credit Balance = " + sa.creditBalance(5000));
        System.out.println("debit Balance = " + sa.debitBalance(3000));



    }

}
