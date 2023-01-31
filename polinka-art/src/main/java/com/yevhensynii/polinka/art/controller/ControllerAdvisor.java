package com.yevhensynii.polinka.art.controller;

import com.yevhensynii.polinka.art.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
  private ResponseEntity<ErrorResponse> getErrorResponseEntity(Exception e, HttpStatus status) {
    logger.error(e.getMessage(), e);
    return new ResponseEntity<>(
        new ErrorResponse(
            e.getClass().getSimpleName(),
            LocalDateTime.now(),
            status.value(),
            e.getMessage()
        ),
        status
    );
  }
}
