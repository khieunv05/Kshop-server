package com.vti.kshop.Exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;
@Getter
@Setter
public class ErrorResponse {
    private String timestamp = LocalDateTime.now().toString();
    private String message;

    private HashMap<String,String> errors;

    public ErrorResponse(String message) {
        this.message = message;
        this.errors=null;
    }

    public ErrorResponse(String message, HashMap<String, String> errors) {
        this.message = message;
        this.errors = errors;
    }
}
