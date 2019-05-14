package com.company.classwork;

public class Account
{
    private String name;
    private double balance;


    public Account (String name, double balance) {  //setter for name and balance
        this.name = name;
        this.balance=balance;
    }

    public String getName() {  //getter for name
        return name;
    }

    public double getBalance() { //getter for balance
        return balance;
    }

    public void withdrawal(double withdrawal)  // withdrawal
    {
        balance=balance-withdrawal;
    }

    public void deposit(double deposit) // deposit
    {
        balance=balance+deposit;
    }

    public String toString()
    {
        String total=this.name+ " has a balance of $" +this.balance;
        return total;

    }

}
