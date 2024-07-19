public class UserService {
    private UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository(); // Instância criada diretamente
    }

    public void registerUser(String user) {
        userRepository.save(user);
    }
}