package ru.kostyushin.hibernate.controller;

import ru.kostyushin.hibernate.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kostyushin.hibernate.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<User> getProduct(@RequestParam("city") String city) {
        return userService.getPersonsByCity(city);
    }
}
