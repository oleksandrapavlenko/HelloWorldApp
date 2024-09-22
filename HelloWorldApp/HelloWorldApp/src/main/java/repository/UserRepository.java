package repository;

import model.User;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public User getDefaultUser() {
        return new User("Oleksandra", "Pavlenko");
    }
}
