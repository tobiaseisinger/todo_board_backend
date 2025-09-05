package com.tobiaseisinger.todoboardbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;

import java.util.Date;

import static org.hibernate.validator.internal.util.Contracts.assertTrue;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @Size(min = 1, max = 25)
    @NotNull
    private String username;

    @NotNull
    @Size(min = 8)
    private String password;

    @NotNull
    @Column(unique = true)
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    private String email;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    @PastOrPresent
    private Date creationDate;
}
