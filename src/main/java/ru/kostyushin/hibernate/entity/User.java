package ru.kostyushin.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @EmbeddedId
    private UserId userId;
    @Column(name= "phone_number")
    private int phoneNumber;
    @Column(name = "city_of_living")
    private String cityOfLiving;
}
