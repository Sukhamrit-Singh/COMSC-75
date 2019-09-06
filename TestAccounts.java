//  Sukhamrit Singh
//  Test Accounts
/*
This program creates an array of five Account objects:

An Account number 1066 with a balance of $7,500.
A SavingsAccount number 30507 with a balance of $4,500
and an APR of 1.5%. A CreditCardAccount number 51782737
with a balance of $7,000.00, APR of 8%, and credit limit
of $1000.00. A CreditCardAccount number 629553328 with a
balance of $1,500.00, an APR of 7.5%, and a credit limit
of $5,000. A CreditCardAccount number 4977201043 with a
balance of -$5,000.00, an APR of 7%, and a credit limit
of $10,000. Your program will use a loop to do the following
for each account

Deposit $2,134.00
Withdraw $4,782.00
Print the account status using toString()
 */

//  Imports the necessary libraries
import java.util.List;
import java.util.ArrayList;

public class TestAccounts {
    public static void main(String[] args) {

        //  Defining the array for the accounts
        List<Account> accountsList = new ArrayList<Account>();

        //  Creating an account object and adding to the array
        accountsList.add(new Account(1066, 7500));

        //  Creating an account object and adding to the array
        accountsList.add(new SavingsAccount(30507,
                4500, 1.5));

        //  Creating an account object and adding to the array
        accountsList.add(new CreditCardAccount(51782737,
                7000, 8, 1000));

        //  Creating an account object and adding to the array
        accountsList.add(new CreditCardAccount(629553328,
                1500, 7.5, 5000));

        //  Creating an account object and adding to the array
        accountsList.add(new CreditCardAccount(4977201043L,
                -5000, 7, 10000));

        /*
          For loop to deposit and withdraw and print for each
          account object
         */
        for ( Account act : accountsList ) {
            act.deposit(2134);
            act.withdraw(4782);
            System.out.println(act.toString());
            System.out.println("");
        }
    }
}

//  Creating a new class
class Account {
    //  Defining two private variables
    private long number;
    private double balance;

    //  Creating no-argument constructor
    Account() {
        //  Setting values to variables
        this(0,0);
    }

    //  Creating two-parameter constructor
    Account(long number, double balance) {
        //  Setting values to variables
        this.number = number;
        this.balance = balance;
    }

    //  Creating getter and setters for variables
    public long getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    //  Method to deposit amounts of money
    void deposit(double amount) {
        if ( amount < 0 ) {
            // do nothing

        } else {
            // change the balance
            balance += amount;
        }
    }

    //  Method to withdraw amounts of money
    void withdraw(double amount) {
        if ( amount < 0 ) {
            // do nothing

        } else if ( amount > balance ) {
                // do nothing
        } else {
            // change the balance
            balance -= amount;
            }

    }
    //  Method to print the results
    public String toString() {
        String display = String.format(
                        "Account: %d\n" +
                        "Balance: $%.2f",
                this.getNumber(),
                this.getBalance());

        //  Returns display
        return display;
    }
}

//  Creating a new class so that other values such
//  as apr get added.
class SavingsAccount extends Account {
    //  Defining a new private variable
    private double apr;

    //  Creating no-argument constructor
    SavingsAccount() {
        super();
        this.apr = 0;
    }

    //  Creating a four-parameter constructor
    SavingsAccount (long number, double balance, double apr) {
        super(number, balance);
        this.apr = apr;
    }

    //  Creating getter and setter for variable
    public double getApr() {

        //  Returns apr
        return apr;
    }

    public void setApr(double apr) {
        if (apr < 0) {
            //  Do nothing

        } else {
            this.apr = apr;
        }
    }

    //  Method to calculate annual interest
    public double calculateInterest() {
        double interest = this.getBalance() * this.apr;

        interest /= 100;

        //  Returns interest
        return interest;
    }

    //  Method to print the results
    public String toString() {

        String display = String.format(
                        super.toString() + "\n" +
                        "Interest Rate: %.2f%%\n" +
                        "Annual Interest: $%.2f",
                this.apr,
                this.calculateInterest());

        //  Returns display
        return display;
    }
}

//  Creates a new class
class CreditCardAccount extends Account {
    //  Defining new private variables
    private double apr;
    private double creditLimit;

    //  Creating no-argument constructor
    CreditCardAccount() {
        super();
        this.apr = 0;
        this.creditLimit = 0;
    }

    //  Creating a four-parameter constructor
    CreditCardAccount(long number, double balance, double apr,
                      double creditLimit) {
        super(number, balance);
        this.apr = apr;
        this.creditLimit = creditLimit;
    }

    //  Overriding the withdraw method
    @Override
    void withdraw(double amount) {

        //  Creating a new variable
        double newBalance = this.getBalance() - amount;

        //  If statement to override the withdraw method
        if ( newBalance > 0 ) {
            // if money left in my balance, then do not touch credit line
            this.setBalance(newBalance);

        } else {
            /*
             if withdrawing more than account balance, then
             update credit
             */

            double newCredit = this.creditLimit + newBalance;
            if ( newCredit > this.creditLimit ) {
                // do nothing
            } else {
                this.setBalance(newBalance);
                //this.creditLimit = newCredit;
            }
        }
    }

    //  Method to calculate the monthly payments
    public double calculatePayment() {

        //  Creates a new variable
        double payment;

        //  If statement to calculate the monthly payments
        if ( this.getBalance() > 0 ) {
            // if positive balance, no payment due
            payment = 0;

        } else {
            // if negative balance

            double val = ( this.apr / 1200 ) * (this.getBalance() * -1);
            if ( val < 20 ) {
                payment = val;
            } else {
                payment = 20;
            }
        }

        //  Returns payment
        return payment;
    }

    //  Method to print the results
    public String toString() {
        String display = String.format(
                        super.toString() + "\n" +
                        "Interest Rate: %.2f%%\n" +
                        "Credit Limit: $%.2f\n" +
                        "Monthly Payment: $%.2f",
                this.apr,
                this.creditLimit,
                this.calculatePayment());

        //  Returns display
        return display;
    }
}

