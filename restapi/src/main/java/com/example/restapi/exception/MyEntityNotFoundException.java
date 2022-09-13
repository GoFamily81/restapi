package com.example.restapi.exception;

public class MyEntityNotFoundException extends RuntimeException {

    public MyEntityNotFoundException(Integer id) {
        super("User is not found, id=" + id);
    }
}
