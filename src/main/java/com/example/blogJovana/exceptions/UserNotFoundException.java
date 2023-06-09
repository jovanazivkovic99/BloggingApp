package com.example.blogJovana.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserNotFoundException extends RuntimeException {

    private final String email;

    public UserNotFoundException(String email) {
        this.email = email;
    }
}
