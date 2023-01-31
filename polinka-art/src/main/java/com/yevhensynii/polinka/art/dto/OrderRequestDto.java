package com.yevhensynii.polinka.art.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
public class OrderRequestDto implements Serializable {
  @NotBlank
  @Size(min = 2, max = 32)
  @Pattern(regexp = "^[A-Z][a-z]*(?:[- ][a-zA-Z][a-z]*)*$", message = "Incorrect user name")
  private String clientName;

  @Pattern(regexp = "^[0-9]*$", message = "The phone number must contain only digits")
  private int clientNumber;

  private String photoLink;
}
