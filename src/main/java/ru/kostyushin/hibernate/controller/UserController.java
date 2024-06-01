package ru.kostyushin.hibernate.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kostyushin.hibernate.entity.User;
import ru.kostyushin.hibernate.entity.UserId;
import ru.kostyushin.hibernate.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @PostMapping("/create")
    public User createPerson(@RequestBody User person) {
        return userService.createPerson(person);
    }

    @PutMapping("/update/{id}")
    public User updatePerson(@PathVariable UserId id, @RequestBody User person) {
        return userService.updatePerson(id, person);
    }

    @GetMapping("/{id}")
    public User getPersonById(@PathVariable UserId id) {
        return userService.getPersonById(id);
    }

    @GetMapping("/delete/{id}")
    public void deletePersonById(@PathVariable UserId id) {
        userService.deletePersonById(id);
    }

    @GetMapping("/by-city")
    public List<User> getPersonByCity(@RequestParam String city) {
        return userService.getPersonByCity(city);
    }

    @GetMapping("/age-less-than")
    public List<User> getPersonByAgeLessThanOrderBy(@RequestParam int age) {
        return userService.getPersonsByAgeLessThanOrderBy(age);
    }

    @GetMapping("/by-name-and-surname")
    public User getPersonByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return userService.getPersonByNameAndSurname(name, surname);
    }
}
