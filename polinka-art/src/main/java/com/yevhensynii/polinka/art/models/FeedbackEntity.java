package com.yevhensynii.polinka.art.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "feedback")
@Table(name = "pa_feedbacks")
public class FeedbackEntity {
  @Id
  @Column(name = "feedback_id")
  @SequenceGenerator(name = "id_sequence", sequenceName = "feedback_id_sequence", allocationSize = 1)
  @GeneratedValue(generator = "id_sequence")
  private Long id;

  @Column(name = "feedback_message", nullable = false)
  private String feedbackMessage;

  @Column(name = "count_stars", nullable = false)
  private int countStar;

  @ManyToOne
  @JoinColumn(name = "order_id", nullable = false)
  private OrderEntity order;
}
