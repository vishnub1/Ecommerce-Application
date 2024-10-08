package com.ecommerce.project.exceptions;

public class APIExcception extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public APIExcception() {}

    public APIExcception(String message) {
        super(message);
    }
}
