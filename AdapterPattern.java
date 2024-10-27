
class LegacyPaymentProcessor {
    public void payAmount(double amount) {
        System.out.println("Paying " + amount + " using legacy system.");
    }
}

interface PaymentProcessor {
    void processPayment(double amount);
}

class PaymentAdapter implements PaymentProcessor {
    private LegacyPaymentProcessor legacyProcessor;

    public PaymentAdapter(LegacyPaymentProcessor legacyProcessor) {
        this.legacyProcessor = legacyProcessor;
    }

    @Override
    public void processPayment(double amount) {
        legacyProcessor.payAmount(amount);
    }
}
