interface Command {
    void execute();
}

class AddToCartCommand implements Command {
    private Cart cart;
    private String product;

    public AddToCartCommand(Cart cart, String product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.addItem(product);
    }
}

class CheckoutCommand implements Command {
    private OrderProcessing orderProcessing;

    public CheckoutCommand(OrderProcessing orderProcessing) {
        this.orderProcessing = orderProcessing;
    }

    @Override
    public void execute() {
        orderProcessing.placeOrder();
    }
}

class CommandInvoker {
    public void executeCommand(Command command) {
        command.execute();
    }
}
