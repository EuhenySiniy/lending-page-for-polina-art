package com.yevhensynii.polinka.art.dto;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
public class OrderRequestDto implements Serializable {
  @Size(min = 2, max = 32)
  @Pattern(regexp = "^[A-Z][a-z]*(?:[- ][a-zA-Z][a-z]*)*$", message = "Incorrect user name")
  private String clientName;

  @Pattern(regexp = "^((\\+?)([0-9]*))$", message = "The phone number should be like: +1**********")
  private String clientNumber;

  @Pattern(regexp = "^[A-z][a-z]*(?:[- ][a-zA-Z][a-z]*)*$", message = "Incorrect messenger")
  private String clientMessenger;

  private String photoLink;
}
