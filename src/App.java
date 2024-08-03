import edu.ramon.service.UserService;

public class App {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser("John Doe");
    }
}
