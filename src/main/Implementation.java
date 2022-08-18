package main;

import data.FixedDeposit;
import data.SavingsAccount;

public class Implementation {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(234567891215L,"Rajat",50000,"Active",2.5);
        FixedDeposit fd = new FixedDeposit(2366784899299L,"Shagnik",60000,"Active",10000,10550,5.5,10);
        System.out.println("Dislaying savings class ");
        System.out.println();
        sa.display1();
        sa.display2();
        System.out.println();
        System.out.println("Displaying Fixed deposit class");
        System.out.println();
        fd.display3();
        fd.display1();
        System.out.println();
        System.out.println("Displaying methods ");
        System.out.println();
        System.out.println("Check Balance = " + sa.checkBalance());
        System.out.println("credit Balance = " + sa.creditBalance(5000));
        System.out.println("debit Balance = " + sa.debitBalance(3000));

        System.out.println("Yearly interest Calculation = " + fd.interestCalculation());

    }

}
