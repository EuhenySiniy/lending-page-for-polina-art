package com.yevhensynii.polinka.art.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
public class ResponseFeedback implements Serializable {
  private Long id;
  private String feedbackMessage;
  private int countStar;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private ResponseOrderForFeedback order;
}
