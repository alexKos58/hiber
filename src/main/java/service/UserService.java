package service;

import entity.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getPersonsByCity(String city) {
        return userRepository.getPersonsByCity(city);
    }
}
