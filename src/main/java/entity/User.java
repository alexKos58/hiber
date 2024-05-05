package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    private int phone_number;
    private String city_of_living;
}
