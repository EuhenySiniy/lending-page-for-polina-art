package com.yevhensynii.polinka.art.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ResponseOrderForFeedback {
  private Long id;
  private String clientName;
  private String photoLink;
}
