package com.example.demo4.SecurityApp.repositories;

import com.example.demo4.SecurityApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
