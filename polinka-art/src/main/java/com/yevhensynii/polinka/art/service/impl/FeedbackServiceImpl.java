package com.yevhensynii.polinka.art.service.impl;

import com.yevhensynii.polinka.art.dto.FeedbackRequestDto;
import com.yevhensynii.polinka.art.dto.ResponseFeedback;
import com.yevhensynii.polinka.art.mappers.FeedbackMapper;
import com.yevhensynii.polinka.art.models.FeedbackEntity;
import com.yevhensynii.polinka.art.models.OrderEntity;
import com.yevhensynii.polinka.art.repo.FeedbackRepository;
import com.yevhensynii.polinka.art.repo.OrderRepository;
import com.yevhensynii.polinka.art.service.FeedbackService;
import com.yevhensynii.polinka.art.service.OrderService;
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
    feedback.setOrder(orderRepository.getOrderById(feedbackRequestDto.getOrderId()));

    feedbackRepository.save(feedback);
    return feedbackMapper.toResponseDto(feedback);
  }

  private boolean isFeedbackPresent(Long id) {
    return feedbackRepository.findById(id).isPresent();
  }
}
