package com.yevhensynii.polinka.art.repo;

import com.yevhensynii.polinka.art.models.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<FeedbackEntity, Long> {
  @Query(value = "select * from pa_feedbacks where order_id = ?", nativeQuery = true)
  FeedbackEntity getFeedbackEntitiesByOrderId(Long id);
}
