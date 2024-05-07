package ru.kostyushin.hibernate.repository;

import ru.kostyushin.hibernate.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @PersistenceContext
    private EntityManager manager;

    public List<User> getPersonsByCity(String city) {
        return manager.createQuery("SELECT u FROM User u WHERE u.cityOfLiving = :city")
                .setParameter("city",city).getResultList();
    }
}
