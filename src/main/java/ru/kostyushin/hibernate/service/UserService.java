package ru.kostyushin.hibernate.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kostyushin.hibernate.entity.User;
import ru.kostyushin.hibernate.entity.UserId;
import ru.kostyushin.hibernate.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public List<User> getPersonByCity(String city) {
        return userRepository.findByCity(city);
    }

    public List<User> getPersonsByAgeLessThanOrderBy(int age) {
        return userRepository.findByAgeLessThanOrderByAge(age);
    }

    public User getPersonByNameAndSurname(String name, String surname) {
        Optional<User> optionalPerson = userRepository.findByNameAndSurname(name, surname);
        return optionalPerson.get();
    }

    public User createPerson(User user) {
        return userRepository.save(user);
    }

    public User getPersonById(UserId id) {
        Optional<User> optionalPerson = userRepository.findById(id);
        return optionalPerson.get();
    }

    public User updatePerson(UserId id, User person) {
        Optional<User> optionalPerson = userRepository.findById(id);
        person.setUserId(id);
        return userRepository.save(person);
    }

    public void deletePersonById(UserId id) {
        userRepository.deleteById(id);
    }

}
