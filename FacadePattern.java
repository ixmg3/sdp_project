class OrderProcessor {
    public void processOrder() {
        System.out.println("Order processed.");
    }
}

class PaymentGateway {
    public void processPayment() {
        System.out.println("Payment processed.");
    }
}

class ShippingService {
    public void shipProduct() {
        System.out.println("Product shipped.");
    }
}

class ECommerceFacade {
    private OrderProcessor orderProcessor;
    private PaymentGateway paymentGateway;
    private ShippingService shippingService;

    public ECommerceFacade() {
        orderProcessor = new OrderProcessor();
        paymentGateway = new PaymentGateway();
        shippingService = new ShippingService();
    }

    public void placeOrder() {
        orderProcessor.processOrder();
        paymentGateway.processPayment();
        shippingService.shipProduct();
    }
}
