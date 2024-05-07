package ru.kostyushin.hibernate.service;

import ru.kostyushin.hibernate.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kostyushin.hibernate.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public List<User> getPersonsByCity(String city) {
        return userRepository.getPersonsByCity(city);
    }
}
