package com.yevhensynii.polinka.art.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "feedback")
@Table(name = "pa_feedbacks")
public class FeedbackEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "feedback_message", nullable = false)
  private String feedbackMessage;

  @Column(name = "count_stars", nullable = false)
  private int countStar;

  @Column(name = "datetime_create")
  private ZonedDateTime dateTimeCreate;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private OrderEntity order;
}
