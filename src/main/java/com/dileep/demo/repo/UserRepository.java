package com.dileep.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dileep.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}