class ProductCatalog {
    public void showProducts() {
        System.out.println("Displaying all products.");
    }
}

class Cart {
    public void addItem(String product) {
        System.out.println(product + " added to cart.");
    }
}

class OrderProcessing {
    public void placeOrder() {
        System.out.println("Order placed successfully.");
    }
}

class ECommerceFacade {
    private ProductCatalog catalog;
    private Cart cart;
    private OrderProcessing orderProcessing;

    public ECommerceFacade() {
        catalog = new ProductCatalog();
        cart = new Cart();
        orderProcessing = new OrderProcessing();
    }

    public void browseProducts() {
        catalog.showProducts();
    }

    public void addToCart(String product) {
        cart.addItem(product);
    }

    public void checkout() {
        orderProcessing.placeOrder();
    }
}
