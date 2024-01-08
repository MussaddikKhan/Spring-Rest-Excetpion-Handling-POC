package com.practice.ExceptionHandling.ExceitpionHandlingPOC.ExceptionPractice;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController
{

    @GetMapping("/get/{id}")
    public Student find(@PathVariable Integer id) throws Exception {
        List<Student> students = new ArrayList<>(); 
        Student s1 = new Student(1, "Musaddik", "Musaddik@gmail.com");
        Student s2 = new Student(2, "john", "john@gmail.com");
        Student s3 = new Student(3, "merry", "Musaddik@gmail.com");
        students.add(s1);
        students.add(s2);
        students.add(s3);

        if(students.size() <= id || id < 0)   {
//             throw new StudentNotFoundExeception("Student Not Found - " + id);
            throw new StudentNotFoundExeception("Student Not Found - " + id);
        }
        return students.get(id);
    }

    // Add Exception Handler using @ExceptionHandler
    // It works but can't be used for other controllers

//    @ExceptionHandler
//    public  ResponseEntity<StudentErrorResponse> handleExcption(StudentNotFoundExeception exc){
//        StudentErrorResponse errorResponse = new StudentErrorResponse();
//        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());  // Value not found;
//
//        errorResponse.setMessage(exc.getMessage());
//        errorResponse.setTimeStamp(System.currentTimeMillis());
//
//        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
//
//    }
//    @ExceptionHandler
//    public  ResponseEntity<StudentErrorResponse> handleExcption(Exception exc){
//        StudentErrorResponse errorResponse = new StudentErrorResponse();
//        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
//        errorResponse.setMessage(exc.getMessage());
//        errorResponse.setTimeStamp(System.currentTimeMillis());
//        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
//    }

}

