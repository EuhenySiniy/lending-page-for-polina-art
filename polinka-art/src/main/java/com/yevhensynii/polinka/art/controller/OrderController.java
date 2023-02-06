package com.yevhensynii.polinka.art.controller;

import com.yevhensynii.polinka.art.dto.OrderRequestDto;
import com.yevhensynii.polinka.art.dto.ResponseOrder;
import com.yevhensynii.polinka.art.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {
  private final OrderService orderService;

  @PostMapping
  public ResponseOrder createOrder(@Valid @RequestBody OrderRequestDto order) {
    return orderService.createOrder(order);
  }
}
