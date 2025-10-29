package MID_EXAM.Q3;

public class CarLoan implements Loan {
    private double principal, time;
    public CarLoan(double principal, double time){
        this.principal = principal;
        this.time = time;
    }

    @Override
    public void displayLoanDetails() {
        System.out.println("Car Loan");
    }

    @Override
    public void calculateInterest() {
        double interest = (principal*0.10*time);
        System.out.println("Car Loan: $" + (interest+principal));
    }
}
