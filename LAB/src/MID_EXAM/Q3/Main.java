package MID_EXAM.Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double time = sc.nextDouble();

        CarLoan cl = new CarLoan(principal, time);
        cl.displayLoanDetails();
        cl.calculateInterest();

        HomeLoan hl = new HomeLoan(principal, time);
        hl.displayLoanDetails();
        hl.calculateInterest();
    }
}
