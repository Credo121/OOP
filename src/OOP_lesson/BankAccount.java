package OOP_lesson;

public class BankAccount {

    public String accountNumber;
    public double balance;
    public String ownerName;
    public double interestRate;

    public BankAccount(String accountNumber, double balance, String ownerName, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
        this.interestRate = interestRate;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }
    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
    public double addInterest(){
        balance += interestRate * balance;
        return balance;
    }

    public double getBalance() {
        return addInterest();
    }
}
