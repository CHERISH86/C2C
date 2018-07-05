package com.example.c2c.Dao;

import com.example.c2c.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByName(String name);
}

