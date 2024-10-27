// Controller class that links the model and the view
public class UserController {
    private User user;
    private UserView view;

    public UserController(User user, UserView view) {
        this.user = user;
        this.view = view;
    }

    public void updateView() {
        view.displayUserInfo(user.getName(), user.getEmail());
    }
}
