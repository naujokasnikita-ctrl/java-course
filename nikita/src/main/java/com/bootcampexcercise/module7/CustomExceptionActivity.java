package com.bootcampexcercise.module7;

// Extend this class from Exception class
public class CustomExceptionActivity extends Exception {
    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}


