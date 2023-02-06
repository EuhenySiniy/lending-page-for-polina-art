package com.yevhensynii.polinka.art.mappers;

import com.yevhensynii.polinka.art.dto.FeedbackRequestDto;
import com.yevhensynii.polinka.art.dto.ResponseFeedback;
import com.yevhensynii.polinka.art.models.FeedbackEntity;

import com.yevhensynii.polinka.art.models.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "Spring",
  uses = {OrderMapper.class})
public interface FeedbackMapper {
  ResponseFeedback toResponseDto(FeedbackEntity feedback);

  @Mapping(target = "order.id", source = "orderId")
  FeedbackEntity toEntity(FeedbackRequestDto feedbackRequestDto);
}
