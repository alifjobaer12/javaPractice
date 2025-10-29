package lab5;

import java.util.Scanner;

interface OnLinePayment {
    void generateReceipt ();
}

interface OffLinePayment {
    void generateReceipt ();
}

class PaymentProcessor implements OffLinePayment, OnLinePayment {
    double amount;
    String status;
    @Override
    public void generateReceipt () {
        if(amount > 10000 && status.equals("Card") ) {
//            double t = amount / 100 * 2;
            this.amount += amount / 100 * 2;
            System.out.println("Online Card Success\n\t"+amount);
        } else if(amount < 100 && status.equals("UPI") ) {
            System.out.println("Online UPI Rejected\n\t"+amount);
        } else if (amount>20000 && status.equals("Cash")) {
            System.out.println("Offline Cash Rejected\n\t"+amount);
        } else if (status.equals("Cheque")) {
            System.out.println("3 Days Delay\n\t");
        }
        else if(amount >= 100 && status.equals("UPI") ) {
            System.out.println("Online UPI Success\n"+amount);
        } else if (amount <= 10000 && status.equals("Card") ) {
            System.out.println("Online Card Rejected\n"+amount);
        }
        else if (amount<=20000 && status.equals("Cash")) {
            System.out.println("Offline Cash Success\n"+amount);
        }
        else {
            System.out.println("Rejected Payment");
        }
    }
    PaymentProcessor(double amount, String status) {
        this.amount = amount;
        this.status = status;
    }
}

public class Lab_5_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount : ");
        double n = sc.nextDouble();
        System.out.print("Enter Status : ");
        String s = sc.next();
        PaymentProcessor p = new PaymentProcessor(n, s);
        p.generateReceipt();
        sc.close();
    }
}
