import java.util.Scanner;
class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdraw(double amount) {
        if(balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount b1 = new BankAccount();
        b1.accountNumber = input.nextInt();
        input.nextLine();
        b1.accountHolder = input.nextLine();
        b1.balance = input.nextDouble();
        double depositAmount = input.nextDouble();
        b1.deposit(depositAmount);
        double withdrawAmount = input.nextDouble();
        b1.withdraw(withdrawAmount);
        b1.displayBalance();
    }
}