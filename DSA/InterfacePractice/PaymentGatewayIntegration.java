interface PaymentProcessor {
    void pay(double amount);
    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed.");
    }
}

class PayPal implements PaymentProcessor {
    public void pay(double amount) { System.out.println("Paid " + amount + " via PayPal"); }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor pp = new PayPal();
        pp.pay(500);
        pp.refund(200);
    }
}
