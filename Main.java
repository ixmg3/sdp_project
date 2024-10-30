public class Main {
    public static void main(String[] args) {
        // 1. MVC Pattern
        System.out.println("=== MVC Pattern ===");
        User model = new User("Madi", "madi@astanait.edu.kz");
        UserView view = new UserView();
        UserController controller = new UserController(model, view);
        controller.updateView();

        // Singleton: Get a single database connection
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        // Factory Method: Create users
        EUser customer = UserFactory.createUser("Customer", "Alice");
        EUser seller = UserFactory.createUser("Seller", "Bob");
        customer.displayRole();
        seller.displayRole();

        // Facade: Simplified e-commerce interactions
        ECommerceFacade facade = new ECommerceFacade();
        facade.browseProducts();
        facade.addToCart("Laptop");
        facade.checkout();

        // Adapter: Payment integration with a third-party service
        ThirdPartyPaymentService thirdPartyService = new ThirdPartyPaymentService();
        PaymentGateway payment = new PaymentAdapter(thirdPartyService);
        payment.processPayment(150.00);

        // Observer: Notification system for customers
        NotificationService notificationService = new NotificationService();
        Observer customerObserver = new CustomerObserver("Alice");
        notificationService.addObserver(customerObserver);
        notificationService.notifyObservers("Your order has been shipped!");

        // Command: Managing cart and checkout actions
        Cart cart = new Cart();
        OrderProcessing orderProcessing = new OrderProcessing();
        Command addToCartCommand = new AddToCartCommand(cart, "Smartphone");
        Command checkoutCommand = new CheckoutCommand(orderProcessing);
        CommandInvoker invoker = new CommandInvoker();
        invoker.executeCommand(addToCartCommand);
        invoker.executeCommand(checkoutCommand);
    }
}