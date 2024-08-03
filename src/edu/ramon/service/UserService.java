package edu.ramon.service;
import edu.ramon.repository.UserRepository;

public class UserService {
    final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository(); // Instância criada diretamente
    }

    public void registerUser(String user) {
        userRepository.save(user);
    }
}
