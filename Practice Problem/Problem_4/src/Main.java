public class Main {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(50.00);

        MobileBankingPayment mobileBankingPayment = new MobileBankingPayment();
        mobileBankingPayment.processPayment(60.00);
    }
}