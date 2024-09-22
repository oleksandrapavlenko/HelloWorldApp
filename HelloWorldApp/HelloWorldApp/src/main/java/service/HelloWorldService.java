package service;

import model.User;
import repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HelloWorldService {

    @Autowired
    private UserRepository userRepository;

    public String getGreeting() {
        User user = userRepository.getDefaultUser();
        LocalDateTime currentTime = LocalDateTime.now();
        return "Привіт! Ім'я: " + user.getName() + " " + user.getSurname() + "Час відповіді: " + currentTime;
    }
}
