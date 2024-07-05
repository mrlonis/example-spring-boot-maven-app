package com.mrlonis.example.exception;

public class NotAuthenticatedException extends RuntimeException {
    public NotAuthenticatedException() {
        super("User not authenticated");
    }
}
