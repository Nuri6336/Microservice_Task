package com.nuri.DepartmentService.exception;

public class CustomException extends Exception {

    private  String message;
    public CustomException(String message) {
        super(message);
    }
}
