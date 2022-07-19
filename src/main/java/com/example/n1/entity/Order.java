package com.example.n1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
