package com.yevhensynii.polinka.art.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ResponseOrder {
  private Long id;
  private String clientName;
  private String clientNumber;
  private String clientMessenger;
  private String photoLink;
  private String status;
}
