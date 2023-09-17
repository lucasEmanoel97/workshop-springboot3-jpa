package br.com.devlucassilva.workshop.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Long id) {
        super("Resource not found. Id " + id);
    }
}
