package com.yevhensynii.polinka.art.mappers;

import com.yevhensynii.polinka.art.dto.ResponseOrder;
import com.yevhensynii.polinka.art.models.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "Spring",
  uses = {FeedbackMapper.class})
public interface OrderMapper {

}
