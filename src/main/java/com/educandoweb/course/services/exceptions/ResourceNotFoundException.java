package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Object id) {
        super("Resoruce not found" + id);
    }
}
