
//***************************************************************
//
//  Developer:         Khue Nguyen
//
//  Program #:         9
//
//  File Name:         Program9.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          11/15/2021
//
//  Instructor:        Fred Kumi
//
//  Chapter:           9
//
//  Description:       Classes and Objects
//
//
//***************************************************************

public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    // Default Constructor
    public SavingsAccount()
    {
        this.savingsBalance = 0;
    }

    // Constructor
    public SavingsAccount(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }

    // This method calculates the monthly interest and adds it to the balance
    public void calculateMonthlyInterest()
    {
        double monthlyInterest;
        monthlyInterest = savingsBalance * (annualInterestRate/100) / 12;
        savingsBalance += monthlyInterest;
    }

    // This method allows the customer to deposit money into the account, thereby increasing the balance
    public double depositAmount(double deposit)
    {
        if (deposit < 0.0)
            throw new IllegalArgumentException("Deposit amount must be >= 0.0");
        savingsBalance += deposit;
        return savingsBalance;
    }

    public void displayDeposit(double deposit)
    {
        System.out.printf("%s:%4.2f%n%s:%4.2f%n", "Depositing", deposit, "New Balance", depositAmount(deposit));
    }

    public void displayWithdraw(double withdraw)
    {
        System.out.printf("%s:%4.2f%n%s:%4.2f%n", "Withdraw", withdraw, "New Balance", withdrawAmount(withdraw));
    }

    // This method allows the customer to withdraw money from the account, thereby decreasing the balance
    public double withdrawAmount(double withdraw)
    {
        if (withdraw < 0.0)
            throw new IllegalArgumentException("Withdraw amount must be >= 0.0");
        savingsBalance -= withdraw;
        return savingsBalance;
    }

    // This method allows the bank to change the annual interest rate. Accept only floating-point values between 2 and 5
    public static void modifyInterestRate(double newAnnualInterestRate)
    {
        if (newAnnualInterestRate < 2.0 || newAnnualInterestRate > 5.0)
            throw new IllegalArgumentException("Annual interest rate must be between 2.0 and 5.0");
        annualInterestRate = newAnnualInterestRate;
    }

    // This method get string representation of SavingsAccount object (prints the variable, savingsBalance)
    @Override // indicates that this method overrides a superclass method
    public String toString()
    {
        return String.format("%.2f%n", savingsBalance);
    }



}
