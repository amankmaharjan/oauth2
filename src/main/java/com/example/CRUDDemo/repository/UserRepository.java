package com.example.CRUDDemo.repository;

import com.example.CRUDDemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String name);
}