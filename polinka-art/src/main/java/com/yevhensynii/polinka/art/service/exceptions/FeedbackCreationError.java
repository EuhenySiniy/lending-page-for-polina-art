package com.yevhensynii.polinka.art.service.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FeedbackCreationError extends RuntimeException {
  private String message;
}
