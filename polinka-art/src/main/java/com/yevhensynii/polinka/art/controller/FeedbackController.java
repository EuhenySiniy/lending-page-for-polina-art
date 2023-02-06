package com.yevhensynii.polinka.art.controller;

import com.yevhensynii.polinka.art.dto.FeedbackRequestDto;
import com.yevhensynii.polinka.art.dto.ResponseFeedback;
import com.yevhensynii.polinka.art.service.FeedbackService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/feedback")
public class FeedbackController {
  private final FeedbackService feedbackService;

  @PostMapping
  public ResponseFeedback createFeedback(@Valid @RequestBody FeedbackRequestDto feedbackRequestDto) {
    return feedbackService.createFeedback(feedbackRequestDto);
  }
}
