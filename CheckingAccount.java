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
public class CheckingAccount extends BankAccount {
	// Fee for clearing one check (15 cents)
    public static final double FEE = 0.15;

    // Constructor with -10
    public CheckingAccount(String name, double initialAmount) {
        super(name, initialAmount);
        setAccountNumber(getAccountNumber() + "-10");
    }

    // Override withdraw: adds the fee then calls the superclass withdraw.
    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount + FEE);
    }
}
