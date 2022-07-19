package com.example.n1.repo;

import com.example.n1.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepo extends JpaRepository<Order, UUID> {
}
