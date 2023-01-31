package com.yevhensynii.polinka.art.mappers;

import com.yevhensynii.polinka.art.dto.FeedbackRequestDto;
import com.yevhensynii.polinka.art.dto.ResponseFeedback;
import com.yevhensynii.polinka.art.models.FeedbackEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring",
  uses = {OrderMapper.class})
public interface FeedbackMapper {
  @Mapping(target = "order")
  @Mapping(target = "order.clientName")
  @Mapping(target = "order.photoLink")
  ResponseFeedback toDto(FeedbackEntity feedbackEntity);

  FeedbackEntity toEntity(FeedbackRequestDto feedbackRequestDto);
}
