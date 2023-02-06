package com.yevhensynii.polinka.art.dto;

import com.yevhensynii.polinka.art.models.OrderEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

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

  @Positive
  @NotNull
  private Long orderId;
}
