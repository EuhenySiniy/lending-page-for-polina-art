package com.yevhensynii.polinka.art.service;

import com.yevhensynii.polinka.art.dto.OrderRequestDto;
import com.yevhensynii.polinka.art.dto.ResponseOrder;

public interface OrderService {
  ResponseOrder createOrder(OrderRequestDto order);
}
