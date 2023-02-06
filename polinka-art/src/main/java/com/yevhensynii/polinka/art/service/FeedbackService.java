package com.yevhensynii.polinka.art.service;

import com.yevhensynii.polinka.art.dto.FeedbackRequestDto;
import com.yevhensynii.polinka.art.dto.ResponseFeedback;

public interface FeedbackService {
  ResponseFeedback createFeedback(FeedbackRequestDto feedbackRequestDto);
}
