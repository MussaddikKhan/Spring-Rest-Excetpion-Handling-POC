package com.practice.ExceptionHandling.ExceitpionHandlingPOC.ExceptionPractice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class StudentNotFoundExeception extends  RuntimeException{

    public StudentNotFoundExeception(String message) {
        super(message);
    }

    public StudentNotFoundExeception(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundExeception(Throwable cause) {
        super(cause);
    }
}
