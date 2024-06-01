package ru.kostyushin.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kostyushin.hibernate.entity.User;
import ru.kostyushin.hibernate.entity.UserId;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, UserId> {
    List<User> findByCity(String city);

    List<User> findByAgeLessThanOrderByAge(int age);

    Optional<User> findByNameAndSurname(String name, String surname);
}
