package repo;

import entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @PersistenceContext
    private EntityManager manager;

    public List<User> getPersonsByCity(String city) {
        return manager.createQuery("SELECT u FROM User u WHERE u.city_of_living = :city")
                .setParameter("city",city).getResultList();
    }
}
