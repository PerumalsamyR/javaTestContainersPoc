package com.example.model;

import jakarta.persistence.*;
import org.springframework.data.elasticsearch.annotations.Document;

@Entity
@Table(name = "users")
@Document(indexName = "users") // Elasticsearch index
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
}
