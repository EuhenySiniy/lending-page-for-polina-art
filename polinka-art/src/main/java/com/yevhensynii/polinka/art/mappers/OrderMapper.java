package com.yevhensynii.polinka.art.mappers;

import com.yevhensynii.polinka.art.dto.OrderRequestDto;
import com.yevhensynii.polinka.art.dto.ResponseOrder;
import com.yevhensynii.polinka.art.dto.ResponseOrderForFeedback;
import com.yevhensynii.polinka.art.models.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "Spring",
  uses = {FeedbackMapper.class})
public interface OrderMapper {
  ResponseOrder toDto(OrderEntity orderEntity);

  OrderEntity toEntity(OrderRequestDto orderRequestDto);

  @Named("OrderForFeedback")
  ResponseOrderForFeedback toOrderForFeedback(OrderEntity orderEntity);
}
