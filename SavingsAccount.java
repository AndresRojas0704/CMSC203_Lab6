/*
 * Class: CMSC203 30313
 * Instructor: Dr.Grinberg
 * Description: Subclasses of the class BankAccount
 * Due: 04/14/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Andres Rojas Pradilla
*/
public class SavingsAccount extends BankAccount {
	private double rate = 0.025;  
    private int savingsNumber = 0; 
    private String accountNumber; 

    // Constructor
    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    // Deposits one month's interest into the account. 
    public void postInterest() {
        double monthlyInterest = getBalance() * (rate / 12);
        deposit(monthlyInterest);
    }

    // Overrides getAccountNumber to return the subspecific account number.
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    // Copy constructor
    public SavingsAccount(SavingsAccount original, double initialBalance) {
        super(original, initialBalance);
        this.savingsNumber = original.savingsNumber + 1;
        this.rate = original.rate;
        accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }

}
