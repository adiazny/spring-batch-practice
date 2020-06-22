package io.diazstack.springbatchpractice.api.controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List> validationErrorHandler(MethodArgumentNotValidException ex) {
        List<String> errors = new ArrayList<>(ex.getBindingResult().getAllErrors().size());

        //Todo: Fix error handling sent back to client. Tip: Look at the method arguments within objectError
        ex.getBindingResult().getAllErrors().forEach(objectError -> {
            errors.add(objectError.getObjectName() + " : " + objectError.getCode() + " : " + objectError.getDefaultMessage());
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<List> bindExceptionHandler(BindException ex) {
        return new ResponseEntity<>(ex.getAllErrors(), HttpStatus.BAD_REQUEST);
    }

}
