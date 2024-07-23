package me.baku.java_api_spring_railway.repository;

import me.baku.java_api_spring_railway.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
