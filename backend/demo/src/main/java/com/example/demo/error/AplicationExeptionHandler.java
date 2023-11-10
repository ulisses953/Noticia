package com.example.demo.error;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AplicationExeptionHandler extends ResponseEntityExceptionHandler{
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity hadlerException (Exception ex){
        return new ResponseEntity(new DefaltError("Exception",ex.getMessage(),404,new Date()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IdNotFoundInDatabase.class)
    public ResponseEntity hadlerException (IdNotFoundInDatabase ex){
        return new ResponseEntity(new DefaltError("Exception",ex.getMessage(),404,new Date()), HttpStatus.NOT_FOUND);
    }
    
}
