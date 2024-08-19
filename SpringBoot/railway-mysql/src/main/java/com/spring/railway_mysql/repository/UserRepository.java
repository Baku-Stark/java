package com.spring.railway_mysql.repository;

import com.spring.railway_mysql.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

