abstract public class Payment {
    abstract void processPayment(double amount);
    public void paymentSuccess() {
        System.out.println("Payment completed successfully!");
    }
}
