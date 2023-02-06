package com.yevhensynii.polinka.art.service.impl;

import com.yevhensynii.polinka.art.dto.FeedbackRequestDto;
import com.yevhensynii.polinka.art.dto.ResponseFeedback;
import com.yevhensynii.polinka.art.mappers.FeedbackMapper;
import com.yevhensynii.polinka.art.models.FeedbackEntity;
import com.yevhensynii.polinka.art.models.OrderEntity;
import com.yevhensynii.polinka.art.repo.FeedbackRepository;
import com.yevhensynii.polinka.art.repo.OrderRepository;
import com.yevhensynii.polinka.art.service.FeedbackService;
import com.yevhensynii.polinka.art.service.exceptions.FeedbackCreationError;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {
  private final FeedbackRepository feedbackRepository;
  private final FeedbackMapper feedbackMapper;
  private final OrderRepository orderRepository;

  @Override
  public ResponseFeedback createFeedback(FeedbackRequestDto feedbackRequestDto) {
    FeedbackEntity feedback = feedbackMapper.toEntity(feedbackRequestDto);
    if (isFeedbackPresent(feedbackRequestDto.getOrderId())) {
      throw new FeedbackCreationError("Feedback has already been left");
    }
    feedback.setOrder(orderRepository.findById(feedbackRequestDto.getOrderId())
        .orElseThrow(() -> new EntityNotFoundException(
            "Order with id: " + feedbackRequestDto.getOrderId() + " wasn't found")
        ));
    OrderEntity order = feedback.getOrder();
    if (OrderEntity.Status.valueOf(order.getStatus()) != OrderEntity.Status.FINISHED) {
      throw new FeedbackCreationError("The order has not yet completed");
    }

    feedbackRepository.save(feedback);
    return feedbackMapper.toResponseDto(feedback);
  }

  private boolean isFeedbackPresent(Long orderId) {
    return feedbackRepository.getFeedbackEntitiesByOrderId(orderId) != null;
  }
}
