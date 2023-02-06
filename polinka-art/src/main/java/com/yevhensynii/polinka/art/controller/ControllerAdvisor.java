package com.yevhensynii.polinka.art.controller;

import com.yevhensynii.polinka.art.dto.ErrorResponse;
import com.yevhensynii.polinka.art.service.exceptions.FeedbackCreationError;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.support.WebExchangeBindException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
  @ExceptionHandler({EntityNotFoundException.class})
  public ResponseEntity<?> handleModelPersistenceException(Exception e) {
    return getErrorResponseEntity(e, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler({FeedbackCreationError.class, WebExchangeBindException.class})
  public ResponseEntity<?> handleModelIncorrectRequestException(Exception e) {
    return getErrorResponseEntity(e, HttpStatus.BAD_REQUEST);
  }

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
