package com.example.n1.repo;

import com.example.n1.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
}
