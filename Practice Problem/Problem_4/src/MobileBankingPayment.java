public class MobileBankingPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing mobile banking payment of $"+amount);
    }
}
