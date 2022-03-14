package com.country_mvc.src.main.java.com.cognizant.springlearn.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Country Not Found")
public class CountryNotFoundException extends RuntimeException {
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
