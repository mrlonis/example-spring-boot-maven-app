package com.mrlonis.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "user_details")
@Getter
@Setter
public class UserDetails {
    @Id
    @Column
    private Long id;

    @Column
    private String username;

    @Column
    private String firstName;

    @Column
    private String lastName;
}
