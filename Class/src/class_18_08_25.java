import java.util.*;

class account{
    int accountNumber, balance;
    void deposit(int amount){
        this.balance += amount;
    }
    account(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class savingAccount extends account {
    double interestRate;

    savingAccount(int accountNumber, int balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void calculateYearlyInterest() {
        System.out.println("Total amount to be paid in $" + balance * (interestRate / 100));
    }
}
    public class class_18_08_25 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Account Number: ");
            int accountNumber = sc.nextInt();
            System.out.print("Enter Account Balance: $ ");
            int balance = sc.nextInt();
//            System.out.print("$");
            System.out.println();
            System.out.println("Enter Interest Rate: ");
            double interestRate = sc.nextDouble();
//            System.out.println("%");
            System.out.println();

            savingAccount sa = new savingAccount(accountNumber, balance, interestRate);
            sa.calculateYearlyInterest();

            System.out.println("Add money: ");
            int add = sc.nextInt();
            sa.deposit(add);

            sa.calculateYearlyInterest();

            sc.close();
        }
    }

