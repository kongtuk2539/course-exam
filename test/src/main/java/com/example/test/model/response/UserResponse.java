package com.example.test.model.response;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class UserResponse {
    @Id
    @Column(name = "id")
    private Long id;
    private String firstname;
    private String lastname;
    private String phone;
}
