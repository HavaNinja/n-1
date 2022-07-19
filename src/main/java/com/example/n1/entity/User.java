package com.example.n1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    private UUID id;

    @OneToMany
    private List<Order> orders;
}
