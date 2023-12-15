package com.example.weatherApp.exception;

import lombok.*;

@Getter
public class ApiException extends RuntimeException {
    private int code;
    private String details;


    public ApiException() {
        super();
    }

    public ApiException(int code, String details) {
        super();
        this.code = code;
        this.details = details;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "code=" + code +
                ", details='" + details + '\'' +
                '}';
    }
}
