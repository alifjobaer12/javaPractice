package MID_EXAM.Q3;

public class HomeLoan implements Loan{
    double principal, time;

    @Override
    public void displayLoanDetails() {
        System.out.println("Home Loan");
    }
    @Override
    public void calculateInterest() {
        double interest = (principal*0.08*time);
        System.out.println("Home Loan: $" + (interest+principal));
    }

    public HomeLoan(double principal, double time){
        this.principal = principal;
        this.time = time;
    }
}
