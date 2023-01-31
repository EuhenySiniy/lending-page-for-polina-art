package com.yevhensynii.polinka.art.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class ResponseFeedback implements Serializable {
  private Long id;
  private String feedbackMessage;
  private int countStar;
  private String clientName;
  private String photoLink;
  private ResponseOrder order;
}
