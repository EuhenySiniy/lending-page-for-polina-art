package com.yevhensynii.polinka.art.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
public class FeedbackRequestDto implements Serializable {
  @NotBlank(message = "The field with the feedback cannot be empty")
  @Size(min = 2, max = 255, message = "The number of characters must be from 2 to 255")
  private String feedbackMessage;

  @Size(min = 1, max = 5)
  private int countStar;

  private Long orderId;
}
