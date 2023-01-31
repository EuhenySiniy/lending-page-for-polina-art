package com.yevhensynii.polinka.art.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
public class OrderRequestDto implements Serializable {
  private String clientName;
  private int clientNumber;
  private String photoLink;
}
