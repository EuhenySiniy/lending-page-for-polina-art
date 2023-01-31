package com.yevhensynii.polinka.art.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class ResponseOrder {
  private Long id;
  private String clientName;
  private int clientNumber;
  private String photoLink;
  private ZonedDateTime dateTimeCreate;
  private ZonedDateTime dateTimeModify;
  private String status;
}
