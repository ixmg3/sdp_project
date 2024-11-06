# E-Commerce System

## Project Overview
This e-commerce project is a Java-based application that demonstrates the use of various design patterns in building a modular, scalable, and maintainable system. Key functionalities include user management, browsing products, cart management, order processing, and notifications.

The goal of this project is to showcase the application of design patterns to solve real-world problems within an e-commerce system, with a focus on maintainability, scalability, and efficient resource management.

## Features
- **User Role Management**: Allows different user types (Customer, Seller, Admin) with unique roles.
- **Product Browsing**: Provides a simple interface for users to browse available products.
- **Cart and Order Management**: Enables users to add products to a cart, proceed to checkout, and place orders.
- **Payment Processing**: Integrates with third-party payment services.
- **Notifications**: Sends order updates and promotional notifications to customers.

## Design Patterns Used
### 1. **Singleton Pattern**
   - Ensures only one instance of the database connection exists, maintaining data consistency and optimizing resource use.
### 2. **Factory Method Pattern**
   - Centralizes user creation and management by creating user roles based on specific requirements.
### 3. **Facade Pattern**
   - Simplifies user interactions by providing a unified interface to perform product browsing, add-to-cart, and checkout operations.
### 4. **Adapter Pattern**
   - Bridges the gap between the e-commerce system and third-party payment services, enabling smooth integration.
### 5. **Observer Pattern**
   - Notifies users about order status updates and promotions, enhancing user experience and engagement.
### 6. **Command Pattern**
   - Encapsulates actions (e.g., adding items to the cart, checking out) as command objects, allowing flexibility in command execution and potential for undo functionality.

## System Architecture
The system uses a modular architecture with a **Facade** to simplify interactions with the core functionalities. A **Singleton** manages the database, and patterns like **Observer** and **Command** streamline notification and cart actions. This layered structure allows easy future updates and maintenance.

## Getting Started
### Prerequisites
- **Java 8 or higher** installed.
- **Git** for version control.

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/e-commerce-system.git
   ```
2. Navigate to the project directory:
   ```bash
   cd e-commerce-system
   ```
3. Compile the project:
   ```bash
   javac -d bin src/*.java
   ```
4. Run the application:
   ```bash
   java -cp bin Main
   ```

## Usage
### Main Functionalities
1. **User Creation**: Use the `UserFactory` to create different user roles.
2. **Browsing Products**: Use the `ECommerceFacade` to browse available products.
3. **Adding to Cart and Checkout**: Execute commands for cart management and order placement.
4. **Payment Processing**: Integrate with third-party payment services via the `PaymentAdapter`.
5. **Order and Promotion Notifications**: Observe real-time updates sent to customers.

### Example Code
```java
DatabaseConnection dbConnection = DatabaseConnection.getInstance();
ECommerceFacade ecommerceFacade = new ECommerceFacade();
User customer = UserFactory.createUser("Customer", "Alice");

ecommerceFacade.browseProducts();
ecommerceFacade.addToCart("Laptop");
ecommerceFacade.checkout();
```

## Assumptions and Limitations
- **Single Payment Provider**: Currently supports integration with only one payment provider.
- **Simple Product Catalog**: Assumes a small, static list of products for demonstration purposes.
- **No Persistence**: Data is not persisted to an actual database, as the database connection is simulated.

## Challenges and Lessons Learned
- **Challenges**: Ensuring the correct implementation of each design pattern and managing dependencies across modules.
- **Lessons Learned**: Gained experience in applying design patterns to create a modular, maintainable codebase and in balancing simplicity with functionality.

## Future Improvements
- **Persistence**: Add a real database layer to persist user, product, and order data.
- **Multiple Payment Integrations**: Extend the adapter pattern to support multiple payment providers.
- **User Interface**: Build a GUI or web interface for enhanced user experience.
