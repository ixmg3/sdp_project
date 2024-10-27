public class Main {
    public static void main(String[] args) {
        // 1. MVC Pattern
        System.out.println("=== MVC Pattern ===");
        User model = new User("Madi", "madi@astanait.edu.kz");
        UserView view = new UserView();
        UserController controller = new UserController(model, view);
        controller.updateView();
    }
}