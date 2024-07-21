package com.example.personnelService.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ExceptionHandler(NotFoundException.class)
  public Map<String, String> handleNoSuchElementException(NotFoundException exception) {
    Map<String, String> errorResponse = new HashMap<>();
    errorResponse.put("message", exception.getMessage());
    return errorResponse;
  }
}
