package com.yevhensynii.polinka.art.service.impl;

import com.yevhensynii.polinka.art.dto.OrderRequestDto;
import com.yevhensynii.polinka.art.dto.ResponseOrder;
import com.yevhensynii.polinka.art.mappers.OrderMapper;
import com.yevhensynii.polinka.art.models.OrderEntity;
import com.yevhensynii.polinka.art.repo.OrderRepository;
import com.yevhensynii.polinka.art.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

  private final OrderRepository orderRepository;
  private final OrderMapper orderMapper;

  @Override
  @Transactional
  public ResponseOrder createOrder(OrderRequestDto orderDto) {
    OrderEntity order = orderMapper.toEntity(orderDto);
    order.setStatus(OrderEntity.Status.NEW.toString());

    orderRepository.save(order);
    return orderMapper.toDto(order);
  }
}
