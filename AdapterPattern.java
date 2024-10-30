interface PaymentGateway {
    void processPayment(double amount);
}

class ThirdPartyPaymentService {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed by third-party service.");
    }
}

class PaymentAdapter implements PaymentGateway {
    private ThirdPartyPaymentService paymentService;

    public PaymentAdapter(ThirdPartyPaymentService service) {
        this.paymentService = service;
    }

    @Override
    public void processPayment(double amount) {
        paymentService.makePayment(amount);
    }
}
